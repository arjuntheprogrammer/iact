package com.example.gamedemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;

public class MyGame extends Activity {
Bitmap bmp;
int i=100;
int t=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new MyBall(this));
	}
	public class MyBall extends View
	{

		public MyBall(Context context) 
		{
		super(context);
		bmp=BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			// TODO Auto-generated method stub
			super.onDraw(canvas);
			//for background color
			canvas.drawColor(Color.BLUE);
			//canvas.drawBitmap(bmp, (canvas.getWidth()/2),i, null);
			canvas.drawBitmap(bmp,300,i, null);
			
			if(i<=100)
			{
				t=0;
			}
				//if(t!=1 && i<canvas.getHeight()-100)
			if(t!=1 && i<800)	
			{
					i+=3;
				}
				else
				{
					t=1;
					i-=5;
				}
				invalidate();
		}
		
		
	}
}
