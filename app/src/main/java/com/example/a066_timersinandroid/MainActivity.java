package com.example.a066_timersinandroid;




import android.support.v7.app.AppCompatActivity;

import android.os.Handler;  // Imported
import android.os.CountDownTimer; //Imported
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int s=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Handler handler=new Handler(); // Timer 1
//        Runnable running=new Runnable(){
//            public void run()
//            {
//                s++;
//                Log.i(" Runnable has run !"," a seconds passed");
//                handler.postDelayed(this,1000);
//
//
//                TextView tv=(TextView)findViewById(R.id.tt);
//                tv.setText(Integer.toString(s));
//            }
//        };
//        handler.post(running); //Timer1 Over



            // TIMER METHOD 2  //Timer starts after 3 seconds
        final TextView tv=(TextView)findViewById(R.id.tt);
        new CountDownTimer(/* DURATION */100000+3,/*Frequency */1000)
        {
            public void onTick(long millisecondsLeft)
            {
                Log.i("Seconds Left",String.valueOf(millisecondsLeft/1000));
                tv.setText(String.valueOf(millisecondsLeft/1000));

            }
            public void onFinish()
            {
                Log.i(" Done! "," Timer Finished");
                tv.setText(" Time Uppp !!!");
            }
        }.start();

        // Timer 2 over


    }
}
