package com.example.cia.kuissandec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_hasil);

        Bundle bundle = getIntent().getExtras();

        TextView cvHasil1 = (TextView)findViewById(R.id.cv_hasil1);
        TextView cvHasil2 = (TextView)findViewById(R.id.cv_hasil2);
        TextView txtScore = (TextView) findViewById(R.id.txt_score);

        cvHasil1.setText(bundle.getCharSequence("hasil1"));
        cvHasil2.setText(bundle.getCharSequence("hasil2"));
        txtScore.setText(bundle.getCharSequence("nilai"));
    }
}
