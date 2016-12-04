package com.example.ratingbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnRatingBarChangeListener, OnClickListener{

	RatingBar rb;
	TextView tv;
	Button b1;
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb=(RatingBar) findViewById(R.id.ratingBar1);
        b1=(Button) findViewById(R.id.button1);
        tv=(TextView) findViewById(R.id.textView1);
        rb.setOnRatingBarChangeListener(this);
        b1.setOnClickListener(this);
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
		// TODO Auto-generated method stub
		tv.setText("rating is"+arg1);
		
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.button1)
		{
			String rate=String.valueOf(rb.getRating());
			Toast.makeText(MainActivity.this, "rating is "+rate,1).show();
					
		}
	}
    
}
