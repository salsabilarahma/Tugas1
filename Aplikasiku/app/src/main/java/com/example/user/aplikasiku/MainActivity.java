package com.example.user.aplikasiku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton firstImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstImageButton = (ImageButton)findViewById(R.id.imageButton);
    }

    public void firstImageButton(View view) {
        Intent intent = new Intent(this, bandung.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Kalian telah memilih imagebutton pertama", Toast.LENGTH_LONG).show();
    }

    public void secondImageButton(View view) {
        Toast.makeText(getApplicationContext(), "Kalian telah memilih imagebutton kedua", Toast.LENGTH_LONG).show();
    }

    public void  thirdImageButton(View view) {
        Toast.makeText(getApplicationContext(), "Kalian telah memilih imagebutton ketiga", Toast.LENGTH_LONG).show();
    }

    public void fourImageButton(View view) {
        Toast.makeText(getApplicationContext(), "Kalian telah memilih imagebutton keempat", Toast.LENGTH_LONG).show();
    }

    public void fiveImageButton(View view) {
        Toast.makeText(getApplicationContext(), "Kalian telah memilih imagebutton kelima", Toast.LENGTH_LONG).show();
    }
}