package com.example.brunab.projeto;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.brunab.entidade.ent_funcionario;

public class
CadastroFuncionario extends AppCompatActivity {

    private EditText fun_nome;
    private EditText fun_rg;
    private EditText fun_cpf;
    private EditText fun_cargo;
    private EditText fun_end;
    private EditText fun_date_adm;
    private EditText fun_date_dms;

    private SQLiteDatabase conexao;
    db_class banco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_funcionario);

        fun_nome = findViewById(R.id.fun_nome);
        fun_rg = findViewById(R.id.fun_rg);
        fun_cpf = findViewById(R.id.fun_cpf);
        fun_cargo = findViewById(R.id.fun_cargo);
        fun_end = findViewById(R.id.fun_end);
        fun_date_adm = findViewById(R.id.fun_date_adm);
        fun_date_dms = findViewById(R.id.fun_date_dms);


    }


    public void btVoltar (View view){
        finish();
    }

    public void btSalvar (View view){

        banco = new db_class(this);

        ent_funcionario funcionario = new ent_funcionario();
        funcionario.setFun_nome(fun_nome.getText().toString());
        funcionario.setFun_rg(fun_rg.getText().toString());
        funcionario.setFun_cpf(fun_cpf.getText().toString());
        funcionario.setFun_cargo(fun_cargo.getText().toString());
        funcionario.setFun_end(fun_end.getText().toString());
        funcionario.setFun_date_adm(fun_date_adm.getText().toString());
        funcionario.setFun_date_dms(fun_date_dms.getText().toString());

    try {
        conexao = banco.getReadableDatabase();
        ContentValues values = new ContentValues();

        values.put("cpf", funcionario.getFun_cpf());
        values.put("nome", funcionario.getFun_nome());
        values.put("rg", funcionario.getFun_rg());
        values.put("endereco", funcionario.getFun_end());
        values.put("cargo", funcionario.getFun_cargo());
        values.put("dt_adm", funcionario.getFun_date_adm());
       // values.put("dt_contr", funcionario.getFun_date_adm());
        values.put("dt_demi", funcionario.getFun_date_dms());




    }catch (Exception e){}

    }
}
