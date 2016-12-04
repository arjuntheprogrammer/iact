package com.example.sliderdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class SecondActivity extends Activity {
float x1,x2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}
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
			Intent i=new Intent(SecondActivity.this,MainActivity.class);
			startActivity(i);
		}
		if(x1>x2)
		{
			Toast.makeText(getApplicationContext(), "x1="+x1+"\nx2="+x2, 1).show();
		}
	}
	break;
	default:
		break;
	}
		return super.onTouchEvent(event);
	
	}
}
