package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class pressure extends AppCompatActivity {
    EditText et1;
    TextView et2;
    Button btn;
    Spinner spf,spt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
        et1=findViewById(R.id.pressure_et1);
        et2=findViewById(R.id.pressure_et2);
        btn=findViewById(R.id.pressure_btn);
        spf=findViewById(R.id.sp_pressuref);
        spt=findViewById(R.id.sp_pressuret);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(spf.getSelectedItem().toString().equals(spt.getSelectedItem().toString()))
                    {
                        Toast.makeText(pressure.this, "UNITS CAN'T BE SAME" , Toast.LENGTH_SHORT).show();
                    }
                    else if(spf.getSelectedItem().toString().equals("PASCAL")&&spt.getSelectedItem().toString().equals("BAR"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a/100000)+" Bar");
                    }
                    else if(spf.getSelectedItem().toString().equals("PASCAL")&&spt.getSelectedItem().toString().equals("ATMOSPHERE"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a/101300)+" atm");
                    }
                    else if(spf.getSelectedItem().toString().equals("ATMOSPHERE")&&spt.getSelectedItem().toString().equals("BAR"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1.01325)+" bar");
                    }
                    else if(spf.getSelectedItem().toString().equals("ATMOSPHERE")&&spt.getSelectedItem().toString().equals("PASCAL"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a*101300)+" P");
                    }
                    else if(spf.getSelectedItem().toString().equals("BAR")&&spt.getSelectedItem().toString().equals("PASCAL"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1000)+" P");
                    }
                    else if(spf.getSelectedItem().toString().equals("BAR")&&spt.getSelectedItem().toString().equals("ATMOSPHERE"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a/1.013)+" atm");
                    }




                }
                catch (Exception e)
                {
                    Toast.makeText(pressure.this, "Enter number", Toast.LENGTH_SHORT).show();
                    et1.setText("");
                }
            }
        });
    }
}