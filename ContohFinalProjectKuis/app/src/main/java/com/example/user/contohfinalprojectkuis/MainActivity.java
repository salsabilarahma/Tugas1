package com.example.user.contohfinalprojectkuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout mLinePilGan, mLineEssay;  //variabel baru bertipe Linear Layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan variabel pada MainActivity.java dengan id pada activity_main
        //pastikan tipe data variabel dengan view id sama
        mLinePilGan = (LinearLayout) findViewById(R.id.LinePilGan);
        mLineEssay = (LinearLayout) findViewById(R.id.LineEssay);

        //memberi aksi ketika diklik
        mLinePilGan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hasil aksinya ditulis disini (dalam method onClick)
                //pada kali ini hasil yang diinginkan adalah pindah activity,maka

                //membust objek baru dari kelas intent,
                //dari MainActivity akan pindah ke KuisPilihanGanda
                Intent i = new Intent(MainActivity.this, KuisPilihanGanda.class);
                startActivity(i);//jalankan Intent
            }

        });
        mLineEssay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                //hasil aksinya ditulis disini (dalam method onClick)
                //pada kali ini hasil yang diinginkan adalah pindah activity ,maka

                //membuat objek baru dari kelas intent ,
                //dari MainActivity akan pindah ke KuisEssay
                Intent i = new Intent(MainActivity.this, KuisEssay.class);
                startActivity(i);
            }
        });
    }

}









