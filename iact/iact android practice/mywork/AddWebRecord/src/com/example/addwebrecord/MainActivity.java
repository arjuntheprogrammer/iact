package com.example.addwebrecord;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
Button btn;
String url;
JSONParser jsonparser;
EditText et1,et2;
ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button1);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        //url="http://10.0.2.2/android101/addrecord.php";
        //10.0.2.2 came from ur prev. knowledge
        
        url="http://192.168.1.7/android101/addrecord.php";
        //192.168.1.7=> this ip address came from typing "ipconfig" in cmd..
        
        jsonparser=new JSONParser();
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			new AddRecord().execute();	
			}
		});
    }
    public class AddRecord extends AsyncTask<String,String,String>
    {

		@Override
		protected String doInBackground(String... arg0) {
			// TODO Auto-generated method stub
String id,name;
id=et1.getText().toString();
name=et2.getText().toString();
List<NameValuePair> parms=new ArrayList<NameValuePair>();
parms.add(new BasicNameValuePair("id1",id));
parms.add(new BasicNameValuePair("name1",name));
JSONObject obj=jsonparser.makeHttpRequest(url,"POST",parms);

			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
			pd.dismiss();
			Toast.makeText(MainActivity.this,"DATA SAVED SUCCESSFULLY",1).show();
		}

		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
			pd=new ProgressDialog(MainActivity.this);
			pd.setTitle("RECORD ADD..");
			pd.setMessage("WORK in PROGRESS....");
			pd.show();
		}
    	
    }
}
