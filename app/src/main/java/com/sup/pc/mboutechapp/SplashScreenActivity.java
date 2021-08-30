package com.sup.pc.mboutechapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ActionBar act;
        act=getSupportActionBar();
        ColorDrawable cd=new ColorDrawable(Color.parseColor("#993300"));
        act.setBackgroundDrawable(cd);
new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent intent=new Intent(getApplicationContext(),SignupActivity.class);
        startActivity(intent);
        finish();
    }
},3000);


    }
}
