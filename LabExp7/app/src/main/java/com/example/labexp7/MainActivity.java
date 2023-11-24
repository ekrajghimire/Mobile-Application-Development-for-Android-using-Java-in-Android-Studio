package com.example.labexp7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner s = findViewById(R.id.spinner);
        String item[] = {"Choose an option:","Height", "Weight"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,item);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int pos = adapterView.getSelectedItemPosition();
                if(pos == 0){

                }else if(pos ==1){
                    Intent height = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(height);
                }else {
                    Intent weight = new Intent(getApplicationContext(), MainActivity3.class);
                    startActivity(weight);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
