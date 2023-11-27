package com.example.internalexamtestlab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText input, output;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        input = findViewById(R.id.et1);
        output = findViewById(R.id.et2);
    }

    public void doAction(View view) {
        calculateFactorial();
    }

    private void calculateFactorial() {
        try {
            int num = Integer.parseInt(input.getText().toString());
            long factorial = calculateRecurFactorial(num);
            String out = String.valueOf(factorial);
            output.setText("Factorial of " + num + " is: " + out);
        } catch (NumberFormatException e) {
            output.setText("Please enter a valid number");
        }
    }

    private long calculateRecurFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateRecurFactorial(num - 1);
        }
    }
}q
