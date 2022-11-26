package com.example.appreparto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Registrar extends AppCompatActivity {
    Button button9, registrar, ENTREGAEXITOSA;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Registro");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        registrar = findViewById(R.id.registrar);
        ENTREGAEXITOSA = findViewById(R.id.ENTREGAEXITOSA);
        firebaseAuth = FirebaseAuth.getInstance();

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