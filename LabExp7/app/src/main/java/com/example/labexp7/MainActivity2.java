package com.example.labexp7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void doAction(View view) {
        double v1 =0,v2 = 0;
        EditText e = findViewById(R.id.ed1);
        EditText e1= findViewById(R.id.ed2);
        if(e.getText().length()>0){
            v1 = Double.parseDouble(e.getText().toString());
            v2 = v1*2.54;
            if(e1.getText().length()>0){
                v2 = Double.parseDouble(e.getText().toString());
                v1 = v2/2.54;
            }
        }
        else {
            Toast.makeText(getApplicationContext(),"please enter a value",Toast.LENGTH_LONG).show();
            e.setText("");
            e1.setText("");
        }
        e.setText(Double.toString(v1));
        e1.setText(Double.toString(v2));
    }

    public void clear(View view) {
        double v1 =0,v2 = 0;
        EditText e = findViewById(R.id.ed1);
        EditText e1= findViewById(R.id.ed2);
        e.setText("");
        e1.setText("");
    }
    public void hback(View view) {
        Intent heightback = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(heightback);
    }
}

