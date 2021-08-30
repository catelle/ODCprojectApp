package com.sup.pc.mboutechapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ServiceActivity extends AppCompatActivity {
Button save,cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        ActionBar act;
        act=getSupportActionBar();
        ColorDrawable cd=new ColorDrawable(Color.parseColor("#303F9F"));
        if(act!=null){
            act.setBackgroundDrawable(cd);
        }

        cancel=findViewById(R.id.cancel);
        save=findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),WelcomeActivity.class);
                startActivity(intent);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"nous avons besoin de vos données pour une meilleure expérience",Toast.LENGTH_LONG).show();
            }
        });

        Toast.makeText(this,"We need your data for a better experience !",Toast.LENGTH_LONG).show();
    }


    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.my_option_menu,menu);
        return true;
    }
   public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profil:


                //traitement

                return true;

            case R.id.item2:

                //traitement

                return true;

            default:
                return
                        super.onOptionsItemSelected(item);
        }
    }




}