package com.example.enrollementradio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> list = new ArrayList<String>();

        /** Declaring an ArrayAdapter to set items to ListView */
        ArrayAdapter<String> adapter;
        list.add("Enter Your Roll No.");

        for(int i=0 ;i<103 ; ++i){
            String text = String.valueOf(i);
            if(text.length() == 1){
                text = "00" + text;
            } else if(text.length()== 2){
                text = "0" + text;
            } else {
                text = text;
            }
            list.add(text);
        }

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);

        Spinner r = (Spinner) findViewById(R.id.rollno);
        r.setAdapter(adapter);

        /** Adding radio buttons for the spinner items */
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        RadioGroup br = (RadioGroup) findViewById(R.id.radio_group);
        br.clearCheck();

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_cse:
                if (checked) {
                    System.out.println("CSE");
                    break;
                }
            case R.id.radio_ece:
                if (checked){
                    System.out.println("ECE");
                    break;
                }
        }
    }
    public void onClickDetails(View view){

        Spinner r = (Spinner) findViewById(R.id.rollno);
        String b = "";
        Spinner yearofadmission = (Spinner) findViewById(R.id.yearofadmission);
        String y = String.valueOf(yearofadmission.getSelectedItem());
        String enrollmentNo = "";
        String grossRollNo = String.valueOf(r.getSelectedItem());
        TextView t1;
        t1 = findViewById(R.id.enrollmentno);


        // Check which radio button was clicked
        RadioGroup br = (RadioGroup) findViewById(R.id.radio_group);
        int selectedId = br.getCheckedRadioButtonId();
        //Check For Radio Button Selection
        if(selectedId == -1){

            t1.setText("Error No Branch is Selected");
            return;
        } else {
            RadioButton sel_rad = (RadioButton) findViewById(selectedId);
            b = String.valueOf(sel_rad.getText());
        }

        try
        {
            // checking valid integer using parseInt() method
            Integer.parseInt(y);
        }
        catch (NumberFormatException e)
        {
           t1.setText("No Year is Selected");
           return;
        }
        try
        {
            // checking valid integer using parseInt() method
            Integer.parseInt(grossRollNo);
        }
        catch (NumberFormatException e)
        {
            t1.setText("No Roll Number is Selected");
            return;
        }



        enrollmentNo = "BT"+y.substring(2,y.length())+b+grossRollNo;


        t1.setText("You Enrollment Number is: "+enrollmentNo);
    }

}
