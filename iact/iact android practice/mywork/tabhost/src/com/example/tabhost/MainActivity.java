package com.example.tabhost;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabhost=(TabHost) findViewById(R.id.tabhost1);
        tabhost.setup();
        //for adding buttons to tabhost
        
        //tab1
        TabHost.TabSpec tt=tabhost.newTabSpec("");
        tt.setIndicator("login");
        tt.setContent(R.id.tab1);
        tabhost.addTab(tt);
        
        //tab2
        tt=tabhost.newTabSpec("");
        tt.setIndicator("data");
        tt.setContent(R.id.tab2);
        tabhost.addTab(tt);
        
      //tab3
        tt=tabhost.newTabSpec("");
        tt.setIndicator("summmary");
        tt.setContent(R.id.tab3);
        tabhost.addTab(tt);
        
        
        
        
    }

   
}
