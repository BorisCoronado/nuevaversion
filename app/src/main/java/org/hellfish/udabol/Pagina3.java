package org.hellfish.udabol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pagina3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina3);
    }

    public void a1(View view){
        Intent i = new Intent(this,A1.class);
        startActivity(i);
    }

    public void a2(View view){
        Intent i = new Intent(this,A2.class);
        startActivity(i);
    }
}
