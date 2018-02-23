package com.example.adolfo.organix_kotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class tomar_foto extends AppCompatActivity {
   // @Override
  /*  public void setTitle(int titleId) {
        super.setTitle(titleId);
        setTitle("Preuba");
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomar_foto);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Agregar Tarea");
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
       // setTitle("Preuba");
        return true;

    }
}
