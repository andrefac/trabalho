
package com.example.brunab.projeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

public class CadastroCarro extends AppCompatActivity {

    private EditText vPlaca;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdastro_carro);

        vPlaca = findViewById(R.id.editPlaca);

        SimpleMaskFormatter smfPlaca = new SimpleMaskFormatter("LLL-NNNN");
        MaskTextWatcher mtwPlaca = new MaskTextWatcher(vPlaca, smfPlaca);
        vPlaca.addTextChangedListener(mtwPlaca);
    }

    public void voltar (View view){
        finish();
    }

    public void salvar (View view){
        //finish();
    }
}
