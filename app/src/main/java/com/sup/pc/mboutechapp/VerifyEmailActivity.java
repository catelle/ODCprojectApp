package com.sup.pc.mboutechapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VerifyEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_email);
        ActionBar act;
        act=getSupportActionBar();
        ColorDrawable cd=new ColorDrawable(Color.parseColor("#993300"));


        act.setBackgroundDrawable(cd);
    }

    public void resendconfirmationemailfunction(View view) {
    }

    public void sendThecodefunction(View view) {
        Intent intent=new Intent(getApplicationContext(),WelcomeActivity.class);
        startActivity(intent);
    }
}