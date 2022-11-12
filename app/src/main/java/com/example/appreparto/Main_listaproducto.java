package com.example.appreparto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Main_listaproducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_listaproducto);

    // Create a ListView object reference
    ListView listProducto;
    String[] programName = {"Pedido01", "Pedido02", "Pedido03", "Pedido04", "Pedido05", "Pedido06", "Pedido07", "Pedido08", "Pedido09", "Pedido10"};
    String[] programDescription = {"Pedido01 Description", "Pedido02 Description", "Pedido03 Description",
            "Pedido04 Description", "Pedido05 Description",
            "Pedido06 Description", "Pedido07 Description", "Pedido08 Description",
            "Pedido09 Description", "Pedido10 Description"};

    // Define an integer array to hold the image recourse ids
    int[] programImages = {R.drawable.imagen1, R.drawable.imagen2,
            R.drawable.imagen3, R.drawable.imgen4, R.drawable.imagen5,
            R.drawable.imagen6, R.drawable.imagen7, R.drawable.imagen8,
            R.drawable.imagen9, R.drawable.imagen10};
    }
}