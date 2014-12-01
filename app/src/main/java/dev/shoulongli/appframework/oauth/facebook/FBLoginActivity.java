package dev.shoulongli.appframework.oauth.facebook;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

/**
 * Created by shoulongli on 11/28/14.
 */
public class FBLoginActivity extends FragmentActivity {

    private FBLoginFragment fbLoginFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("FBLoginActivity","onCreate");
        if (savedInstanceState == null) {
            // Add the fragment on initial activity setup
            fbLoginFragment = new FBLoginFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, fbLoginFragment)
                    .commit();
        } else {
            // Or set the fragment from restored state info
            fbLoginFragment = (FBLoginFragment) getSupportFragmentManager()
                    .findFragmentById(android.R.id.content);
        }
    }
}
