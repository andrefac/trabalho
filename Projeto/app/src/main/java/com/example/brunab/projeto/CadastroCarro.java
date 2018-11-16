
package com.example.brunab.projeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadastroCarro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdastro_carro);
    }

    public void voltar (View view){
        finish();
    }

    public void salvar (View view){
        finish();
    }
}
