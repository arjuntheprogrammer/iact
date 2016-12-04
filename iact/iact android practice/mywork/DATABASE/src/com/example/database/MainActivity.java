package com.example.database;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
Button btn;
EditText et;
SQLiteDatabase sq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button1);
        et=(EditText) findViewById(R.id.editText1);
        sq=openOrCreateDatabase("mydb",Context.MODE_PRIVATE,null);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String id=et.getText().toString();
			String qry="select * from mytable where id='"+id+"'";
			Cursor c=sq.rawQuery(qry, null);
			if(c.moveToNext())
			{
				Toast.makeText(MainActivity.this, ""+c.getInt(0)+" name:"+c.getString(1),1).show();
			}
			else
			{
				Toast.makeText(MainActivity.this, "no data", 1).show();
			}
			}
		});
    }    
}

