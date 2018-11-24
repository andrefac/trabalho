package com.example.brunab.projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void acCarro (View view){
        Intent it = new Intent(MainActivity.this, CadastroCarro.class);
        startActivity(it);
    }

    public void acFunc (View view){
        Intent it = new Intent(MainActivity.this, CadastroFuncionario.class);
        startActivity(it);
    }

    public void acLocacao (View view){
        Intent it = new Intent(MainActivity.this, locacao.class);
        startActivity(it);
    }

    public void acCliente (View view){
        Intent it = new Intent(MainActivity.this, cadastro_cliente.class);
        startActivity(it);
    }

    public void sair (View view){
        finish();

    }
}
