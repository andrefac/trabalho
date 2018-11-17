package com.example.brunab.projeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class cadastro_cliente extends AppCompatActivity {

    private EditText cNome;
    private EditText cCpf;
    private EditText cRg;
    private EditText cCnh;
    private EditText cDependente;
    private EditText cEndereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente);

        cNome = findViewById(R.id.cli_nome);
        cCpf = findViewById(R.id.cli_cpf);
        cRg = findViewById(R.id.cli_rg);
        cCnh = findViewById(R.id.cli_cnh);
        cDependente = findViewById(R.id.cli_dep);
        cEndereco = findViewById(R.id.cli_ender);
    }

    public void acSalvaCliente (View view){

    }

    public void acCancelar (View view){
        finish();
    }
}
