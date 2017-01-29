package com.example.polga.app_final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.Manifest.permission_group.SMS;

//Propiedad es mia 2

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void abrirIntent(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, Intent_main.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void abrirStart(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, StartActivityForResult.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void abrirSharedPreferences(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, Shared_main.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void abrirSQL(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, SqlitePrincipal.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void abrirSMS(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, SMS_m.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void abrirBattery(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, Battery_m.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


    public void abrirFichero(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, Fichero.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void abrirContent(View view){
        // Hace algo cuando pulsemos el botón
        Intent intent = new Intent(this, Content.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
