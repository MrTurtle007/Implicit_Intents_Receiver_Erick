package com.example.implicit_intents_receiver_erick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtiene en intent entrante que se usó al activar la activity
        Intent intent = getIntent();

        //obtiene los datos del intent, siempre es un objeto URI
        Uri uri = intent.getData();

        //si es null, se crea una cadena con ese uri
        if (uri != null) {
            String uri_string = "URI: " + uri.toString();

            //se guarda el id del TextView
            TextView textView = findViewById(R.id.text_uri_message);

            //ponemos la cadena en el TextView
            textView.setText(uri_string);
        }
    }
}