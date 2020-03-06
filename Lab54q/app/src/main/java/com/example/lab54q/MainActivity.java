package com.example.lab54q;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.M:
                if (checked) {
                    System.out.println("Male");
                    break;
                }
            case R.id.F:
                if (checked){
                    System.out.println("Female");
                    break;
                }
        }
    }

    public void sub(View view) {
        String g=" ";
        TextView t1=(TextView) findViewById( R.id.name );
        String n= (t1.getText().toString());
        TextView t2=(TextView) findViewById( R.id.age );
        String a= (t1.getText().toString());
        RadioGroup br = (RadioGroup) findViewById(R.id.radio_group);
        int selectedId = br.getCheckedRadioButtonId();
        //Check For Radio Button Selection
        if(selectedId == -1){

            t1.setText("Error No option is Selected");
            return;
        } else {
            RadioButton sel_rad = (RadioButton) findViewById(selectedId);
            g= String.valueOf(sel_rad.getText());
        }
        TextView t3=(TextView) findViewById( R.id.dob );
        String d= (t1.getText().toString());
        TextView t4=(TextView) findViewById( R.id.pn );
        String p= (t1.getText().toString());
        TextView t5=(TextView) findViewById( R.id.em );
        String e= (t1.getText().toString());
        TextView t6=(TextView) findViewById( R.id.display );
        t6.setText("Name:"+n+"\nAge:"+a+"\nGender:"+g+"\nDOB:"+d+"\nPhone number:"+p+"\nEmail Adress:"+e);


    }

    public void exit(View view) {
        finish();
        System.exit( 0 );
    }
}
