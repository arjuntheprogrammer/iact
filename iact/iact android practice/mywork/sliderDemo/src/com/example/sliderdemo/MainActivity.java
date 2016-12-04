package com.example.sliderdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends Activity {
float x1,x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    	public boolean onTouchEvent(MotionEvent event) {
    	switch(event.getAction()){
    	
    	case MotionEvent.ACTION_DOWN:
    		x1=event.getX();
    		break;
    	case MotionEvent.ACTION_UP:
    		{x2=event.getX();
    			if(x2>x1){
    				Toast.makeText(getApplicationContext(),"x1="+x1+"\n x2="+x2 ,1).show();
    				
    			}
    			if(x1>x2)
    			{
    				Intent i=new Intent(MainActivity.this,SecondActivity.class);
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
