package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    ImageButton add, sub, mult, div;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.etFirst);
        num2 = findViewById(R.id.etSecond);
        add = findViewById(R.id.btnadd);
        sub = findViewById(R.id.btnmin);
        mult = findViewById(R.id.btnmult);
        div = findViewById(R.id.btndiv);
        output = findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double x = Double.parseDouble(String.valueOf(num1.getText()));
                Double y = Double.parseDouble(String.valueOf(num2.getText()));
                output.setText(""+(x+y));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double x = Double.parseDouble(String.valueOf(num1.getText()));
                Double y = Double.parseDouble(String.valueOf(num2.getText()));
                output.setText(""+(x-y));
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double x = Double.parseDouble(String.valueOf(num1.getText()));
                Double y = Double.parseDouble(String.valueOf(num2.getText()));
                output.setText(""+(x*y));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double x = Double.parseDouble(String.valueOf(num1.getText()));
                Double y = Double.parseDouble(String.valueOf(num2.getText()));
                output.setText(""+(x/y));
            }
        });
    }
}