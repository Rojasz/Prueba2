package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner SP1;
    Button BTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SP1 = (Spinner) findViewById(R.id.spinner);
        BTN = (Button) findViewById(R.id.button);

        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Destination = SP1.getSelectedItem().toString();
                Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                I.putExtra("Destination", Destination);
                startActivity(I);

        }
    });
}
}