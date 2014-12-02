package dev.shoulongli.appframework.oauth.google;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import dev.shoulongli.appframework.R;
/**
 * Created by sli1 on 12/2/14.
 */
public class GoogleLoginFragmentActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_login_3);
        int loginAction = getIntent().getIntExtra(GoogleLoginFragment.EXTRA_ACTION, GoogleLoginFragment.Action.LOGIN);
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.login_fragment);
        if (fragment == null) {
            fragment = GoogleLoginFragment.newInstance(loginAction);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.login_fragment, fragment)
                    .commit();
        }
    }
}
