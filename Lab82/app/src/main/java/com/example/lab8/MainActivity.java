package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        Spinner s = findViewById(R.id.sp1);
        String item[]={"Choose Topic","Android","Testing","Java"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,item);
        s.setAdapter(adapter);

        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int pos = adapterView.getSelectedItemPosition();
                if(pos == 0){

                }else if(pos ==1){
                    Intent Android = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(Android);
                }else if (pos == 2){
                    Intent Testing = new Intent(getApplicationContext(), MainActivity3.class);
                    startActivity(Testing);
                }else {
                    Intent Java = new Intent(getApplicationContext(), MainActivity4.class);
                    startActivity(Java);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
