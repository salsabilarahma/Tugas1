package com.example.user.aplikasiwidget;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Set waktu lama aplassplashscreen
    private static int splashInterval = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.
                        FLAG_FULLSCREEN,
                WindowManager.LayoutParams.
                         FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //TODO Auto-generated method stub
                Intent i = new Intent(
                        MainActivity.this,
                        MainActivity.class);
                startActivity(i);

                //jeda selsesai Splashscreen
                this.finish();
            }

            private void finish() {
                //TOOD Auto-generated method stub

            }
        }, splashInterval);
    };
}

