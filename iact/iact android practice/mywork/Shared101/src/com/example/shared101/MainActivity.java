package com.example.shared101;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
Button btn1,btn2;
TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);
        tv=(TextView) findViewById(R.id.textView1);
btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(MainActivity.this,PreferenceActivityDemo.class);
			startActivity(i);
			}
		});
btn2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		showPreferenceInformation();
	}

	private void showPreferenceInformation() {
		// TODO Auto-generated method stub
		SharedPreferences sp=PreferenceManager.getDefaultSharedPreferences(MainActivity.this);

		String username=sp.getString("username","YOUR USER NAME IS :");
		String pass=sp.getString("password","YOUR PASSWORD IS :");
		boolean checkbox=sp.getBoolean("checkbox",false);
		String listprefs=sp.getString("list1", "YOUR LANGUAGE IS :");
		
		  StringBuilder builder= new StringBuilder();  
       builder.append("Username: " + username + "\n");  
		builder.append("Password: " + pass+ "\n");  
       builder.append("Keep me logged in: " + String.valueOf(checkbox) + "\n");  
       builder.append("List preference: " + listprefs);  
       tv.setText(builder.toString());  
		
	}
});

    }
}
