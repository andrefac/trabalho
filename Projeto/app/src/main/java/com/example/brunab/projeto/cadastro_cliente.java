package com.example.brunab.projeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cadastro_cliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente);
    }

    public void acSalvaCliente (View view){

    }

    public void acCancelar (View view){
        finish();
    }
}
