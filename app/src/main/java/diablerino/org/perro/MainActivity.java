package diablerino.org.perro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.enviar).setOnClickListener(new View.OnClickListener() { //Evento -> Clase interna anónima
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Tumensaje se envió",Toast.LENGTH_LONG).show();

            }
        }); //Carpeta R. =res
    }
}
