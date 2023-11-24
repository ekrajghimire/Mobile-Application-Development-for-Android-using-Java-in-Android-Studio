package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        ListView clv;
        String title[]={"Apple","Orange","Tomato"};
        String desc[]={"Fruit","Fruit","Vegetable"};
        int imgsrc[]={R.drawable.apple,R.drawable.orange,R.drawable.tomato};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            clv=findViewById(R.id.CListView1);
            customAdapter adapter=new customAdapter();
            clv.setAdapter(adapter);
        }

        class customAdapter extends BaseAdapter{

            @Override
            public int getCount() {
                return imgsrc.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                convertView=getLayoutInflater().inflate(R.layout.customlistview,null);

                ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView);
                TextView titletv=(TextView)convertView.findViewById(R.id.txtti);
                TextView desctv=(TextView)convertView.findViewById(R.id.txtdes);

                imageView.setImageResource(imgsrc[position]);
                titletv.setText(title[position]);
                desctv.setText(desc[position]);
                return convertView;
            }
        }
    }
