package com.example.cia.kuissandec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class HardActivity extends AppCompatActivity {

    RadioButton rbIntent,rbClick,rbBindding,rbPoli;
    TextView txtHasilHard;
    Button btnProsesHard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_hard);

        rbClick = (RadioButton)findViewById(R.id.rb_click);
        rbIntent = (RadioButton)findViewById(R.id.rb_intent);
        rbBindding = (RadioButton)findViewById(R.id.rb_bindding);
        rbPoli = (RadioButton)findViewById(R.id.rb_poli);
        txtHasilHard =(TextView)findViewById(R.id.txt_hasil_hard);
        btnProsesHard = (Button)findViewById(R.id.btn_proses_hard);

        btnProsesHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HasilActivity.class);
                //Membuat obyek bundle
                Bundle bundle = new Bundle();

                //Menyisipkan tipe data String ke dalam obyek bundle
                if (rbIntent.isChecked()&&rbBindding.isChecked()){
                    bundle.putString("hasil1", "benar");
                    bundle.putString("hasil2", "benar");
                    bundle.putString("nilai", "10");
                }
                else if (rbIntent.isChecked()&& !rbBindding.isChecked()){
                    bundle.putString("hasil1", "benar");
                    bundle.putString("hasil2", "salah");
                    bundle.putString("nilai", "5");
                }else if (!rbIntent.isChecked()&& rbBindding.isChecked()){
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
}
