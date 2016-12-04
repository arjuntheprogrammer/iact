package com.example.sqlitedemo;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
Button btn;
SQLiteDatabase sq;
EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button1);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        sq=openOrCreateDatabase("mydb", Context.MODE_PRIVATE,null);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			try
			{
				int id;
				String name,qry1,qry2;
				id=Integer.parseInt(et1.getText().toString());
				name=et2.getText().toString();
			qry1="create table if not exists mytable (id number,name varchar);";
			qry2="insert into mytable (id,name) values ('"+id+"','"+name+"');";
			sq.execSQL(qry1);
			sq.execSQL(qry2);
			Toast.makeText(MainActivity.this,"DATA SAVED",1).show();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			}
		});
    }
}
