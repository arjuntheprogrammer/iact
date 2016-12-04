package com.example.bluetooth;

import java.util.ArrayList;
import java.util.Set;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

Button b1,b2,b3,b4;
//TextView tv;
ListView lv;
BluetoothAdapter ba=null;    
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        
        ba=BluetoothAdapter.getDefaultAdapter();
  //      tv=(TextView) findViewById(R.id.textView1);
        lv=(ListView) findViewById(R.id.listView1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(ba==null)
				{
					Toast.makeText(MainActivity.this, "device not supported",1).show();
					
				}
				else{
					if(ba.isEnabled())
					{
						Toast.makeText(MainActivity.this, "already on",1).show();
						
					}
					else{
						Intent i=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
						startActivityForResult(i,0);
						Toast.makeText(MainActivity.this,"BLUETOOTH ON",1).show();	
						
					}
				}
			}
		});
        b2.setOnClickListener(new OnClickListener() {
			
    			@Override
    			public void onClick(View arg0) {
    				Intent i=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
    				startActivityForResult(i, 0);
    			}
    		});
        b3.setOnClickListener(new OnClickListener() {
    			
    			@Override
    			public void onClick(View arg0) {
    				ba.disable();
    			}
    		});
        
          b4.setOnClickListener(new OnClickListener() {
         
			
			@Override
			public void onClick(View arg0) {
				// tv.append("\nPaired Devices are:");  
				    	
				Set<BluetoothDevice> devices = ba.getBondedDevices();  
	            devices = ba.getBondedDevices();
			      ArrayList list = new ArrayList();
			      
			      for(BluetoothDevice bt : devices)
			      list.add(bt.getName());
			      Toast.makeText(getApplicationContext(),"Showing Paired Devices",Toast.LENGTH_SHORT).show();
			      ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1, list);
			      lv.setAdapter(adapter);
				
				
				
			        //for (BluetoothDevice device : devices) 
		            //{  
		             // tv.append("\n  Device: " + device.getName() + ", " + device);  
		            //}
		            
			}
        } );
        
    
}
}