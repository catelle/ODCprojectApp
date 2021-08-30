package com.sup.pc.mboutechapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {
    EditText nom, prenom, email,phoneNumber, password, vpassword;
    Button save, cancel;

    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ActionBar act;
        act=getSupportActionBar();
        ColorDrawable cd=new ColorDrawable(Color.parseColor("#993300"));
        act.setBackgroundDrawable(cd);
       save=findViewById(R.id.loginbutton);

       save.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(getApplicationContext(),VerifyEmailActivity.class);
               startActivity(intent);
               finish();

           }
       });



    }


    public void loginpageopenfunction(View view) {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }
}


