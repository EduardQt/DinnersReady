package se.hkr.dinnersready.api.rest;

import android.os.Build;

import androidx.annotation.RequiresApi;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.Closeable;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import se.hkr.dinnersready.api.parsers.JsonParser;
import se.hkr.dinnersready.api.rest.responses.InvalidLoginResponse;

public class RestClient implements Closeable {

    private final DefaultHttpClient httpClient;
    private HttpRequestBase request;
    private List<NameValuePair> parameters;

    public RestClient() {
        this.httpClient = new DefaultHttpClient();
    }

    public RestClient setupPost() {
        this.request = new HttpPost();
        return this;
    }

    public RestClient setupGet() {
        this.request = new HttpGet();
        return this;
    }

    public RestClient addHeader(String key, String value) {
        this.request.addHeader(key, value);
        return this;
    }

    public RestClient addParameter(String key, String value) {
        if (this.parameters == null) this.parameters = new ArrayList<>();

        this.parameters.add(new BasicNameValuePair(key, value));
        return this;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void execute(String url, Consumer<String> onSuccess, Consumer<String> onError) {
        new Thread(() -> {
            try {
                URIBuilder uriBuilder = new URIBuilder(url);
                if (parameters != null) uriBuilder.addParameters(this.parameters);
                this.request.setURI(uriBuilder.build());

                HttpResponse response = this.httpClient.execute(this.request);
                HttpEntity httpEntity = response.getEntity();
                String jsonData = EntityUtils.toString(httpEntity);
                System.out.println(jsonData);
                Header header = response.getFirstHeader("Status");

                switch (header.getValue()) {
                    case "success":
                        onSuccess.accept(jsonData);
                        break;
                    case "error":
                        onError.accept(jsonData);
                        break;
                }
            } catch (URISyntaxException e) {
                e.printStackTrace();
            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    @Override
    public void close() throws IOException {
        this.httpClient.close();
    }
}
