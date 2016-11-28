package com.example.jaycuffs.drunkchecker;

import android.os.Bundle;
import android.app.Activity;

public class questions extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
