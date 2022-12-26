package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class length extends AppCompatActivity {
EditText et1;
TextView et2;
Button btn;
Spinner spf,spt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        spf=findViewById(R.id.sp_lengthf);
        spt=findViewById(R.id.sp_lengtht);
        et1=findViewById(R.id.length_et1);
        et2=findViewById(R.id.length_et2);
        btn=findViewById(R.id.length_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    if(spf.getSelectedItem().toString().equals(spt.getSelectedItem().toString()))
                    {

                        Toast.makeText(length.this, "CAN'T BE SAME", Toast.LENGTH_SHORT).show();
                    }
                    else if(spf.getSelectedItem().toString().equals("KILOMETER")&&spt.getSelectedItem().toString().equals("METER"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1000)+" m");
                    }
                    else if(spf.getSelectedItem().toString().equals("KILOMETER")&&spt.getSelectedItem().toString().equals("CENTIMETER"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a*100000)+" cm");
                    }
                    else if(spf.getSelectedItem().toString().equals("METER")&&spt.getSelectedItem().toString().equals("CENTIMETER"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a*100)+" cm");
                    }
                    else if(spf.getSelectedItem().toString().equals("METER")&&spt.getSelectedItem().toString().equals("KILOMETER"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a/1000)+" Km");
                    }
                    else if(spf.getSelectedItem().toString().equals("CENTIMETER")&&spt.getSelectedItem().toString().equals("KILOMETER"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a/100000)+" Km");
                    }
                    else if(spf.getSelectedItem().toString().equals("CENTIMETER")&&spt.getSelectedItem().toString().equals("METER"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a/100)+" m");
                    }


                }
                catch (Exception e)
                {
                    Toast.makeText(length.this, "Enter Number", Toast.LENGTH_SHORT).show();
                    et1.setText("");
                }

            }
        });
    }
}