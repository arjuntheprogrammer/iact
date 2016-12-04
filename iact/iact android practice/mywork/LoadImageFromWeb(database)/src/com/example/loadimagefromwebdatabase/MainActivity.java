package com.example.loadimagefromwebdatabase;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	ImageView image_view;
	Button btnLoadImg ;
    final static String imageLocation="http://192.168.1.7/android101/aa.jpg"; //Use any image location. 
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        image_view = (ImageView)findViewById(R.id.imageview);
        btnLoadImg = (Button)findViewById(R.id.btn_imgload);
        
        btnLoadImg.setOnClickListener(loadImage);
    }
    
    
    View.OnClickListener loadImage = new View.OnClickListener(){
    	public void onClick(View view) {
         loadImage(imageLocation);
            }
     };
    
     Bitmap bitmap;
    void loadImage(String image_location){
    	 
          URL imageURL = null;
          
          try {
        	  imageURL = new URL(image_location);
          	} 
          
          catch (MalformedURLException e) {
              e.printStackTrace();
          	}
          
          try {
        	  HttpURLConnection connection= (HttpURLConnection)imageURL.openConnection();
        	  connection.setDoInput(true);
        	  connection.connect();
              InputStream inputStream = connection.getInputStream();
               
              bitmap = BitmapFactory.decodeStream(inputStream);//Convert to bitmap
              image_view.setImageBitmap(bitmap);
          }
          catch (IOException e) {
              
               e.printStackTrace();
          }
     }
}