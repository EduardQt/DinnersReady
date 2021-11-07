package se.hkr.dinnersready;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public int counter;
    Button button;
    ConstraintLayout layout;
    ImageView outline;
    ImageView colonDots;
    ImageView tick1;
    ImageView tick2;
    ImageView tick3;
    ImageView tick4;
    ImageView tick5;
    ImageView tick6;
    ImageView tick7;
    ImageView tick8;
    ImageView tick9;
    ImageView tick10;
    ImageView tick11;
    ImageView tick12;
    ImageView tick13;
    ImageView tick14;
    ImageView tick15;
    ImageView tick16;
    ImageView tick17;
    ImageView tick18;
    ImageView tick19;
    ImageView tick20;
    ImageView tick21;
    ImageView tick22;
    ImageView tick23;
    ImageView tick24;

    //top
    ImageView t1;
    ImageView t8;
    ImageView t15;
    ImageView t22;

    //bottom
    ImageView t4;
    ImageView t11;
    ImageView t18;
    ImageView t25;

    //topright
    ImageView t2;
    ImageView t9;
    ImageView t16;
    ImageView t23;

    ImageView t3;
    ImageView t5;
    ImageView t6;
    ImageView t7;
    ImageView t10;
    ImageView t12;
    ImageView t13;
    ImageView t14;
    ImageView t17;
    ImageView t19;
    ImageView t20;
    ImageView t21;
    ImageView t24;
    ImageView t26;
    ImageView t27;
    ImageView t28;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        layout=(ConstraintLayout) findViewById(R.id.layout) ;
        button= (Button) findViewById(R.id.button);
        outline=(ImageView)findViewById(R.id.outline);
        colonDots=(ImageView)findViewById(R.id.colondots);
        tick1 = (ImageView) findViewById(R.id.tick1);
        tick2 = (ImageView) findViewById(R.id.tick2);
        tick3 = (ImageView) findViewById(R.id.tick3);
        tick4 = (ImageView) findViewById(R.id.tick4);
        tick5 = (ImageView) findViewById(R.id.tick5);
        tick6 = (ImageView) findViewById(R.id.tick6);
        tick7 = (ImageView) findViewById(R.id.tick7);
        tick8 = (ImageView) findViewById(R.id.tick8);
        tick9 = (ImageView) findViewById(R.id.tick9);
        tick10 = (ImageView) findViewById(R.id.tick10);
        tick11 = (ImageView) findViewById(R.id.tick11);
        tick12 = (ImageView) findViewById(R.id.tick12);
        tick13 = (ImageView) findViewById(R.id.tick13);
        tick14 = (ImageView) findViewById(R.id.tick14);
        tick15 = (ImageView) findViewById(R.id.tick15);
        tick16 = (ImageView) findViewById(R.id.tick16);
        tick17 = (ImageView) findViewById(R.id.tick17);
        tick18 = (ImageView) findViewById(R.id.tick18);
        tick19 = (ImageView) findViewById(R.id.tick19);
        tick20 = (ImageView) findViewById(R.id.tick20);
        tick21 = (ImageView) findViewById(R.id.tick21);
        tick22 = (ImageView) findViewById(R.id.tick22);
        tick23 = (ImageView) findViewById(R.id.tick23);
        tick24 = (ImageView) findViewById(R.id.tick24);


        t1 = (ImageView) findViewById(R.id.t1);
        t2 = (ImageView) findViewById(R.id.t2);
        t3 = (ImageView) findViewById(R.id.t3);
        t4= (ImageView) findViewById(R.id.t4);
        t5= (ImageView) findViewById(R.id.t5);
        t6 = (ImageView) findViewById(R.id.t6);
        t7 = (ImageView) findViewById(R.id.t7);
        t8= (ImageView) findViewById(R.id.t8);
        t9= (ImageView) findViewById(R.id.t9);
        t10 = (ImageView) findViewById(R.id.t10);
        t11 = (ImageView) findViewById(R.id.t11);
        t12 = (ImageView) findViewById(R.id.t12);
        t13 = (ImageView) findViewById(R.id.t13);
        t14= (ImageView) findViewById(R.id.t14);
        t15 = (ImageView) findViewById(R.id.t15);
        t16 = (ImageView) findViewById(R.id.t16);
        t17= (ImageView) findViewById(R.id.t17);
        t18= (ImageView) findViewById(R.id.t18);
        t19= (ImageView) findViewById(R.id.t19);
        t20 = (ImageView) findViewById(R.id.t20);
        t21= (ImageView) findViewById(R.id.t21);
        t22 = (ImageView) findViewById(R.id.t22);
        t23 = (ImageView) findViewById(R.id.t23);
        t24 = (ImageView) findViewById(R.id.t24);
        t25 = (ImageView) findViewById(R.id.t25);
        t26 = (ImageView) findViewById(R.id.t26);
        t27 = (ImageView) findViewById(R.id.t27);
        t28 = (ImageView) findViewById(R.id.t28);


        tick1.setColorFilter(0xFF000000);
        tick2.setColorFilter(0xFF000000);
        tick3.setColorFilter(0xFF120307);
        tick4.setColorFilter(0xFF120307);
        tick5.setColorFilter(0xFF25060e);
        tick6.setColorFilter(0xFF25060e);
        tick7.setColorFilter(0xFF380915);
        tick8.setColorFilter(0xFF380915);
        tick9.setColorFilter(0xFF4a0c1c);
        tick10.setColorFilter(0xFF4a0c1c);
        tick11.setColorFilter(0xFF5d0f24);
        tick12.setColorFilter(0xFF5d0f24);
        tick13.setColorFilter(0xFF6f112b);
        tick14.setColorFilter(0xFF6f112b);
        tick15.setColorFilter(0xFF821432);
        tick16.setColorFilter(0xFF821432);
        tick17.setColorFilter(0xFF941739);
        tick18.setColorFilter(0xFF941739);
        tick19.setColorFilter(0xFFa71a40);
        tick20.setColorFilter(0xFFa71a40);
        tick21.setColorFilter(0xFFFF3131);
        tick22.setColorFilter(0xFFFF3131);
        tick23.setColorFilter(0xFFFF0000);
        tick24.setColorFilter(0xFFFF0000);

        layout.setBackgroundColor(0xFFe6fff8);

        t1.setColorFilter(0xFFFF3131);
        t2.setColorFilter(0xFF941739);
        t3.setColorFilter(0xFF6f112b);
        t4.setColorFilter(0xFF4a0c1c);
        t5.setColorFilter(0xFF6f112b);
        t6.setColorFilter(0xFF941739);
        t7.setColorFilter(0xFF5d0f24);
        t8.setColorFilter(0xFFFF3131);
        t9.setColorFilter(0xFF941739);
        t10.setColorFilter(0xFF6f112b);
        t11.setColorFilter(0xFF4a0c1c);
        t12.setColorFilter(0xFF6f112b);
        t13.setColorFilter(0xFF941739);
        t14.setColorFilter(0xFF5d0f24);
        t15.setColorFilter(0xFFFF3131);
        t16.setColorFilter(0xFF941739);
        t17.setColorFilter(0xFF6f112b);
        t18.setColorFilter(0xFF4a0c1c);
        t19.setColorFilter(0xFF6f112b);
        t20.setColorFilter(0xFF941739);
        t21.setColorFilter(0xFF5d0f24);
        t22.setColorFilter(0xFFFF3131);
        t23.setColorFilter(0xFF941739);
        t24.setColorFilter(0xFF6f112b);
        t25.setColorFilter(0xFF4a0c1c);
        t26.setColorFilter(0xFF6f112b);
        t27.setColorFilter(0xFF941739);
        t28.setColorFilter(0xFF5d0f24);
        colonDots.setColorFilter(0xFF5d0f24);
        outline.setColorFilter(0xFF941739);















        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.BLACK);

                outline.setColorFilter(0xFF3ffff4);

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





                //siffror
                t1.setColorFilter(0xFF4ffff4);
                t2.setColorFilter(0xFF00d4c7);
                t3.setColorFilter(0xFF007a73);
                t4.setColorFilter(0xFF007a73);
                t5.setColorFilter(0xFF007a73);
                t6.setColorFilter(0xFF00d4c7);
                t7.setColorFilter(0xFF00b3a9);
                t8.setColorFilter(0xFF4ffff4);
                t9.setColorFilter(0xFF00d4c7);
                t10.setColorFilter(0xFF007a73);
                t11.setColorFilter(0xFF007a73);
                t12.setColorFilter(0xFF007a73);
                t13.setColorFilter(0xFF00d4c7);
                t14.setColorFilter(0xFF00b3a9);
                t15.setColorFilter(0xFF4ffff4);
                t16.setColorFilter(0xFF00d4c7);
                t17.setColorFilter(0xFF007a73);
                t18.setColorFilter(0xFF007a73);
                t19.setColorFilter(0xFF007a73);
                t20.setColorFilter(0xFF00d4c7);
                t21.setColorFilter(0xFF00b3a9);
                t22.setColorFilter(0xFF4ffff4);
                t23.setColorFilter(0xFF00d4c7);
                t24.setColorFilter(0xFF007a73);
                t25.setColorFilter(0xFF007a73);
                t26.setColorFilter(0xFF007a73);
                t27.setColorFilter(0xFF00d4c7);
                t28.setColorFilter(0xFF00b3a9);
                colonDots.setColorFilter(0xFF007a73);
                new CountDownTimer(25000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        // textView.setText(String.valueOf(counter));

                        counter++;
                        if (counter == 1) {

                            tick1.setColorFilter(0xFF00302e);
                            t1.setVisibility(View.INVISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.INVISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.INVISIBLE);
                            t7.setVisibility(View.INVISIBLE);
                            t7.setVisibility(View.INVISIBLE);
                            t14.setVisibility(View.INVISIBLE);
                            t21.setVisibility(View.INVISIBLE);
                            t28.setVisibility(View.INVISIBLE);
                        }


                        if (counter == 2) {

                            tick2.setColorFilter(0xFF00302e);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.INVISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.VISIBLE);
                            t6.setVisibility(View.INVISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }

                        if (counter == 3) {
                            tick3.setColorFilter(0xFF004945);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.INVISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }


                        if (counter == 4) {
                            tick4.setColorFilter(0xFF009b92);
                            t1.setVisibility(View.INVISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.INVISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }
                        if (counter == 5) {
                            tick5.setColorFilter(0xFF009b92);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.INVISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }
                        if (counter == 6) {
                            tick6.setColorFilter(0xFF009b92);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.INVISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.VISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }
                        if (counter == 7) {
                            tick7.setColorFilter(0xFF00aba1);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.INVISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.INVISIBLE);
                            t7.setVisibility(View.INVISIBLE);
                        }
                        if (counter == 8) {
                            tick8.setColorFilter(0xFF00bbb0);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.VISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }
                        if (counter == 9) {
                            tick9.setColorFilter(0xFF00ccc0);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }

                        if (counter == 10) {
                            tick10.setColorFilter(0xFF00e4d7);

                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.VISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.INVISIBLE);

                            t8.setVisibility(View.INVISIBLE);
                            t9.setVisibility(View.VISIBLE);
                            t10.setVisibility(View.VISIBLE);
                            t11.setVisibility(View.INVISIBLE);
                            t12.setVisibility(View.INVISIBLE);
                            t13.setVisibility(View.INVISIBLE);
                            t14.setVisibility(View.INVISIBLE);
                        }
                        if (counter == 11) {
                            tick11.setColorFilter(0xFF00fcee);
                            t1.setVisibility(View.INVISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.INVISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.INVISIBLE);
                            t7.setVisibility(View.INVISIBLE);

                        }
                        if (counter == 12) {
                            tick12.setColorFilter(0xFF00fcee);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.INVISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.VISIBLE);
                            t6.setVisibility(View.INVISIBLE);
                            t7.setVisibility(View.VISIBLE);

                        }
                        if (counter == 13) {
                            tick13.setColorFilter(0xFF16fff1);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.INVISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }
                        if (counter == 14) {
                            tick14.setColorFilter(0xFF1efff2);
                            t1.setVisibility(View.INVISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.INVISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }
                        if (counter == 15) {
                            tick15.setColorFilter(0xFF2efff3);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.INVISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }
                        if (counter == 16) {
                            tick16.setColorFilter(0xFF47fff4);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.INVISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.VISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }
                        if (counter == 17) {
                            tick17.setColorFilter(0xFF4ffff4);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.INVISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.INVISIBLE);
                            t7.setVisibility(View.INVISIBLE);
                        }
                        if (counter == 18) {
                            tick18.setColorFilter(0xFF5ffff5);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.VISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }
                        if (counter == 19) {
                            tick19.setColorFilter(0xFF70fff6);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.VISIBLE);
                        }
                        if (counter == 20) {
                            tick20.setColorFilter(0xFF90fff8);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.VISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.INVISIBLE);

                            t8.setVisibility(View.VISIBLE);
                            t9.setVisibility(View.VISIBLE);
                            t10.setVisibility(View.INVISIBLE);
                            t11.setVisibility(View.VISIBLE);
                            t12.setVisibility(View.VISIBLE);
                            t13.setVisibility(View.INVISIBLE);
                            t14.setVisibility(View.VISIBLE);
                        }
                        if (counter == 21) {
                            tick21.setColorFilter(0xFF99fff9);
                            t1.setVisibility(View.INVISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.INVISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.INVISIBLE);
                            t7.setVisibility(View.INVISIBLE);
                            t14.setVisibility(View.VISIBLE);
                        }
                        if (counter == 22) {
                            tick22.setColorFilter(0xFFa1fff9);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.INVISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.VISIBLE);
                            t6.setVisibility(View.INVISIBLE);
                            t7.setVisibility(View.VISIBLE);
                            t14.setVisibility(View.VISIBLE);
                        }
                        if (counter == 23) {
                            tick23.setColorFilter(0xFFa9fffa);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.VISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.INVISIBLE);
                            t7.setVisibility(View.VISIBLE);
                            t14.setVisibility(View.VISIBLE);
                        }
                        if (counter == 24) {
                            tick24.setColorFilter(0xFFc1fefb);
                            t1.setVisibility(View.INVISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.VISIBLE);
                            t4.setVisibility(View.INVISIBLE);
                            t5.setVisibility(View.INVISIBLE);
                            t6.setVisibility(View.VISIBLE);
                            t7.setVisibility(View.VISIBLE);
                            t14.setVisibility(View.VISIBLE);
                        }
                    }







                    public  void onFinish(){
                        // textView.setText("FINISH!!");
                        tick1.setColorFilter(0xFF000000);
                        tick2.setColorFilter(0xFF000000);
                        tick3.setColorFilter(0xFF120307);
                        tick4.setColorFilter(0xFF120307);
                        tick5.setColorFilter(0xFF25060e);
                        tick6.setColorFilter(0xFF25060e);
                        tick7.setColorFilter(0xFF380915);
                        tick8.setColorFilter(0xFF380915);
                        tick9.setColorFilter(0xFF4a0c1c);
                        tick10.setColorFilter(0xFF4a0c1c);
                        tick11.setColorFilter(0xFF5d0f24);
                        tick12.setColorFilter(0xFF5d0f24);
                        tick13.setColorFilter(0xFF6f112b);
                        tick14.setColorFilter(0xFF6f112b);
                        tick15.setColorFilter(0xFF821432);
                        tick16.setColorFilter(0xFF821432);
                        tick17.setColorFilter(0xFF941739);
                        tick18.setColorFilter(0xFF941739);
                        tick19.setColorFilter(0xFFa71a40);
                        tick20.setColorFilter(0xFFa71a40);
                        tick21.setColorFilter(0xFFFF3131);
                        tick22.setColorFilter(0xFFFF3131);
                        tick23.setColorFilter(0xFFFF0000);
                        tick24.setColorFilter(0xFFFF0000);

                        layout.setBackgroundColor(0xFFe6fff8);

                        t1.setColorFilter(0xFFFF3131);
                        t2.setColorFilter(0xFF941739);
                        t3.setColorFilter(0xFF6f112b);
                        t4.setColorFilter(0xFF4a0c1c);
                        t5.setColorFilter(0xFF6f112b);
                        t6.setColorFilter(0xFF941739);
                        t7.setColorFilter(0xFF5d0f24);
                        t8.setColorFilter(0xFFFF3131);
                        t9.setColorFilter(0xFF941739);
                        t10.setColorFilter(0xFF6f112b);
                        t11.setColorFilter(0xFF4a0c1c);
                        t12.setColorFilter(0xFF6f112b);
                        t13.setColorFilter(0xFF941739);
                        t14.setColorFilter(0xFF5d0f24);
                        t15.setColorFilter(0xFFFF3131);
                        t16.setColorFilter(0xFF941739);
                        t17.setColorFilter(0xFF6f112b);
                        t18.setColorFilter(0xFF4a0c1c);
                        t19.setColorFilter(0xFF6f112b);
                        t20.setColorFilter(0xFF941739);
                        t21.setColorFilter(0xFF5d0f24);
                        t22.setColorFilter(0xFFFF3131);
                        t23.setColorFilter(0xFF941739);
                        t24.setColorFilter(0xFF6f112b);
                        t25.setColorFilter(0xFF4a0c1c);
                        t26.setColorFilter(0xFF6f112b);
                        t27.setColorFilter(0xFF941739);
                        t28.setColorFilter(0xFF5d0f24);
                        colonDots.setColorFilter(0xFF5d0f24);
                        outline.setColorFilter(0xFF941739);
                    }
                }.start();
            }
        });
    }
}


//alltid 0xFF först




