package com.example.bluetooth1122233;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
BluetoothAdapter ba=null;
Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);
        btn3=(Button) findViewById(R.id.button3);
        ba=BluetoothAdapter.getDefaultAdapter();
        
btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(ba==null)
		        {
		        Toast.makeText(MainActivity.this,"DEVICE NOT SUPP", 1).show();	
		        } 
				else
				{
					if(ba.isEnabled())
					{
						Toast.makeText(MainActivity.this,"ALREADY ON",1).show();
					}
					else
					{
						Intent i=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
						startActivityForResult(i, 0);
						Toast.makeText(MainActivity.this,"BLUETOOTH ON",1).show();	
					}
				}
			}
		});
btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
				startActivityForResult(i, 0);
			}
		});
btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			ba.disable();	
			}
		});
    }
}
