package com.example.user.aplikasimengenalbuah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextAlpukat;
    Button bt_proses;
    TextView hasil;
    String benar = "alpukat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAlpukat = (EditText)findViewById(R.id.edt_buah_alpukat);
        bt_proses = (Button)findViewById(R.id.bt_proses_alpukat);
        hasil = (TextView)findViewById(R.id.hasil_alpukat);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextAlpukat.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukan pilihan terlebih dahulu",Toast.LENGTH_SHORT).show(); //jika masukan kosong
                }
                else {
                    String jawaban = editTextAlpukat.getText().toString(); //mengambil nilai dari editTextAlpukat
                    if (jawaban.equals(benar)) { // membandingkat masukan dengan ketentuan benar "equals()" membandingkan nilai String yang tersimpan
                        String keterangan = "Anda bensr";
                        hasil.setText(keterangan);
                    }
                    else {
                        String keterangan = "Anda salah";
                        hasil.setText(keterangan);
                    }
                }

            }
        });
    }
}