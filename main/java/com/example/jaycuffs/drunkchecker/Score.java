package com.example.jaycuffs.drunkchecker;

import android.os.Bundle;
import android.app.Activity;

public class Score extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
