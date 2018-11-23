
package com.example.brunab.projeto;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.brunab.entidade.ent_carro;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

public class CadastroCarro extends AppCompatActivity {

    private EditText marca;
    private EditText modelo;
    private EditText placa;
    private EditText vLocacao;
    private EditText vSeguro;

    db_class banco;
    private SQLiteDatabase conexao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdastro_carro);

        marca = findViewById(R.id.car_Marca);
        modelo = findViewById(R.id.car_Modelo);
        placa = findViewById(R.id.car_Placa);
        vLocacao = findViewById(R.id.car_Vlocacao);
        vSeguro = findViewById(R.id.car_Vseguro);
    }

    public void voltar (View view){
        finish();
    }

    public void salvar (View view){
        //finish();
        ent_carro carro = new ent_carro();
        carro.setMarca(marca.getText().toString());
        carro.setModelo(modelo.getText().toString());
        carro.setPlaca(placa.getText().toString());
        carro.setvLocacao(vLocacao.getText().toString());
        carro.setvSeguro(vSeguro.getText().toString());

        banco = new db_class(this);
        try{
            conexao = banco.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("marca", carro.getMarca());
            values.put("modelo", carro.getModelo());
            values.put("placa", carro.getPlaca());
            values.put("vl_loc", carro.getvLocacao());
            values.put("vl_seg", carro.getvSeguro());

            conexao.insert("carro", null, values);
            conexao.close();
        } catch (Exception e){

        }
    }
}
