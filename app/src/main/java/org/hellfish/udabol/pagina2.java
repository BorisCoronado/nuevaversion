package org.hellfish.udabol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pagina2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);
    }
    public void irCroquis(View view){
        Intent i = new Intent(this,Pagina3.class);
        startActivity(i);
    }
}
