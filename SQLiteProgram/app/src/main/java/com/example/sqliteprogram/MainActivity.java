package com.example.sqliteprogram;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    class help extends SQLiteOpenHelper {
        public help(@Nullable Context context) {
            super(context, "student.db",null,1);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table info(id integer,name text,age integer)");
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        help helper= new help(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("id",21);
        cv.put("name","Ekraj Ghimire");
        cv.put("age",21);
        long row = db.insert("info",null,cv);
        System.out.println(row);
        String Store[]={"id","name","age"};
        Cursor c = db.query("info",Store,null,null,null,null,null);
        c.moveToLast();
        System.out.println(c.getString(1));
    }
}

