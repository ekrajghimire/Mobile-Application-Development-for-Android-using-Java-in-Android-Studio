package com.example.menusanddialogs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView context = findViewById(R.id.context);
        registerForContextMenu(context);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int itemId =item.getItemId();
        if(itemId==R.id.op1) {
        Toast.makeText(this, "Option 1 Selected", Toast.LENGTH_LONG).show();
    }
    else if(itemId==R.id.ops){
        Toast.makeText(this,"Option with sub Selected",Toast.LENGTH_LONG).show();
    }
        return super.onOptionsItemSelected(item);
    }
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuinfo){
        super.onCreateContextMenu(menu, view, menuinfo);
        menu.setHeaderTitle("Context Menu");
        getMenuInflater().inflate(R.menu.options_menu,menu);
    }
    public boolean onContextItemSelected(MenuItem item){
        int itemId=item.getItemId();
        if(itemId==R.id.op1) {
            Toast.makeText(this, "Option 1 Selected", Toast.LENGTH_LONG).show();
        }
        else if(itemId==R.id.ops){
            Toast.makeText(this,"Option with sub Selected",Toast.LENGTH_LONG).show();
        }
        return super.onContextItemSelected(item); }
}