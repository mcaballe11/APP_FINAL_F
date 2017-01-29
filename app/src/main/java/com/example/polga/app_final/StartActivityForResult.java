package com.example.polga.app_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class StartActivityForResult extends AppCompatActivity implements View.OnClickListener {

    private final static int MARCA = 0;
    private final static int TIPO = 1;

    EditText etMarca, etTipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_for_result);

        etMarca = (EditText) findViewById(R.id.etMarca);
        etTipo = (EditText) findViewById(R.id.etTipo);

        findViewById(R.id.btnOK1).setOnClickListener(this);
        findViewById(R.id.btnOK2).setOnClickListener(this);
    }

    public void rellenarMarca(View v) {
        Intent i = new Intent(this, StartActivityForResult2.class);
        startActivityForResult(i, MARCA);
    }
    public void rellenarTipo(View v) {
        Intent i = new Intent(this, StartActivityForResult2.class);
        startActivityForResult(i, TIPO);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_CANCELED) {
            Toast.makeText(this, "Resultado cancelado", Toast.LENGTH_SHORT)
                    .show();
        } else {
            String resultado = data.getExtras().getString("RESULTADO");
            switch (requestCode) {
                case MARCA:
                    etMarca.setText(resultado);
                    break;
                case TIPO:
                    etTipo.setText(resultado);
                    break;
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnOK1:
                rellenarMarca(v);
                break;
            case R.id.btnOK2:
                rellenarTipo(v);
                break;
        }
    }
}