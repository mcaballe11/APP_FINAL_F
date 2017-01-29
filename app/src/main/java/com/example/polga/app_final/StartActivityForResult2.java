package com.example.polga.app_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivityForResult2 extends AppCompatActivity {

    Button btnAceptar, btnCancelar;
    EditText etResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_for_result2);
        btnAceptar = (Button)findViewById(R.id.btnAceptar);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        etResult = (EditText)findViewById(R.id.editDatos);


        btnAceptar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (etResult.getText().length() != 0) {
                    String resultado = etResult.getText().toString();
                    Intent i = getIntent();
                    i.putExtra("RESULTADO", resultado);
                    setResult(RESULT_OK, i);

                    finish();
                } else {
                    Toast.makeText(StartActivityForResult2.this, "No hay nada", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);

                finish();
            }
        });
    }
}