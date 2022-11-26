package com.example.appreparto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CuadInfo extends AppCompatActivity {
    Button button5, button8, button9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuad_info);
        button5 = findViewById(R.id.button5);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CuadInfo.this,MainActivity_listaproducto.class));
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CuadInfo.this,Registrar.class));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CuadInfo.this,MainActivity_producto.class));
            }
        });
    }

    public void verDestino( View view ) {
    }

    public void verproducto( View view ) {
    }
}