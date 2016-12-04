package com.example.galleryimageview;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends Activity {
Gallery ga;
ImageView iv1,iv2;
int m;
int str[]={R.drawable.aa,R.drawable.bb,R.drawable.cc,
		   R.drawable.dd,R.drawable.ee,R.drawable.ff,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1=(ImageView) findViewById(R.id.imageView1);
        ga=(Gallery)findViewById(R.id.gallery1);
        ga.setAdapter(new CustomAdapter());
        ga.setOnItemClickListener(new OnItemClickListener() {
        	
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
				iv1.setImageResource(str[arg2]);
			}
		});
    
    }
    public class CustomAdapter extends BaseAdapter{

    	public CustomAdapter(){
    		// sets a grey background; wraps around the images
			TypedArray ta=obtainStyledAttributes(R.styleable.MyGallery);
			m=ta.getResourceId(R.styleable.MyGallery_android_galleryItemBackground,0);
			ta.recycle();
					}
    	
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return str.length;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return arg0;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return arg0;
		}

		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			iv2=new ImageView(getApplicationContext());
			iv2.setImageResource(str[arg0]);
			iv2.setBackgroundResource(m);
			iv1.setBackgroundResource(m);
			return iv2;
			
			
		
		}
    	
    }
    
    
     
}
