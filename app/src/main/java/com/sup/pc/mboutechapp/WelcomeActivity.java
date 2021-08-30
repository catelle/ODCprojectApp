package com.sup.pc.mboutechapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.LinkedList;

public class WelcomeActivity extends AppCompatActivity {
    ImageView im;
    FloatingActionButton agendaFab,messageFab,shareFab;
    Boolean isFabOpen=false;
    private final LinkedList<String> mWordmenuList=new LinkedList<>();
    private final LinkedList<ImageView> mImageList=new LinkedList<ImageView>();


    private ArticleDescriptionTextAdapter mtAdapter;

    private RecyclerView mRecyclerviewrecipe;

    private ArticleImageAdapter mIAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ActionBar act;
        act=getSupportActionBar();
        ColorDrawable cd=new ColorDrawable(Color.parseColor("#993300"));
        act.setBackgroundDrawable(cd);
        Toast.makeText(this,"Choose an item",Toast.LENGTH_LONG).show();
        im=findViewById(R.id.imageView3);
        agendaFab=findViewById(R.id.agendaFab);
        messageFab=findViewById(R.id.messageFab);



        mRecyclerviewrecipe=findViewById(R.id.recyclerView);
        mtAdapter=new ArticleDescriptionTextAdapter(this,mWordmenuList);
        mIAdapter=new ArticleImageAdapter(this,mImageList);
        mRecyclerviewrecipe.setAdapter(mtAdapter);
        mRecyclerviewrecipe.setAdapter(mIAdapter);
        mRecyclerviewrecipe.setLayoutManager((new LinearLayoutManager(this)));

        ImageView donut=new ImageView(this);
        donut.setImageResource(R.drawable.imaused);
        ImageView froyo=new ImageView(this);
        froyo.setImageResource(R.drawable.imused2);
        ImageView icecream=new ImageView(this);
        donut.setImageResource(R.drawable.camp2);


       mWordmenuList.addLast("Her story \n Womens are mostly involve in house work, getting married early is a common fact for girls of area like south region, ouest region.");
        mWordmenuList.addLast("All about her \n Womens are mostly involve in house work, getting married early is a common fact for girls of area like south region, ouest region.");
        mWordmenuList.addLast("Why she choosed to be different \n Womens are mostly involve in house work, getting married early is a common fact for girls of area like south region, ouest region" );


        mImageList.addLast(donut);
        mImageList.addLast(froyo);
        mImageList.addLast(icecream );



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_option_menu, menu);
        return true;
    }



    public void Allthestory(View view) {

        Intent intent=new Intent(this,AlltheStoryActivity.class);
        startActivity(intent);

    }

    public void clickonaddFab(View view) {
        if(!isFabOpen){
            Toast.makeText(this,"fab1 clicked",Toast.LENGTH_LONG).show();
            isFabOpen=true;

            agendaFab.animate().translationY(-getResources().getDimension(R.dimen.standard_55));
            messageFab.animate().translationY(-getResources().getDimension(R.dimen.standard_105));
           // agendaFab.animate().translationY(-getResources().getDimension(R.dimen.standard_155));
          //  fab1.setVisibility(View.INVISIBLE);
        }else{
            isFabOpen=false;
            messageFab.animate().translationY(0);

            agendaFab.animate().translationY(0);
          //  fab1.setVisibility(View.VISIBLE);
        }

    }
}