package com.sup.pc.mboutechapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AlltheStoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allthe_story);
        Toast.makeText(this,"your going to read about the story of one african girl.",Toast.LENGTH_LONG).show();
    }
}