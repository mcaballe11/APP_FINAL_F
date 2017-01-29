package com.example.polga.app_final;

        import android.Manifest;
        import android.content.ContentResolver;
        import android.content.pm.PackageManager;
        import android.database.Cursor;
        import android.net.Uri;
        import android.support.v4.app.ActivityCompat;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.view.View.OnClickListener;
        import android.provider.CallLog.Calls;
        import android.widget.TextView;

public class Content extends AppCompatActivity {
    private Button btnLlamadas;
    private TextView txtResultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLlamadas = (Button) findViewById(R.id.btnMostrar);
        txtResultados = (TextView) findViewById(R.id.txtView);

        btnLlamadas.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String[] projection = new String[]{
                        Calls.TYPE,
                        Calls.NUMBER,
                        Calls.DURATION,
                        Calls.DATE};

                Uri llamadasUri = Calls.CONTENT_URI;

                ContentResolver cr = getContentResolver();

                if (ActivityCompat.checkSelfPermission(Content.this, Manifest.permission.READ_CALL_LOG) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                Cursor cur = cr.query(llamadasUri,
                        projection, //Columnas a devolver
                        null,       //Condición de la query
                        null,       //Argumentos variables de la query
                        null);      //Orden de los resultados

                if (cur.moveToFirst())
                {
                    int tipo;
                    String tipoLlamada = "";
                    String telefono;
                    String duracion;
                    String fecha;

                    int colTipo = cur.getColumnIndex(Calls.TYPE);
                    int colTelefono = cur.getColumnIndex(Calls.NUMBER);
                    int colDuracion = cur.getColumnIndex(Calls.DURATION);
                    int colFecha = cur.getColumnIndex(Calls.DATE);

                    txtResultados.setText("");

                    do
                    {

                        tipo = cur.getInt(colTipo);
                        telefono = cur.getString(colTelefono);
                        duracion = cur.getString(colDuracion);
                        fecha = cur.getString(colFecha);

                        if(tipo == Calls.INCOMING_TYPE)
                            tipoLlamada = "ENTRADA";
                        else if(tipo == Calls.OUTGOING_TYPE)
                            tipoLlamada = "SALIDA";
                        else if(tipo == Calls.MISSED_TYPE)
                            tipoLlamada = "PERDIDA";

                        txtResultados.append(tipoLlamada + " - " + telefono + " - "+duracion+" - "+fecha+ "\n");

                    } while (cur.moveToNext());
                }
            }
        });
    }
}