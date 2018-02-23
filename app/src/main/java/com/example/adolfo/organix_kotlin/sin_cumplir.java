package com.example.adolfo.organix_kotlin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class sin_cumplir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin_cumplir);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("No Cumplido");
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
