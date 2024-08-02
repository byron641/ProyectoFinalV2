package com.example.proyectofinalv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Create extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create);
        Button btncreate = findViewById(R.id.BtnCrearUsuario);
        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresarlogin = new Intent(Create.this, Login.class);
                startActivity(regresarlogin);
                Toast.makeText(Create.this, "Usuario Creado con exito, Ingrese usuario y contraseña", Toast.LENGTH_SHORT).show();

            }
        });
    }
}