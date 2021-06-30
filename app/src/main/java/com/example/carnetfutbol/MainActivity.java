package com.example.carnetfutbol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //se pone el setContent a la ventana actual
        ImageView logo = (ImageView) findViewById(R.id.imageViewCarnetMadridista);
        logo.setImageResource(R.drawable.carnetmadridista);
        //logo.setMaxWidth(123);
        //logo.setMaxHeight(123);

    }

    public void cambiarActividad(View view) {
        Intent i = new Intent(this, ventana_formulario.class);
        startActivity(i);
    }
}
