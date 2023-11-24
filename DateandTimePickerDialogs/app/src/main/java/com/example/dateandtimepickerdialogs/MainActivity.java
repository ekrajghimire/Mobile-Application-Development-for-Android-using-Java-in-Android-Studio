package com.example.dateandtimepickerdialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity {
    TextView tv,tv2;
    Button btn,btntm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        btn=findViewById(R.id.btndate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdialog();
            }
        });
        btntm=findViewById(R.id.btntime);
        btntm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showtime();
            }
        });
    }
    private void showtime() {
        TimePickerDialog timePickerDialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hour, int min) {
                tv2.setText(String.valueOf(hour)+" : "+String.valueOf(min));
            }
        }, 8, 45, false);
        timePickerDialog.show();
    }
    private void showdialog() {
        DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                tv.setText(String.valueOf(year)+"."+String.valueOf(month+1)+"."+String.valueOf(day));
            }
        }, 2023, 10, 07);
        datePickerDialog.show();
    }
}
