package com.blek.kamus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.*;
import android.support.v7.widget.*;
import android.support.v7.app.AppCompatActivity.*;

public class SplashActivity extends AppCompatActivity {
private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
		
			@Override	
			public void run() {
			Intent i = new Intent(SplashActivity.this, MainActivity.class);
			startActivity(i);
			finish();	
			}
		},SPLASH_TIME_OUT);
    }

}
