package com.example.sdcarddemo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ImageView;

public class MySDCard extends Activity {
ImageView iv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_sdcard);
		iv=(ImageView)findViewById(R.id.imageView1);
//		iv.setImageDrawable(Drawable.createFromPath("mnt/sdcard/PICTURES/Chrysanthemum.jpg"));
		iv.setImageDrawable(Drawable.createFromPath(Environment.getExternalStorageDirectory().toString()+"/media/aa.jpg"));

	}}
