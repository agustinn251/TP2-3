package comagustinn251.httpsgithub.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class mostrar_mensaje extends AppCompatActivity {
    public Button display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_mensaje);
        display = (Button) findViewById(R.id.button);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hola profe",Toast.LENGTH_SHORT).show();
            }
        });
    }
}