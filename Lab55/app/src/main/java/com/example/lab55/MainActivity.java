package com.example.lab55;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void addition(View view) {
        EditText g = findViewById(R.id.num1);
        EditText h = findViewById(R.id.num2);
//        String an= g.getText().toString();
//        int a = Integer.parseInt(an);
//        String bn= g.getText().toString();
//        int b = Integer.parseInt(bn);
        int a = Integer.parseInt(g.getText().toString());
        int b = Integer.parseInt(h.getText().toString());
        int sum=a+b;
        System.out.println(sum);
        TextView p = findViewById(R.id.res);
        p.setText(sum);
    }

//    public void subtraction(View view) {
//        EditText g = findViewById(R.id.num1);
//        EditText h = findViewById(R.id.num2);
//        String an= g.getText().toString();
//        int a = Integer.parseInt(an);
//        String bn= g.getText().toString();
//        int b = Integer.parseInt(bn);
//        int sub=a-b;
//        TextView p = findViewById(R.id.res);
//        p.setText(sub);
//    }
//
//    public void multiplication(View view) {
//        EditText g = findViewById(R.id.num1);
//        EditText h = findViewById(R.id.num2);
//        String an= g.getText().toString();
//        int a = Integer.parseInt(an);
//        String bn= g.getText().toString();
//        int b = Integer.parseInt(bn);
//        int mul=a*b;
//        TextView p = findViewById(R.id.res);
//        p.setText(mul);
//    }
//
//    public void division(View view) {
//        EditText g = findViewById(R.id.num1);
//        EditText h = findViewById(R.id.num2);
//        String an= g.getText().toString();
//        int a = Integer.parseInt(an);
//        String bn= g.getText().toString();
//        int b = Integer.parseInt(bn);
//        int div=a/b;
//        TextView p = findViewById(R.id.res);
//        p.setText(div);
//    }
}
