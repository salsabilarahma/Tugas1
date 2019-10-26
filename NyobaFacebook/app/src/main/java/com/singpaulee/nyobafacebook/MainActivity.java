package com.singpaulee.nyobafacebook;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
	EditText medtStatus;
	Button mbtnPost;
	ImageView mimgProfil;
	TextView mtvNickname, mtvStatus, mtvWaktu;
	RelativeLayout mrelative1;
	String nickname = "Hanif Abdullah";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		medtStatus = (EditText) findViewById(R.id.edtStatus);
		mtvWaktu = (TextView)findViewById(R.id.tvWaktu);
		medtStatus.setHint("Bagaimana harimu " + nickname);
		mtvNickname = (TextView) findViewById(R.id.tvNickname);
		mtvStatus = (TextView) findViewById(R.id.tvStatus);
		mbtnPost = (Button) findViewById(R.id.btnPost);
		mrelative1 = (RelativeLayout) findViewById(R.id.relative1);
		mimgProfil = (ImageView) findViewById(R.id.imgProfil);



		mbtnPost.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				postStatus();
			}
		});
	}

	public void postStatus() {
		if (medtStatus.getText().toString().isEmpty()) {
			Toast.makeText(this, "Masukkan status terlebih dahulu", Toast.LENGTH_SHORT).show();
		} else {
			String status = medtStatus.getText().toString();
			medtStatus.setText(null);

			mrelative1.setVisibility(View.VISIBLE);
			mtvNickname.setText(nickname);
			mtvStatus.setText(status);

			Resources res = getResources();
			String mPhoto = "gojek_app";
			int resID = res.getIdentifier(mPhoto, "drawable", getPackageName());
			Drawable drawable = res.getDrawable(resID);
			mimgProfil.setImageDrawable(drawable);

			long date = System.currentTimeMillis();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			String jam = sdf.format(date);
//			String jam = DateFormat.getDateTimeInstance().format(new Date());
			mtvWaktu.setText(jam);
		}
	}
}
