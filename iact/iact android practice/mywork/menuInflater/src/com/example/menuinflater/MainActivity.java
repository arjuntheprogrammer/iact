package com.example.menuinflater;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
switch(item.getItemId()){
case R.id.m1:
	Toast.makeText(MainActivity.this,"this is m1",1).show();
	break;

case R.id.m2:
	Toast.makeText(MainActivity.this,"this is m2",1).show();
	break;

case R.id.sub1:
	Toast.makeText(MainActivity.this,"this is sub1 of m1",1).show();
	break;

case R.id.sub2:
	Toast.makeText(MainActivity.this,"this is sub2 of m1",1).show();
	break;
case R.id.sub3:
	Toast.makeText(MainActivity.this,"this is sub3 of m1",1).show();
	break;
case R.id.m3:
	Toast.makeText(MainActivity.this,"this is m3",1).show();
	break;
case R.id.m4:
	Toast.makeText(MainActivity.this,"this is m4",1).show();
	break;

}
    	return super.onMenuItemSelected(featureId, item);
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
