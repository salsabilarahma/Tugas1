package com.example.user.contohfinalprojectkuis;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.x;

public class kuis_essay extends AppCompatActivity {
    TextView mtvSkor2, mtvSoal2;
    ImageView mivGambar;
    EditText medtJawaban;
    Button mbtnSubmit2;
    int x = 0;
    int arr;
    int skor;
    String jawaban;

    SoalEssay essay = new SoalEssay();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_essay2);

        mtvSkor2 = (TextView) findViewById(R.id.tvSkor2);
        mtvSoal2 = (TextView) findViewById(R.id.tvSoal2);
        mivGambar = (ImageView) findViewById(R.id.ivGambar);
        medtJawaban = (EditText) findViewById(R.id.edtJawaban);
        mbtnSubmit2 = (Button) findViewById(R.id.btnSubmit2);

        setKonten();

        mbtnSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekJawaban();
            }
        });
    }

    public void setKonten() {
        medtJawaban.setText(null);
        arr = essay.pertanyaan.length;
        if (x >= arr) { //jika nilai x melebihi nilai arr(panjang array) maka pindah activity (kuis selesai)
            String jumlahSkor = String.valueOf(skor);
            Intent i = new Intent(KuisEssay.this, HasilSkoring.class);
            //waktu pindah activityZ, sekalian membawa nilai jumlahSkor yang ditampung inisial skorAkhir2
            //singkatnya skorAkhir2 = jumlaSkor
            //jika masih belum jelas silahkan bertanya
            i.putExtra("skorAkhir2", jumlahSkor);
            i.putExtra("activity", "Essay");
            startActivity(i);
        } else {
            //setting text dengan mengambil text dari method gettter di kelas SoalEssay m
            mtvSoal2.setText(essay.getPertanyaan(x));
            ubahGambar();
            jawaban = essay.getJawabanBenar(x);
        }
        x++;
    }

    public void ubahGambar() {
        Resources res = getResources();
        String mPhoto = essay.getStringGambar(x);
        int resID = res.getIdentifier(mPhoto, "drawable", getPackageName());
        Drawable drawable = res.getDrawable(resID);
        mivGambar.setImageDrawable(drawable);
    }

    public void cekJawaban() {
        if (!medtJawaban.getText().toString().isEmpty()) { //jika edit text TIDAK// kosong
            //jika text yang tertulis di edit text tsb = nilai dari var jawaban
            if (medtJawaban.getText().toString().equalsIgnoreCase(jawaban)) {
                skor = skor + 10;
                mtvSkor2.setText("" + skor);  //mtvSkor2 diset nilainya = var skor
                Toast.makeText(this, "JawabanBenar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            } else {
                mtvSkor2.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else {
            Toast.makeText(this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed() {
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }
}