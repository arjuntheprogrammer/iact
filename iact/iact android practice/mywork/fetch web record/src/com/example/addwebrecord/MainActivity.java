
package com.example.addwebrecord;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
Button btn;
EditText et1;
TextView tv;
InputStream is;
String abc,ename,eno,en;
ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button1);
        et1=(EditText) findViewById(R.id.editText1);
        tv=(TextView) findViewById(R.id.textView2);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			new FetchData().execute();	
			}
		});
    }
    public class FetchData extends AsyncTask<String, String,String>
    {

		@Override
		protected String doInBackground(String... arg0) {
			// TODO Auto-generated method stub
			en=(et1.getText().toString());
			try {
				
HttpClient obj1=new DefaultHttpClient();
HttpPost obj2= new HttpPost("http://192.168.1.7/android101/fetch_record.php?emp="+en);
//HttpPost obj2= new HttpPost("http://10.0.2.2/android101/fetch_record.php?emp="+en);
HttpResponse obj3=obj1.execute(obj2);
HttpEntity obj4=obj3.getEntity();
is=obj4.getContent();
			} catch (Exception e) {
				Log.e("Error in first module",e.toString());
			}
			try {
				BufferedReader obj5= new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
				StringBuilder sb= new StringBuilder();
				String line=null;
				while ((line=obj5.readLine())!=null) {
					sb.append(line+"\n");					
				}
				is.close();
				abc=sb.toString();
			} catch (Exception e) {
				Log.e("Error in Second module",e.toString());
			}
				
		try {
				
				JSONArray ja=new JSONArray(abc);
					JSONObject jsonobject=ja.getJSONObject(0);
					eno=jsonobject.getString("id");
					ename=jsonobject.getString("name");
			} catch (Exception e) {
			}

			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			// TODO Auto-generated method stub
		pd.dismiss();
		StringBuilder sb=new StringBuilder();
		sb.append("\n Employee Number is :"+eno);
		sb.append("\n Employee Name is :"+ename);
		tv.setText(""+sb.toString());
			super.onPostExecute(result);
		}

		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
			pd=new ProgressDialog(MainActivity.this);
			pd.setMessage("please wait....");
			pd.show();
		}
    	
    }
}
