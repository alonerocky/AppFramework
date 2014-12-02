package dev.shoulongli.appframework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.logging.Handler;

import dev.shoulongli.appframework.oauth.facebook.FBLoginActivity;
import dev.shoulongli.appframework.oauth.google.GoogleLoginActivity;
import dev.shoulongli.appframework.oauth.google.GoogleLoginActivity2;


public class SplahActivity extends Activity {


    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);

        new android.os.Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
//                Intent i = new Intent(SplahActivity.this, FBLoginActivity.class);
                Intent i = new Intent(SplahActivity.this, GoogleLoginActivity2.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}
