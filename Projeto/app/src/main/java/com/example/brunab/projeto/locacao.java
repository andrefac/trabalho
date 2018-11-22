package com.example.brunab.projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class locacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locacao);
    }

    public void acSalvaLocacao (View view){

    }

    public void acCancelar (View view){
        finish();
    }
}
