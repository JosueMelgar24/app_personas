package com.example.app_personas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button btnlista,btnAgregarPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnlista = findViewById(R.id.btnListaPersonas);
        btnAgregarPersonas = findViewById(R.id.btnIngresarPersona);



        btnlista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // llamar a lista
                Intent Lista = new Intent(getApplicationContext(), ActivityList.class);
                startActivity(Lista);
            }
        });
        btnAgregarPersonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear a Persona
                Intent crearPersona = new Intent(getApplicationContext(), ActivityIngresar.class);
                startActivity(crearPersona);
            }

        });
    }
}