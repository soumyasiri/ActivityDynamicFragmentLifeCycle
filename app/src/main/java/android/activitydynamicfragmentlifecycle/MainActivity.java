package android.activitydynamicfragmentlifecycle;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ACTIVITY : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            DynamicFragment dynamicFragment = new DynamicFragment();
            fragmentTransaction.add(R.id.dynamicFragment_placeholder, dynamicFragment);
            fragmentTransaction.commit();
        }
        Log.e(TAG, "onCreate" + " End");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e(TAG, "onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.e(TAG, "onSaveInstanceState");
        super.onSaveInstanceState(outState);
        Log.e(TAG, "onSaveInstanceState" + " End");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.e(TAG, "onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
        Log.e(TAG, "onConfigurationChanged" + " End");
    }

    @Override
    protected void onStart() {
        Log.e(TAG, "onStart");
        super.onStart();
        Log.e(TAG, "onStart" + " End");
    }

    @Override
    protected void onResume() {
        Log.e(TAG, "onResume");
        super.onResume();
        Log.e(TAG, "onResume" + " End");
    }

    @Override
    protected void onPause() {
        Log.e(TAG, "onPause");
        super.onPause();
        Log.e(TAG, "onPause" + " End");
    }

    @Override
    protected void onStop() {
        Log.e(TAG, "onStop");
        super.onStop();
        Log.e(TAG, "onStop" + " End");
    }

    @Override
    protected void onRestart() {
        Log.e(TAG, "onRestart");
        super.onRestart();
        Log.e(TAG, "onRestart" + " End");
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "onDestroy");
        super.onDestroy();
        Log.e(TAG, "onDestroy" + " End");
    }
}
