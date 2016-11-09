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
    public void bloqueA(View view){
        Intent i = new Intent(this,BloqueA.class);
        startActivity(i);
    }

    public void bloqueC(View view){
        Intent i = new Intent(this,BloqueC.class);
        startActivity(i);
    }

    public void bloqueCC(View view){
        Intent i = new Intent(this,BloqueCc.class);
        startActivity(i);
    }

    public void bloqueD(View view){
        Intent i = new Intent(this,BloqueD.class);
        startActivity(i);
    }

    public void bloqueG(View view){
        Intent i = new Intent(this,BloqueG.class);
        startActivity(i);
    }
}
