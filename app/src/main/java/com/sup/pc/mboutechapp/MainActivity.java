package com.sup.pc.mboutechapp;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText mail, mdp;
    Button con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar act;
        act=getSupportActionBar();
        ColorDrawable cd=new ColorDrawable(Color.parseColor("#993300"));


        act.setBackgroundDrawable(cd);

        mail=(EditText)findViewById(R.id.mail);
        mdp=findViewById(R.id.pwd);
        con=findViewById(R.id.loginbutton);




       con.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String mymail= String.valueOf(mail.getText());
               String mypass= String.valueOf(mdp.getText());
               if(mymail.length()<8){
                   mail.setError("l'email doit etre sous la forme toto@gmail.com");


               }else if(mypass.length()<8){
                   mdp.setError("le mot de passe doit avoir au moins 8 caracteres");

               }else{
                   Intent intent=new Intent(getApplicationContext(),WelcomeActivity.class);
                   startActivity(intent);
                   finish();
               }

           }
       });

    }


    public void signinpageopenfunction(View view) {
        Intent in=new Intent(getApplicationContext(),SignupActivity.class);
        startActivity(in);
    }

    public void passwordForgotFunction(View view) {
    }
}


