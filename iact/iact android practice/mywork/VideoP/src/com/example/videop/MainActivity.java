package com.example.videop;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {
VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vv=(VideoView) findViewById(R.id.videoView1);
		vv.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.aa));
		vv.setMediaController(new MediaController(this));
		vv.start();
    }
}
