package com.example.lab_42q;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View view) {



        EditText g = findViewById(R.id.roll);
        String w = (g.getText().toString());
        System.out.println(w);
        String a = w.substring(2,4);
        System.out.println(a);
        String b = w.substring(4,7);
        System.out.println(b);
        String r = w.substring(7,10);
        System.out.println(r);



        TextView p = findViewById(R.id.ay);
        p.setText("20"+a);
        TextView p1 = findViewById(R.id.ay2);
        p1.setText(b);
        TextView p2 = findViewById(R.id.ay3);
        p2.setText(r);

    }}