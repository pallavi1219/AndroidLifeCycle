package com.example.hanupallavi.lifecycledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showLog("OnCreate Finished.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showLog("onStart Finished.");
    }


    @Override
    protected void onResume() {
        super.onResume();
        showLog("onResume Finished.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showLog("onPause Finished.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showLog("onStop Finished.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showLog("onRestart Finished.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showLog("onDestroy Finished.");
    }

    public void startAnotherActivity(View view) {

        startActivity(new Intent(this, SecondActivity.class));
    }

    public void finishActivity(View view) {
        finish();
    }

    private void showLog(String message) {
        Log.d("lifecycle Test", message);
    }
}
