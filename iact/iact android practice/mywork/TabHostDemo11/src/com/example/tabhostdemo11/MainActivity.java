package com.example.tabhostdemo11;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
		TabHost tabhost=(TabHost)findViewById(R.id.tabhost1);
		tabhost.setup();
		//for using to add buttons in TabHost
		
		//tab1
		TabHost.TabSpec tt=tabhost.newTabSpec("");
		tt.setIndicator("LOGIN");
		tt.setContent(R.id.tab1);
		tabhost.addTab(tt);
		
		//tab2
		tt=tabhost.newTabSpec("");
		tt.setIndicator("DATA");
		tt.setContent(R.id.tab2);
		tabhost.addTab(tt);
		
		//tab3
		tt=tabhost.newTabSpec("");
		tt.setIndicator("SUMMARY");
		tt.setContent(R.id.tab3);
		tabhost.addTab(tt);
		

    }
}
