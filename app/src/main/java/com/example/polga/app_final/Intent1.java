package com.example.polga.app_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Intent1 extends AppCompatActivity {

    TextView etiTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_1);
        etiTelefono = (TextView) findViewById( R.id.eti_telefonoA );

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {//ver si contiene datos
            String datoTelefono= (String) extras.get("telefono");//Obtengo la edad
            String  datoTelefono2=String.valueOf(datoTelefono);
            etiTelefono.setText(datoTelefono);
        }
    }
}
