package com.example.fragment112334;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {
Button btn1,btn2,btn3;
FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.b1);
        btn2=(Button) findViewById(R.id.b2);
        btn3=(Button) findViewById(R.id.b3);
        ft=getSupportFragmentManager().beginTransaction();
        StartFragmentDemo s1=new StartFragmentDemo();
        ft.add(R.id.place,s1);
        ft.commit();
    }
    public void onStartFragment(View v)
    {
    	Fragment newFrag=null;
    	switch (v.getId()) {
		case R.id.b1:
			newFrag=new StartFragmentDemo();
			break;
		case R.id.b2:
			newFrag=new SecondFragmentDemo();	
			break;
		case R.id.b3:
			newFrag=new ThirdFragmentDemo();
			break;
		}
    	ft=getSupportFragmentManager().beginTransaction();
    	ft.replace(R.id.place,newFrag);
    	ft.addToBackStack(null);
    	ft.commit();
    }
   
}
