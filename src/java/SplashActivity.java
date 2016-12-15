package com.wekitt;

import android.os.Bundle;
import android.os.Handler;

import android.view.View;

import android.app.Activity;
import android.content.Intent;


public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN );

        /* new Handler().postDelayed( new Runnable(){

            @Override
            public void run() {
                Intent mainIntent = new Intent( SplashScreen.this, PageSplashBase.class );
                SplashScreen.this.startActivity( mainIntent );
                SplashScreen.this.finish();
            }

        }, SPLASH_DISPLAY_LENGTH ); */

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
