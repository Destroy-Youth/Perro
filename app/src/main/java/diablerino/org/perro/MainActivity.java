package diablerino.org.perro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText textoCuerpo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textoCuerpo = (EditText) findViewById(R.id.mensaje);
        findViewById(R.id.compartir).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                       //Intent: Clase externa
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND); //Busqueda de aplicaciones que pueden enviar el mensaje
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, textoCuerpo.getText().toString());
                startActivity(Intent.createChooser(sharingIntent, "Enviando Mensaje"));  //Escoger la aplicación donde se va a compartir
            }
        });
    }
}