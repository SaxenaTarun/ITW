package com.example.lab_41q;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View view) {

        Spinner year = (Spinner) findViewById(R.id.yr);
        String val = String.valueOf(year.getSelectedItem());
        String y = val.substring(2,4);


        Spinner bran = (Spinner) findViewById(R.id.br);
        String b = String.valueOf(bran.getSelectedItem());


        Spinner rn = (Spinner) findViewById(R.id.rn);
        String rol = String.valueOf(rn.getSelectedItem());

        TextView tv3 = (TextView) findViewById(R.id.textView3);
        String a="BT"+y+b+"0"+rol;
        tv3.setText(a);


    }
}
