package com.example.progressbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    ProgressBar pbs1,pbs2;
    Button action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pbs1 = findViewById(R.id.pbs1);
        pbs2 = findViewById(R.id.pbs2);
        action = findViewById(R.id.btn);
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pbs1.setVisibility(View.VISIBLE);
                pbs2.setVisibility(View.VISIBLE);
                Timer time = new Timer();
                TimerTask  task = new TimerTask() {
                    @Override
                    public void run() {
                        count++;
                        pbs1.setProgress(count);
                        pbs2.setProgress(count);
                        if(count==100){
                            Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                            startActivity(intent);
                        }
                    }
                };
                time.schedule(task,100,100);
            }
        });
    }
}
