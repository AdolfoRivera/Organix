package com.example.adolfo.organix_kotlin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class agenda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Agenda.");
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
