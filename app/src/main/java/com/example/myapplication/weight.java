package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class weight extends AppCompatActivity {
    EditText et1;
    TextView et2;
    Button btn;
    Spinner spf,spt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        spf=findViewById(R.id.sp_weightf);
        spt=findViewById(R.id.sp_weightt);
        et1=findViewById(R.id.weight_et1);
        et2=findViewById(R.id.weight_et2);
        btn=findViewById(R.id.weight_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(spf.getSelectedItem().toString().equals(spt.getSelectedItem().toString()))
                    {
                        Toast.makeText(weight.this, "UNITS CAN'T BE SAME", Toast.LENGTH_SHORT).show();
                    }
                    else if(spf.getSelectedItem().toString().equals("KILOGRAM")&&spt.getSelectedItem().toString().equals("MILLIGRAM"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1000000) + " mg");
                    }
                    else if(spf.getSelectedItem().toString().equals("KILOGRAM")&&spt.getSelectedItem().toString().equals("GRAM"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1000) + " g");
                    }
                    else if(spf.getSelectedItem().toString().equals("GRAM")&&spt.getSelectedItem().toString().equals("MILLIGRAM"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1000) + " mg");
                    }
                    else if(spf.getSelectedItem().toString().equals("GRAM")&&spt.getSelectedItem().toString().equals("KILOGRAM"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a/1000) + " Kg");
                    }
                    else if(spf.getSelectedItem().toString().equals("MILLIGRAM")&&spt.getSelectedItem().toString().equals("GRAM"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a/1000)+" g");
                    }
                    else if(spf.getSelectedItem().toString().equals("MILLIGRAM")&&spt.getSelectedItem().toString().equals("KILOGRAM"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a/1000000)+" Kg");
                    }



                } catch (Exception e) {
                    Toast.makeText(weight.this, "Enter number", Toast.LENGTH_SHORT).show();
                    et1.setText("");
                }
            }
        });
    }
}