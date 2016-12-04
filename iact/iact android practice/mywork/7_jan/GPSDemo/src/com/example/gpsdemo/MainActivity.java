package com.example.gpsdemo;

import android.app.Activity;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
Button btn;
TextView tv,tv2;
LocationManager lm;
Location loc,loc2;
double lat,lon,lat2,lon2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button1);
        tv=(TextView) findViewById(R.id.textView1);
        tv2=(TextView) findViewById(R.id.textView2);
        lm=(LocationManager) getSystemService(LOCATION_SERVICE);
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				loc=lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
				loc2=lm.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
				
				if(loc!=null)
				{
				lat=loc.getLatitude();
				lon=loc.getLongitude();
				tv.setText("GPS :\n\n LATITUDE :"+lat+
				"\n\n"+"LONGITUDE :"+lon);
				}
				else
				{
					tv.setText(" GPS NO LATITUDE LOGITUDE FOUND");
					
				}
				if(loc2!=null)
				{
				lat2=loc2.getLatitude();
				lon2=loc2.getLongitude();
				tv2.setText("NETWORK :\n\n LATITUDE :
				"+lat2+"\n\n"+"LONGITUDE :"+lon2);
				}
				else
				{
					tv2.setText("NETWORK NO LATITUDE LOGITUDE FOUND");
					
				}
			}
		});
    }
}
