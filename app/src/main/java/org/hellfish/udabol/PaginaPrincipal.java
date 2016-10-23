package org.hellfish.udabol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PaginaPrincipal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
    }

    public void menuBloques(View view){
        Intent i = new Intent(this,pagina2.class);
        startActivity(i);
    }
    public void datosInteres(View view){
        Intent i = new Intent(this,DatosDeInteres.class);
        startActivity(i);
    }
}
