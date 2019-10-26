package com.example.user.aplikasimengenalbuah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void bt_tebak_buah(View view){
        Toast.makeText(MainActivity.this,"Aplikasi Mengenal Buah",Toast.LENGTH_SHORT).show();
    }

    public void bt_alpukat (View view){
        Intent i = new Intent(Main2Activity.this,Alpukat.class);
        startActivity(i);
    }

    public void bt_apel (View view){
        Intent i = new Intent(Main2Activity.this,Apel.class);

    }
}