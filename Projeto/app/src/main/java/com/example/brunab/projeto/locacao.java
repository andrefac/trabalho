package com.example.brunab.projeto;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.brunab.entidade.ent_locacao;

public class locacao extends AppCompatActivity {

    private EditText locaNome;
    private EditText locaPlaca;
    private EditText locaKmInicial;
    private EditText locaDataLoca;
    private EditText locaDataDev;
    private EditText locaKmFinal;
    private EditText locaValor;
    private SQLiteDatabase conexao;
    db_class banco;


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

        banco = new db_class(this);

        ent_locacao locacao = new ent_locacao();
        locacao.setLocaNome(locaNome.getText().toString());
        locacao.setLocaPlaca(locaPlaca.getText().toString());
        locacao.setLocaKmInicial(locaKmInicial.getText().toString());
        locacao.setLocaDataLoca(locaDataLoca.getText().toString());
        locacao.setLocaDataDev(locaDataDev.getText().toString());
        locacao.setLocaKmFinal(locaKmFinal.getText().toString());
        locacao.setLocaValor(locaValor.getText().toString());




        try {

            conexao = banco.getReadableDatabase();
            ContentValues values = new ContentValues();

            values.put("n_cliente", locacao.getLocaNome());
            values.put("placa_carro", locacao.getLocaPlaca());
            values.put("dt_loca", locacao.getLocaDataLoca());
            values.put("km_ini", locacao.getLocaKmInicial());
            values.put("dt_devo", locacao.getLocaDataDev());
            values.put("km_fim", locacao.getLocaKmFinal());
            values.put("valor_total", locacao.getLocaValor());


        }catch (Exception e){

            

        }

    }

    public void acCancelar (View view){


        finish();

    }
}
