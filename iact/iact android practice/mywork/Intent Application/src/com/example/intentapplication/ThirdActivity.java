package com.example.intentapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThirdActivity extends Activity implements OnClickListener{
	Button bt1;
	Button bt2;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		bt1=(Button)findViewById(R.id.button1);
        bt1.setOnClickListener(this);
        bt2=(Button)findViewById(R.id.button2);
        bt2.setOnClickListener(this);
        
		
	}
	
	
	@Override
	public void onClick(View a) {
		
		if(a.getId()==R.id.button1){
		Intent i=new Intent(ThirdActivity.this,MainActivity.class);
		startActivity(i);}
		
		else if(a.getId()==R.id.button2){
			Intent i=new Intent(ThirdActivity.this,SecondActivity.class);
			startActivity(i);}
			
		
	}


}
