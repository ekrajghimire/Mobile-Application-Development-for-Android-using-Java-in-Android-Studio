package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doAction(View view) {
        double v1 = 0, v2 = 0;
        EditText et1 = findViewById(R.id.et1);
        EditText et2 = findViewById(R.id.et2);
        if (et1.getText().length() > 0) {
            v1 = Double.parseDouble(et1.getText().toString());
            v2 = v1 * 2.54;
            if (et2.getText().length() > 0) {
                v2 = Double.parseDouble(et2.getText().toString());
                v1 = v2 / 2.54;
            }
        } else {
            Toast.makeText(getApplicationContext(), "please enter a value", Toast.LENGTH_LONG).show();
            et1.setText("");
            et2.setText("");
        }
        et1.setText(Double.toString(v1));
        et2.setText(Double.toString(v2));
    }
    public void clear(View view){
        double v1=0,v2=0;
        EditText e1=findViewById(R.id.et1);
        EditText e2=findViewById(R.id.et2);
        e1.setText("");
        e2.setText("");
    }
}