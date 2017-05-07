package com.computomovil.carlose.practica02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display_message);
        // Obten el mensaje del intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // Crea la vista para el texto
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        //Configurar la vista del texto como el layout de la actividad
        setContentView(textView);

    }
}
