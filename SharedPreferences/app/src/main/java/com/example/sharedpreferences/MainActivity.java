package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView etName,etAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.txtname);
        etAge=findViewById(R.id.txtage);
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp=getSharedPreferences("MyOwnFile", MODE_PRIVATE);
        String s1=sp.getString("Name", "");
        int age=sp.getInt("Age", 0);
        etName.setText(s1);
        etAge.setText(String.valueOf(age));
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sp=getSharedPreferences("MyOwnFile", MODE_PRIVATE);
        SharedPreferences.Editor myeditor=sp.edit();
        myeditor.putString("Name", etName.getText().toString());
        myeditor.putInt("Age",Integer.parseInt(etAge.getText().toString()));
        myeditor.commit();
    }
}