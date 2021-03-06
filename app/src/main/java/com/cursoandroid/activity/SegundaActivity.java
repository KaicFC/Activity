package com.cursoandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome, textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        //Recuperar Dados de uma Activity para outra - BUNDLE
        // getExtras recupera todos os dados(Array)
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");

            //Recuperar objetos
            //Convertendo Serializable para Usuario (CAST)?
        Usuario usuario = (Usuario) dados.getSerializable("objeto");

        //Configurar valores recuperados
        textNome.setText(nome);
        textIdade.setText(String.valueOf(idade));

        //Valores do Objeto
        //textNome.setText(usuario.getNome());
        //textIdade.setText(usuario.getEmail());
    }



}
