package com.example.sliderdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.Toast;

public class MySlider extends Activity {

	float x1,x2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_slider);
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
	switch (event.getAction()) {
	case MotionEvent.ACTION_DOWN:
	{
		x1=event.getX();
	}
		break;
	case MotionEvent.ACTION_UP:
	{
		x2=event.getX();
		if(x1<x2)
		{
			Toast.makeText(getApplicationContext(), ""+x1+"\n"+x2, 1).show();
		}
		if(x1>x2)
		{
			Intent i=new Intent(MySlider.this,SecondSlider.class);
			startActivity(i);
		}
	}
	break;
	default:
		break;
	}
		return super.onTouchEvent(event);
	
	}
	
}
