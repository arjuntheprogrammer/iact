package com.example.sharetext;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MyTextShare extends Activity{
Button btn1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_text_share);
		btn1=(Button) findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Intent.ACTION_SEND);
				i.setType("text/html");
				i.putExtra(android.content.Intent.EXTRA_TEXT, "HI I AM SAURAV");
				startActivity(Intent.createChooser(i, "CHOOSE FILE"));
			}
		});
	}}
