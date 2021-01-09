package com.cursoandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Definir intent a ser passado no startActivity e qual será a Acitivity.
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //Passar Dados
                intent.putExtra("nome", "Kaic");
                intent.putExtra("idade", 23);

                //Abrir a Activity
                startActivity(intent);

            }
        });

    }


}
