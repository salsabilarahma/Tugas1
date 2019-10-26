package com.example.cia.kuissandec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class EasyActivity extends AppCompatActivity {

    BankSoal bank = new BankSoal();
    Button btnProsesEasy;
    RadioGroup rbg1,rbg2;
    RadioButton rbImage,rbRadio,rbText,rbButton;
    TextView txtHasil,mtvSoal;

    int x =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_easy);

        rbg1 = (RadioGroup)findViewById(R.id.rbg1);
        rbg2 = (RadioGroup)findViewById(R.id.rbg2);
        rbImage = (RadioButton)findViewById(R.id.rb_image);
        rbButton = (RadioButton)findViewById(R.id.rb_button);
        rbRadio = (RadioButton)findViewById(R.id.rb_radio);
        rbText = (RadioButton)findViewById(R.id.rb_text);
        btnProsesEasy = (Button)findViewById(R.id.btn_proses_easy);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        mtvSoal = (TextView)findViewById(R.id.mtvSoal);
        btnProsesEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HasilActivity.class);
                //Membuat obyek bundle
                Bundle bundle = new Bundle();

                //Menyisipkan tipe data String ke dalam obyek bundle
                if (rbImage.isChecked()&&rbText.isChecked()){
                    bundle.putString("hasil1", "benar");
                    bundle.putString("hasil2", "benar");
                    bundle.putString("nilai", "10");
                }
                else if (rbImage.isChecked()&& !rbText.isChecked()){
                    bundle.putString("hasil1", "benar");
                    bundle.putString("hasil2", "salah");
                    bundle.putString("nilai", "5");
                }else if (!rbImage.isChecked()&& rbText.isChecked()){
                    bundle.putString("hasil1", "salah");
                    bundle.putString("hasil2", "benar");
                    bundle.putString("nilai", "5");
                }else {
                    bundle.putString("hasil1", "salah");
                    bundle.putString("hasil2", "salah");
                    bundle.putString("nilai", "0");
                }
                //Menambahkan bundle intent
                intent.putExtras(bundle);

                //memulai Activity kedua
                startActivity(intent);
            }
        });
    }

    public void update (){
        rbg1.clearCheck();
        if (x == 2) {
        }Intent i = new Intent(getApplicationContext(),HasilActivity.class
                startActivity (i);
    }else{
        Random random = new Random();
        put = random.nextInt(2);
        mtvSoal.setText(bank.getPertanyaan(put);                                                    // acak
        mtvSoal.setText(bank.getPertanyaan();                                                       // urut
        rbImage.setText(bank.getPilihanJawaban1(x);
        rbRadio.setText(bank.getPilihanJawaban2(x);
        JawabanBenar = bank.getJawaban(x);
        
    }

    public void cekJawaban {}{
        if (rbImage.isChecked()) (
                if(rbImage.getText().toString(),equals(jawabanbenar)())
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
}
                
                