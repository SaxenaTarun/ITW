package com.example.lab51;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void Onclick(View view) {
        EditText t=findViewById(R.id.auth);
        EditText e=findViewById(R.id.auth2);
        EditText g = findViewById(R.id.editlog);
        String l=(g.getText().toString());
        int i=l.indexOf('@');
        if(i!=-1){
            e.setText("Strong Username");
        }
        else{
            e.setText("Username Incorrect!");
        }
        EditText p=findViewById(R.id.editpass);
        String ps=(p.getText().toString());

        if(ps.length()<=6){
            t.setText("Password is short");
        }
        else{
            t.setText("You have successfully logged in!");
        }

    }
}
