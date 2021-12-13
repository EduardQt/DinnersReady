package se.hkr.dinnersready;

import static se.hkr.dinnersready.R.layout.activity_main;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    public int counter;
    Button button;
    ConstraintLayout layout;
    TimePicker timePicker;
    TimePicker seconds;
    @RequiresApi(api = Build.VERSION_CODES.P)




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView time=(TextView)findViewById(R.id.time);
        TextView timeReflect=(TextView)findViewById(R.id.timeReflect);



        timePicker=(TimePicker) findViewById(R.id.timepicker);
        seconds=(TimePicker) findViewById(R.id.seconds);

        timePicker.setIs24HourView(true);
        seconds.setIs24HourView(true);
        timePicker.setBackgroundColor(Color.BLACK);
        seconds.setBackgroundColor(Color.BLACK);



        layout=(ConstraintLayout) findViewById(R.id.layout) ;
        button= (Button) findViewById(R.id.button);
        ImageView arrow=(ImageView)findViewById(R.id.arrow);
        ImageView arrow2=(ImageView)findViewById(R.id.arrow2);
        ImageView arrow3=(ImageView)findViewById(R.id.arrow3);
        ImageView arrow4=(ImageView)findViewById(R.id.arrow4);
        ImageView arrow5=(ImageView)findViewById(R.id.arrow5);
        ImageView arrow6=(ImageView)findViewById(R.id.arrow6);
        ImageView arrow7=(ImageView)findViewById(R.id.arrow7);
        ImageView arrow8=(ImageView)findViewById(R.id.arrow8);
        ImageView arrow9=(ImageView)findViewById(R.id.arrow9);
        ImageView arrow10=(ImageView)findViewById(R.id.arrow10);

        ImageView arrow11=(ImageView)findViewById(R.id.arrow11);
        ImageView arrow12=(ImageView)findViewById(R.id.arrow12);
        ImageView arrow13=(ImageView)findViewById(R.id.arrow13);
        ImageView arrow14=(ImageView)findViewById(R.id.arrow14);
        ImageView arrow15=(ImageView)findViewById(R.id.arrow15);
        ImageView arrow16=(ImageView)findViewById(R.id.arrow16);
        ImageView arrow17=(ImageView)findViewById(R.id.arrow17);
        ImageView arrow18=(ImageView)findViewById(R.id.arrow18);
        ImageView arrow19=(ImageView)findViewById(R.id.arrow19);
        ImageView arrow20=(ImageView)findViewById(R.id.arrow20);

        ImageView arrow21=(ImageView)findViewById(R.id.arrow21);
        ImageView arrow22=(ImageView)findViewById(R.id.arrow22);
        ImageView arrow23=(ImageView)findViewById(R.id.arrow23);
        ImageView arrow24=(ImageView)findViewById(R.id.arrow24);
        ImageView arrow25=(ImageView)findViewById(R.id.arrow25);
        ImageView arrow26=(ImageView)findViewById(R.id.arrow26);
        ImageView arrow27=(ImageView)findViewById(R.id.arrow27);
        ImageView arrow28=(ImageView)findViewById(R.id.arrow28);
        ImageView arrow29=(ImageView)findViewById(R.id.arrow29);
        ImageView arrow30=(ImageView)findViewById(R.id.arrow30);

        ImageView arrow31=(ImageView)findViewById(R.id.arrow31);
        ImageView arrow32=(ImageView)findViewById(R.id.arrow32);
        ImageView arrow33=(ImageView)findViewById(R.id.arrow33);
        ImageView arrow34=(ImageView)findViewById(R.id.arrow34);
        ImageView arrow35=(ImageView)findViewById(R.id.arrow35);
        ImageView arrow36=(ImageView)findViewById(R.id.arrow36);
        ImageView arrow37=(ImageView)findViewById(R.id.arrow37);
        ImageView arrow38=(ImageView)findViewById(R.id.arrow38);
        ImageView arrow39=(ImageView)findViewById(R.id.arrow39);
        ImageView arrow40=(ImageView)findViewById(R.id.arrow40);

        ImageView arrow41=(ImageView)findViewById(R.id.arrow41);
        ImageView arrow42=(ImageView)findViewById(R.id.arrow42);
        ImageView arrow43=(ImageView)findViewById(R.id.arrow43);
        ImageView arrow44=(ImageView)findViewById(R.id.arrow44);
        ImageView arrow45=(ImageView)findViewById(R.id.arrow45);
        ImageView arrow46=(ImageView)findViewById(R.id.arrow46);
        ImageView arrow47=(ImageView)findViewById(R.id.arrow47);
        ImageView arrow48=(ImageView)findViewById(R.id.arrow48);
        ImageView arrow49=(ImageView)findViewById(R.id.arrow49);
        ImageView arrow50=(ImageView)findViewById(R.id.arrow50);

        ImageView arrow51=(ImageView)findViewById(R.id.arrow51);
        ImageView arrow52=(ImageView)findViewById(R.id.arrow52);
        ImageView arrow53=(ImageView)findViewById(R.id.arrow53);
        ImageView arrow54=(ImageView)findViewById(R.id.arrow54);
        ImageView arrow55=(ImageView)findViewById(R.id.arrow55);
        ImageView arrow56=(ImageView)findViewById(R.id.arrow56);
        ImageView arrow57=(ImageView)findViewById(R.id.arrow57);
        ImageView arrow58=(ImageView)findViewById(R.id.arrow58);
        ImageView arrow59=(ImageView)findViewById(R.id.arrow59);
        ImageView arrow60=(ImageView)findViewById(R.id.arrow60);

        ImageView tick1 = (ImageView) findViewById(R.id.tick1);
        ImageView tick2 = (ImageView) findViewById(R.id.tick2);
        ImageView tick3 = (ImageView) findViewById(R.id.tick3);
        ImageView  tick4 = (ImageView) findViewById(R.id.tick4);
        ImageView  tick5 = (ImageView) findViewById(R.id.tick5);
        ImageView  tick6 = (ImageView) findViewById(R.id.tick6);
        ImageView  tick7 = (ImageView) findViewById(R.id.tick7);
        ImageView  tick8 = (ImageView) findViewById(R.id.tick8);
        ImageView tick9 = (ImageView) findViewById(R.id.tick9);
        ImageView tick10 = (ImageView) findViewById(R.id.tick10);
        ImageView tick11 = (ImageView) findViewById(R.id.tick11);
        ImageView tick12 = (ImageView) findViewById(R.id.tick12);
        ImageView tick13 = (ImageView) findViewById(R.id.tick13);
        ImageView tick14 = (ImageView) findViewById(R.id.tick14);
        ImageView tick15 = (ImageView) findViewById(R.id.tick15);
        ImageView  tick16 = (ImageView) findViewById(R.id.tick16);
        ImageView  tick17 = (ImageView) findViewById(R.id.tick17);
        ImageView  tick18 = (ImageView) findViewById(R.id.tick18);
        ImageView  tick19 = (ImageView) findViewById(R.id.tick19);
        ImageView  tick20 = (ImageView) findViewById(R.id.tick20);
        ImageView  tick21 = (ImageView) findViewById(R.id.tick21);
        ImageView tick22 = (ImageView) findViewById(R.id.tick22);
        ImageView tick23 = (ImageView) findViewById(R.id.tick23);
        ImageView tick24 = (ImageView) findViewById(R.id.tick24);


        layout.setBackgroundColor(Color.BLACK);
        timeReflect.setTextColor(0xFF00201e);
        time.setTextColor(0xFFc1fefb);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                button.setVisibility(View.INVISIBLE);

                tick1.setColorFilter(0xFF00201e);
                tick2.setColorFilter(0xFF00201e);
                tick3.setColorFilter(0xFF00201e);
                tick4.setColorFilter(0xFF00201e);
                tick5.setColorFilter(0xFF00201e);
                tick6.setColorFilter(0xFF00201e);
                tick7.setColorFilter(0xFF00201e);
                tick8.setColorFilter(0xFF00201e);
                tick9.setColorFilter(0xFF00201e);
                tick10.setColorFilter(0xFF00201e);
                tick11.setColorFilter(0xFF00201e);
                tick12.setColorFilter(0xFF00201e);
                tick13.setColorFilter(0xFF00201e);
                tick14.setColorFilter(0xFF00201e);
                tick15.setColorFilter(0xFF00201e);
                tick16.setColorFilter(0xFF00201e);
                tick17.setColorFilter(0xFF00201e);
                tick18.setColorFilter(0xFF00201e);
                tick19.setColorFilter(0xFF00201e);
                tick20.setColorFilter(0xFF00201e);
                tick21.setColorFilter(0xFF00201e);
                tick22.setColorFilter(0xFF00201e);
                tick23.setColorFilter(0xFF00201e);
                tick24.setColorFilter(0xFF00201e);

                timePicker.getHour();
                timePicker.getMinute();
                timePicker.getMinute();
                int hour = timePicker.getCurrentHour();
                int minute = timePicker.getCurrentMinute();
                int second=seconds.getCurrentMinute();


                int millis=((hour*60*60)+(minute*60)+(second))*1000;

                counter=0;
                new CountDownTimer(millis, 1000) {
                    public void onTick(long millisUntilFinished) {

                        counter++;
                        int rounded=(int)Math.round(counter);
                        int seconds=((rounded%86400)%3600)%60;
                        int minutes=((rounded%86400)%3600)/60;
                        int hours=((rounded%86400)/3600);

                        timeReflect.setText(" "+String.valueOf(hours)+":"+String.valueOf(minutes)+","+String.valueOf(seconds));
                        time.setText(" "+String.valueOf(hours)+":"+String.valueOf(minutes)+","+String.valueOf(seconds));





                        if (counter == 1) {
                            arrow.setVisibility(View.VISIBLE);
                            arrow.setColorFilter(0xFFc1fefb);

                        }
                        if (counter == 2) {
                            arrow.setVisibility(View.INVISIBLE);
                            arrow2.setVisibility(View.VISIBLE);
                            arrow2.setColorFilter(0xFFc1fefb);

                        }
                        if (counter == 3) {
                            tick1.setColorFilter(0xFF00302e);
                            arrow2.setVisibility(View.INVISIBLE);
                            arrow3.setVisibility(View.VISIBLE);
                            arrow3.setColorFilter(0xFFc1fefb);

                        }
                        if (counter == 4) {
                            arrow3.setVisibility(View.INVISIBLE);
                            arrow4.setVisibility(View.VISIBLE);
                            arrow4.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 5) {
                            arrow4.setVisibility(View.INVISIBLE);
                            arrow5.setVisibility(View.VISIBLE);
                            arrow5.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 6) {
                            tick2.setColorFilter(0xFF00302e);
                            arrow5.setVisibility(View.INVISIBLE);
                            arrow6.setVisibility(View.VISIBLE);
                            arrow6.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 7) {
                            arrow6.setVisibility(View.INVISIBLE);
                            arrow7.setVisibility(View.VISIBLE);
                            arrow7.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 8) {
                            tick3.setColorFilter(0xFF004945);
                            arrow7.setVisibility(View.INVISIBLE);
                            arrow8.setVisibility(View.VISIBLE);
                            arrow8.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 9) {

                            arrow8.setVisibility(View.INVISIBLE);
                            arrow9.setVisibility(View.VISIBLE);
                            arrow9.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 10) {
                            tick4.setColorFilter(0xFF009b92);
                            arrow9.setVisibility(View.INVISIBLE);
                            arrow10.setVisibility(View.VISIBLE);
                            arrow10.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 11) {
                            arrow10.setVisibility(View.INVISIBLE);
                            arrow11.setVisibility(View.VISIBLE);
                            arrow11.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 12) {

                            arrow11.setVisibility(View.INVISIBLE);
                            arrow12.setVisibility(View.VISIBLE);
                            arrow12.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 13) {
                            tick5.setColorFilter(0xFF009b92);
                            arrow12.setVisibility(View.INVISIBLE);
                            arrow13.setVisibility(View.VISIBLE);
                            arrow13.setColorFilter(0xFFc1fefb);
                        }

                        if (counter == 14) {

                            arrow13.setVisibility(View.INVISIBLE);
                            arrow14.setVisibility(View.VISIBLE);
                            arrow14.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 15) {

                            arrow14.setVisibility(View.INVISIBLE);
                            arrow15.setVisibility(View.VISIBLE);
                            arrow15.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 16) {
                            tick6.setColorFilter(0xFF009b92);
                            arrow15.setVisibility(View.INVISIBLE);
                            arrow16.setVisibility(View.VISIBLE);
                            arrow16.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 17) {
                            arrow16.setVisibility(View.INVISIBLE);
                            arrow17.setVisibility(View.VISIBLE);
                            arrow17.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 18) {
                            arrow17.setVisibility(View.INVISIBLE);
                            arrow18.setVisibility(View.VISIBLE);
                            arrow18.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 19) {
                            tick7.setColorFilter(0xFF00aba1);
                            arrow18.setVisibility(View.INVISIBLE);
                            arrow19.setVisibility(View.VISIBLE);
                            arrow19.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 20) {
                            arrow19.setVisibility(View.INVISIBLE);
                            arrow20.setVisibility(View.VISIBLE);
                            arrow20.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 21) {
                            tick8.setColorFilter(0xFF00bbb0);
                            arrow20.setVisibility(View.INVISIBLE);
                            arrow21.setVisibility(View.VISIBLE);
                            arrow21.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 22) {

                            arrow21.setVisibility(View.INVISIBLE);
                            arrow22.setVisibility(View.VISIBLE);
                            arrow22.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 23) {
                            tick9.setColorFilter(0xFF00ccc0);
                            arrow22.setVisibility(View.INVISIBLE);
                            arrow23.setVisibility(View.VISIBLE);
                            arrow23.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 24) {
                            arrow23.setVisibility(View.INVISIBLE);
                            arrow24.setVisibility(View.VISIBLE);
                            arrow24.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 25) {
                            arrow24.setVisibility(View.INVISIBLE);
                            arrow25.setVisibility(View.VISIBLE);
                            arrow25.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 26) {
                            tick10.setColorFilter(0xFF00e4d7);
                            arrow25.setVisibility(View.INVISIBLE);
                            arrow26.setVisibility(View.VISIBLE);
                            arrow26.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 27) {
                            arrow26.setVisibility(View.INVISIBLE);
                            arrow27.setVisibility(View.VISIBLE);
                            arrow27.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 28) {
                            tick11.setColorFilter(0xFF00fcee);
                            arrow27.setVisibility(View.INVISIBLE);
                            arrow28.setVisibility(View.VISIBLE);
                            arrow28.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 29) {
                            arrow28.setVisibility(View.INVISIBLE);
                            arrow29.setVisibility(View.VISIBLE);
                            arrow29.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 30) {

                            arrow29.setVisibility(View.INVISIBLE);
                            arrow30.setVisibility(View.VISIBLE);
                            arrow30.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 31) {
                            tick12.setColorFilter(0xFF00fcee);
                            arrow30.setVisibility(View.INVISIBLE);
                            arrow31.setVisibility(View.VISIBLE);
                            arrow31.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 32) {

                            arrow31.setVisibility(View.INVISIBLE);
                            arrow32.setVisibility(View.VISIBLE);
                            arrow32.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 33) {

                            arrow32.setVisibility(View.INVISIBLE);
                            arrow33.setVisibility(View.VISIBLE);
                            arrow33.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 34) {
                            tick13.setColorFilter(0xFF16fff1);
                            arrow33.setVisibility(View.INVISIBLE);
                            arrow34.setVisibility(View.VISIBLE);
                            arrow34.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 35) {
                            arrow34.setVisibility(View.INVISIBLE);
                            arrow35.setVisibility(View.VISIBLE);
                            arrow35.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 36) {
                            tick14.setColorFilter(0xFF1efff2);
                            arrow35.setVisibility(View.INVISIBLE);
                            arrow36.setVisibility(View.VISIBLE);
                            arrow36.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 37) {
                            arrow36.setVisibility(View.INVISIBLE);
                            arrow37.setVisibility(View.VISIBLE);
                            arrow37.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 38) {
                            tick15.setColorFilter(0xFF2efff3);
                            arrow37.setVisibility(View.INVISIBLE);
                            arrow38.setVisibility(View.VISIBLE);
                            arrow38.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 39) {
                            arrow38.setVisibility(View.INVISIBLE);
                            arrow39.setVisibility(View.VISIBLE);
                            arrow39.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 40) {

                            arrow39.setVisibility(View.INVISIBLE);
                            arrow40.setVisibility(View.VISIBLE);
                            arrow40.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 41) {
                            tick16.setColorFilter(0xFF47fff4);
                            arrow40.setVisibility(View.INVISIBLE);
                            arrow41.setVisibility(View.VISIBLE);
                            arrow41.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 42) {
                            arrow41.setVisibility(View.INVISIBLE);
                            arrow42.setVisibility(View.VISIBLE);
                            arrow42.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 43) {
                            tick17.setColorFilter(0xFF4ffff4);
                            arrow42.setVisibility(View.INVISIBLE);
                            arrow43.setVisibility(View.VISIBLE);
                            arrow43.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 44) {
                            arrow43.setVisibility(View.INVISIBLE);
                            arrow44.setVisibility(View.VISIBLE);
                            arrow44.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 45) {

                            arrow44.setVisibility(View.INVISIBLE);
                            arrow45.setVisibility(View.VISIBLE);
                            arrow45.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 46) {
                            tick18.setColorFilter(0xFF5ffff5);
                            arrow45.setVisibility(View.INVISIBLE);
                            arrow46.setVisibility(View.VISIBLE);
                            arrow46.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 47) {
                            arrow46.setVisibility(View.INVISIBLE);
                            arrow47.setVisibility(View.VISIBLE);
                            arrow47.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 48) {

                            arrow47.setVisibility(View.INVISIBLE);
                            arrow48.setVisibility(View.VISIBLE);
                            arrow48.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 49) {
                            tick19.setColorFilter(0xFF5ffff5);
                            arrow48.setVisibility(View.INVISIBLE);
                            arrow49.setVisibility(View.VISIBLE);
                            arrow49.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 50) {

                            arrow49.setVisibility(View.INVISIBLE);
                            arrow50.setVisibility(View.VISIBLE);
                            arrow50.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 51) {
                            arrow50.setVisibility(View.INVISIBLE);
                            arrow51.setVisibility(View.VISIBLE);
                            arrow51.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 52) {
                            tick20.setColorFilter(0xFF70fff6);
                            arrow51.setVisibility(View.INVISIBLE);
                            arrow52.setVisibility(View.VISIBLE);
                            arrow52.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 53) {
                            arrow52.setVisibility(View.INVISIBLE);
                            arrow53.setVisibility(View.VISIBLE);
                            arrow53.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 54) {
                            tick21.setColorFilter(0xFF99fff9);
                            arrow53.setVisibility(View.INVISIBLE);
                            arrow54.setVisibility(View.VISIBLE);
                            arrow54.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 55) {
                            arrow54.setVisibility(View.INVISIBLE);
                            arrow55.setVisibility(View.VISIBLE);
                            arrow55.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 56) {
                            tick22.setColorFilter(0xFFa1fff9);
                            arrow55.setVisibility(View.INVISIBLE);
                            arrow56.setVisibility(View.VISIBLE);
                            arrow56.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 57) {
                            arrow56.setVisibility(View.INVISIBLE);
                            arrow57.setVisibility(View.VISIBLE);
                            arrow57.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 58) {
                            arrow57.setVisibility(View.INVISIBLE);
                            arrow58.setVisibility(View.VISIBLE);
                            arrow58.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 59) {
                            tick23.setColorFilter(0xFFa9fffa);
                            arrow58.setVisibility(View.INVISIBLE);
                            arrow59.setVisibility(View.VISIBLE);
                            arrow59.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 60) {

                            arrow59.setVisibility(View.INVISIBLE);
                            arrow60.setVisibility(View.VISIBLE);
                            arrow60.setColorFilter(0xFFc1fefb);
                        }
                        if (counter == 61) {
                            tick24.setColorFilter(0xFFc1fefb);
                            arrow60.setVisibility(View.INVISIBLE);
                            arrow.setVisibility(View.VISIBLE);

                        }
                        if (counter == 62) {
                            arrow.setVisibility(View.INVISIBLE);

                        }









                    }


                    @Override
                    public void onFinish() {

                        button.setVisibility(View.VISIBLE);
                        arrow.setVisibility(View.INVISIBLE);
                        arrow60.setVisibility(View.INVISIBLE);


                    }
                }.start();

            }
        });

        tick1.setColorFilter(0xFF00201e);
        tick2.setColorFilter(0xFF00201e);
        tick3.setColorFilter(0xFF00201e);
        tick4.setColorFilter(0xFF00201e);
        tick5.setColorFilter(0xFF00201e);
        tick6.setColorFilter(0xFF00201e);
        tick7.setColorFilter(0xFF00201e);
        tick8.setColorFilter(0xFF00201e);
        tick9.setColorFilter(0xFF00201e);
        tick10.setColorFilter(0xFF00201e);
        tick11.setColorFilter(0xFF00201e);
        tick12.setColorFilter(0xFF00201e);
        tick13.setColorFilter(0xFF00201e);
        tick14.setColorFilter(0xFF00201e);
        tick15.setColorFilter(0xFF00201e);
        tick16.setColorFilter(0xFF00201e);
        tick17.setColorFilter(0xFF00201e);
        tick18.setColorFilter(0xFF00201e);
        tick19.setColorFilter(0xFF00201e);
        tick20.setColorFilter(0xFF00201e);
        tick21.setColorFilter(0xFF00201e);
        tick22.setColorFilter(0xFF00201e);
        tick23.setColorFilter(0xFF00201e);
        tick24.setColorFilter(0xFF00201e);
        arrow.setVisibility(View.INVISIBLE);
        arrow2.setVisibility(View.INVISIBLE);
        arrow3.setVisibility(View.INVISIBLE);
        arrow4.setVisibility(View.INVISIBLE);
        arrow5.setVisibility(View.INVISIBLE);
        arrow6.setVisibility(View.INVISIBLE);
        arrow7.setVisibility(View.INVISIBLE);
        arrow8.setVisibility(View.INVISIBLE);
        arrow9.setVisibility(View.INVISIBLE);
        arrow10.setVisibility(View.INVISIBLE);

        arrow11.setVisibility(View.INVISIBLE);
        arrow12.setVisibility(View.INVISIBLE);
        arrow13.setVisibility(View.INVISIBLE);
        arrow14.setVisibility(View.INVISIBLE);
        arrow15.setVisibility(View.INVISIBLE);
        arrow16.setVisibility(View.INVISIBLE);
        arrow17.setVisibility(View.INVISIBLE);
        arrow18.setVisibility(View.INVISIBLE);
        arrow19.setVisibility(View.INVISIBLE);

        arrow20.setVisibility(View.INVISIBLE);
        arrow21.setVisibility(View.INVISIBLE);
        arrow22.setVisibility(View.INVISIBLE);
        arrow23.setVisibility(View.INVISIBLE);
        arrow24.setVisibility(View.INVISIBLE);
        arrow25.setVisibility(View.INVISIBLE);
        arrow26.setVisibility(View.INVISIBLE);
        arrow27.setVisibility(View.INVISIBLE);
        arrow28.setVisibility(View.INVISIBLE);
        arrow29.setVisibility(View.INVISIBLE);
        arrow30.setVisibility(View.INVISIBLE);

        arrow31.setVisibility(View.INVISIBLE);
        arrow32.setVisibility(View.INVISIBLE);
        arrow33.setVisibility(View.INVISIBLE);
        arrow34.setVisibility(View.INVISIBLE);
        arrow35.setVisibility(View.INVISIBLE);
        arrow36.setVisibility(View.INVISIBLE);
        arrow37.setVisibility(View.INVISIBLE);
        arrow38.setVisibility(View.INVISIBLE);
        arrow39.setVisibility(View.INVISIBLE);

        arrow40.setVisibility(View.INVISIBLE);
        arrow41.setVisibility(View.INVISIBLE);
        arrow42.setVisibility(View.INVISIBLE);
        arrow43.setVisibility(View.INVISIBLE);
        arrow44.setVisibility(View.INVISIBLE);
        arrow45.setVisibility(View.INVISIBLE);
        arrow46.setVisibility(View.INVISIBLE);
        arrow47.setVisibility(View.INVISIBLE);
        arrow48.setVisibility(View.INVISIBLE);
        arrow49.setVisibility(View.INVISIBLE);
        arrow50.setVisibility(View.INVISIBLE);

        arrow51.setVisibility(View.INVISIBLE);
        arrow52.setVisibility(View.INVISIBLE);
        arrow53.setVisibility(View.INVISIBLE);
        arrow54.setVisibility(View.INVISIBLE);
        arrow55.setVisibility(View.INVISIBLE);
        arrow56.setVisibility(View.INVISIBLE);
        arrow57.setVisibility(View.INVISIBLE);
        arrow58.setVisibility(View.INVISIBLE);
        arrow59.setVisibility(View.INVISIBLE);

        arrow60.setVisibility(View.INVISIBLE);




    }


}