package com.example.brunab.projeto;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.brunab.entidade.ent_cliente;

public class cadastro_cliente extends AppCompatActivity {

    private EditText cNome;
    private EditText cCpf;
    private EditText cRg;
    private EditText cCnh;
    private EditText cDependente;
    private EditText cEndereco;
    db_class banco;
    private SQLiteDatabase conexao;

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

        banco = new db_class(this);


        ent_cliente cliente = new ent_cliente();
        cliente.setcNome(cNome.getText().toString());
        cliente.setcCpf(cCpf.getText().toString());
        cliente.setcRg(cRg.getText().toString());
        cliente.setcCnh(cCnh.getText().toString());
        cliente.setcDependente(cDependente.getText().toString());
        cliente.setcEndereco(cEndereco.getText().toString());


        try {
            conexao = banco.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("cpf", cliente.getcCpf());
            values.put("nome", cliente.getcNome());
            values.put("rg", cliente.getcRg());
            values.put("cnh", cliente.getcCnh());
            values.put("n_dependentes", cliente.getcDependente());
            values.put("endereco", cliente.getcEndereco());

            conexao.insert("Cliente", null, values);
            conexao.close();

        } catch (Exception e){

        }
    }

    public void acCancelar (View view){
        finish();
    }
}
