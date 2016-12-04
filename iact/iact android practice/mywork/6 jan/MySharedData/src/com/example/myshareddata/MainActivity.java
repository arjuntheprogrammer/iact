 package com.example.myshareddata;
//temperory database
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Map;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
Button btn;
EditText et;
SharedPreferences sp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et=(EditText) findViewById(R.id.editText1);
		btn=(Button) findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String g=et.getText().toString();
	             sp=getSharedPreferences("FILE", MODE_PRIVATE);
	             SharedPreferences.Editor editor=sp.edit();
	             editor.putString("k", g);
	             editor.commit();
	             Toast.makeText(MainActivity.this, sp+"#"+editor, 15).show();
	             //for view in mobile
	             
	             File myPath = new File(Environment.getExternalStorageDirectory().
				 toString());
	             File myFile = new File(myPath, "filename");
	             try
	             {
	                 FileWriter fw = new FileWriter(myFile);
	                 PrintWriter pw = new PrintWriter(fw);

	                 Map<String,?> prefsMap = sp.getAll();

	                 for(Map.Entry<String,?> entry : prefsMap.entrySet())
	                 {
	                     pw.println(entry.getKey() + ": " + entry.getValue().
						 toString());            
	                 }
	                 pw.close();
	                 fw.close();
	             }
	             catch (Exception e)
	             {
	                 // what a terrible failure...
	                 Log.wtf(getClass().getName(), e.toString());
	             }
	             
	             
			}
		});
	}

	

}
