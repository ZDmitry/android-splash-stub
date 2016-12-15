package com.wekitt;

import android.os.Bundle;
import android.os.Handler;

import android.view.View;

import android.app.Activity;
import android.content.Intent;


public class SplashActivity extends Activity {

    private final int SPLASH_DISPLAY_LENGTH = 1 * 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
    }

    @Override
    protected void onStart() {
        super.onStart();

        // this.delayedSplash(SPLASH_DISPLAY_LENGTH);
        this.finishSplash();
    }

    public void finishSplash() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    protected void delayedSplash(final int delay) {
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                SplashActivity.this.finishSplash();
            }

        }, delay);
    }

}
