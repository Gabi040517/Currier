package com.example.appreparto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrar extends AppCompatActivity {
    Button button9, registrar, ENTREGAEXITOSA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        registrar = findViewById(R.id.registrar);
        ENTREGAEXITOSA = findViewById(R.id.ENTREGAEXITOSA);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registrar.this,CuadInfo.class));
            }
        });
        ENTREGAEXITOSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registrar.this,CuadInfo.class));
            }
        });
    }
}