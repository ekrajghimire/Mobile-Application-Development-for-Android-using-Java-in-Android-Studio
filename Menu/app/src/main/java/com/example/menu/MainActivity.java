package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_demo,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.item1){
            Toast.makeText(this, "Profile is selected", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.item2) {
            Toast.makeText(this, "Home is selected", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.subitem1) {
            Toast.makeText(this, "About is selected", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.subitem2) {
            Toast.makeText(this, "Contact is selected", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}