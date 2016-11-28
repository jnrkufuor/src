package com.example.jaycuffs.drunkchecker;

import android.os.Bundle;
import android.app.Activity;

public class checker_dashboard extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checker_dashboard);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
