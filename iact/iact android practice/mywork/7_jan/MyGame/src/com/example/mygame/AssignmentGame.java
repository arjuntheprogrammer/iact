package com.example.mygame;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;

public class AssignmentGame extends Activity {
Bitmap bmp;
int left=310;
int top=0;
int t=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new MyBall(this));	
	}
	public class MyBall extends View
	{

		public MyBall(Context context) {
			super(context);
			bmp=BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			// TODO Auto-generated method stub
			super.onDraw(canvas);
			canvas.drawColor(Color.RED);
			canvas.drawBitmap(bmp, left,top,null);
//			if(top<=0)
//			{
//				t=0;
//			}
//			if(t!=1 && top<950)
//			{
//				top+=3;
//			}
//			else
//			{
//				t=1;
//				top-=3;
//			}
			if(t==0)
			{
				top+=3;
				left-=3;
			}
			if(top==300)
			{
				t=1;
			}
			if(t==1)
			{
				top+=3;
				left+=3;
			}
			if(top==600)
			{
				t=2;
			}
			if(t==2)
			{
				left+=3;
				top-=3;
			}
			if(top==300 && t==2)
			{
			t=3;
			}
			if(t==3)
			{
			left-=3;
			top-=3;
			}
			if(top==0 && left==310)
			{
				t=0;
			}
			invalidate();
		}
	}
}