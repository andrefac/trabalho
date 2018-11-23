package com.example.brunab.projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class locacao extends AppCompatActivity {

    private EditText locaNome;
    private EditText locaPlaca;
    private EditText locaKmInicial;
    private EditText locaDataLoca;
    private EditText locaDataDev;
    private EditText locaKmFinal;
    private EditText locaValor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locacao);

        locaNome = findViewById(R.id.locaNome);
        locaPlaca = findViewById(R.id.locaPlaca);
        locaKmInicial = findViewById(R.id.locaKmInicial);
        locaDataLoca = findViewById(R.id.locaDataLoca);
        locaDataDev = findViewById(R.id.locaDataDev);
        locaKmFinal = findViewById(R.id.locaKmFinal);
        locaValor = findViewById(R.id.locaValor);


    }

    public void acSalvaLocacao (View view){

        

    }

    public void acCancelar (View view){


        finish();

    }
}
