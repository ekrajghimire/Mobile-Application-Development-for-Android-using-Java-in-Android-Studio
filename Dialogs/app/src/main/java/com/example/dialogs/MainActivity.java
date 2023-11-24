package com.example.dialogs;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity { Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); dialog = new Dialog(MainActivity.this);
    }
    public void cust(View view){
        dialog.setContentView(R.layout.dialog_lay); dialog.show();
    }
    public void ale(View view){
        AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
        build.setMessage("Confirm?");
        build.setTitle("Caution!!!");
        build.setCancelable(true);
        build.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish(); }
        });
        build.setNegativeButton("No", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) { dialog.cancel();
                    } });
        build.setIcon(R.drawable.baseline_airplanemode_active_24);
        build.create().show();
    }
}