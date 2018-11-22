package com.example.brunab.projeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class
CadastroFuncionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_funcionario);
    }

    public void voltar (View view){
        finish();
    }

    public void salvar (View view){
        finish();
    }
}
