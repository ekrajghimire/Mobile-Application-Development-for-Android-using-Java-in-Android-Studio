package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView listv;
    String title[] = {"Apple", "Orange", "Tomato"};
    String desc[] = {"Fruit", "Fruit", "Vegetable"};
    int imgsrc[] = {R.drawable.apple, R.drawable.orange, R.drawable.tomato};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}