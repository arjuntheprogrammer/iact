package com.example.colorchangesensor;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.UrlQuerySanitizer.ValueSanitizer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ChangeSensorColor extends Activity implements SensorEventListener {
Sensor sen;
SensorManager sm;
boolean color=false;
long lastUpdate;
RelativeLayout rl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_change_sensor_color);
		sm=(SensorManager) getSystemService(SENSOR_SERVICE);
		rl=(RelativeLayout) findViewById(R.id.r1);
		rl.setBackgroundColor(Color.RED);
		lastUpdate=System.currentTimeMillis();
	}

	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSensorChanged(SensorEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.sensor.getType()==Sensor.TYPE_ACCELEROMETER)
		{
			getAccelerometer(arg0);
		}
	}

	private void getAccelerometer(SensorEvent arg0) {
		// TODO Auto-generated method stub
		float[] arr=arg0.values;
		float x=arr[0];
		float y=arr[1];
		float z=arr[2];
	float ff=((x*x)+(y*y)+(z*z))/
	(SensorManager.GRAVITY_EARTH*SensorManager.GRAVITY_EARTH);
	long actualTime=System.currentTimeMillis();
	if(ff>=2)
	{
		if(actualTime-lastUpdate<200)
		{
			return;
		}
		lastUpdate=actualTime;
	if(color)
	{
		rl.setBackgroundColor(Color.GREEN);
		Intent i=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
		startActivityForResult(i,0);
		//Toast.makeText(getApplicationContext(), 
		//"DEVICE SHAKED",1).show();
	}
//	else
//	{
//		rl.setBackgroundColor(Color.YELLOW);
//	}
	color=true;
	}
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		sm.unregisterListener(this);
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		sm.registerListener(this,sm.getDefaultSensor
		(Sensor.TYPE_ACCELEROMETER),
		SensorManager.SENSOR_DELAY_NORMAL);
	}
}
 