package com.example.webview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class SecondActivity extends Activity {
WebView wv;
String url;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		wv=(WebView) findViewById(R.id.webView1);
		url="https://www.google.co.in";
		wv.loadUrl(url);
		
	}
}
