package com.example.lab53;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_display );
        t1=(TextView) findViewById( R.id.textView2 );
        Intent intent=getIntent();
        final String value=intent.getStringExtra( "mykey" );
        t1.setText( value );
    }
}
