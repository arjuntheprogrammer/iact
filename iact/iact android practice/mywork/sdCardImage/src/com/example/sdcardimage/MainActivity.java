package com.example.sdcardimage;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView) findViewById(R.id.imageView1);
//		iv.setImageDrawable(Drawable.createFromPath("mnt/sdcard/PICTURES/Chrysanthemum.jpg"));

	//iv.setImageDrawable(Drawable.createFromPath("mnt/sdcard/aa.jpg"));
		iv.setImageDrawable(Drawable.createFromPath(Environment.getExternalStorageDirectory().toString()+"/aa.jpg"));
        
    }
  
}
