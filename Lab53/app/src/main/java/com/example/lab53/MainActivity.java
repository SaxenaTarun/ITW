package com.example.lab53;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.lang.String;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


            }



    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.AI:
                if (checked){
                    System.out.println("AI");
                }
                    break;
            case R.id.ML:
                if (checked)
                    System.out.println("ML");
                    break;
            case R.id.NLP:
                if (checked)
                    System.out.println("NLP");
                    break;
        }
    }
//
//    public void onCheckboxClicked(View view) {
//        boolean checked = ((CheckBox) view).isChecked();
//
//        // Check which checkbox was clicked
//        switch(view.getId()) {
//            case R.id.DPPL:
//                if (checked){
//                    System.out.println("DPPL");
//                }
//                else
//
//                    break;
//            case R.id.ITW:
//                if (checked) {
//                    System.out.println("ITW");
//                }
//                else
//
//                    break;
//            case R.id.OS:
//                if (checked) {
//                    System.out.println("OS");
//                }
//                else
//
//                break;
//            case R.id.DSA:
//                if (checked) {
//                    System.out.println("DSA");
//                }
//                else
//
//                    break;
//
//
//        }
//    }


    public void Reg(View view) {
        String dl = "";
        String os = "";
        String d = "";
        String i = "";
        RadioGroup br = (RadioGroup) findViewById(R.id.radio_group);
        int selectedId = br.getCheckedRadioButtonId();
        RadioButton sel_rad = (RadioButton) findViewById(selectedId);
        String b = String.valueOf(sel_rad.getText());

        CheckBox chk1 = (CheckBox) findViewById(R.id.DPPL);
        CheckBox chk2 = (CheckBox) findViewById(R.id.ITW);
        CheckBox chk3 = (CheckBox) findViewById(R.id.OS);
        CheckBox chk4 = (CheckBox) findViewById(R.id.DSA);
        if(chk1.isChecked()){
            dl=chk1.getText().toString();
        }
        if(chk2.isChecked()){
            i=chk2.getText().toString();
        }
        if(chk3.isChecked()){
            os=chk3.getText().toString();
        if(chk4.isChecked()){
            d=chk4.getText().toString();
        }
//        TextView dis=(TextView) findViewById( R.id.display );
////        dis.setText( "Something" );
//        dis.setText("Your Registered Subjects are as follows: "+b+" "+dl+" "+i+" "+os+" "+d);
    }
}

    public void POP(View view) {
        Display();
    }
    public void Display(){
        String dl = "";
        String os = "";
        String d = "";
        String i = "";
        RadioGroup br = (RadioGroup) findViewById(R.id.radio_group);
        int selectedId = br.getCheckedRadioButtonId();
        RadioButton sel_rad = (RadioButton) findViewById(selectedId);
        String b = String.valueOf(sel_rad.getText());

        CheckBox chk1 = (CheckBox) findViewById(R.id.DPPL);
        CheckBox chk2 = (CheckBox) findViewById(R.id.ITW);
        CheckBox chk3 = (CheckBox) findViewById(R.id.OS);
        CheckBox chk4 = (CheckBox) findViewById(R.id.DSA);
        if(chk1.isChecked()){
            dl=chk1.getText().toString();
        }
        if(chk2.isChecked()){
            i=chk2.getText().toString();
        }
        if(chk3.isChecked()){
            os=chk3.getText().toString();
            if(chk4.isChecked()){
                d=chk4.getText().toString();
            }

        }
        Intent in =new Intent(getApplicationContext(),Display.class);
        in.putExtra( "mykey"," "+b+" "+dl+" "+i+" "+os+" "+d );
        startActivity(in);
    }
}
