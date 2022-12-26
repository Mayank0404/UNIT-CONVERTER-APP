package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class speed extends AppCompatActivity {
    EditText et1;
    TextView et2;
    Button btn;
    Spinner spf,spt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        spf=findViewById(R.id.sp_speedf);
        spt=findViewById(R.id.sp_speedt);
        et1=findViewById(R.id.speed_et1);
        et2=findViewById(R.id.speed_et2);
        btn=findViewById(R.id.speed_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(spf.getSelectedItem().toString().equals(spt.getSelectedItem().toString()))
                    {
                        Toast.makeText(speed.this, "UNITS CAN'T BE SAME", Toast.LENGTH_SHORT).show();
                    }
                    else if(spf.getSelectedItem().toString().equals("KILOMETER PER HOUR")&&spt.getSelectedItem().toString().equals("METER PER SECOND"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a/3.6) + " mps");
                    }
                    else if(spf.getSelectedItem().toString().equals("KILOMETER PER HOUR")&&spt.getSelectedItem().toString().equals("FOOT PER SECOND"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a/1.097) + " fps");
                    }
                    else if(spf.getSelectedItem().toString().equals("METER PER SECOND")&&spt.getSelectedItem().toString().equals("KILOMETER PER HOUR"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a*3.6) + " kmph");
                    }
                    else if(spf.getSelectedItem().toString().equals("METER PER SECOND")&&spt.getSelectedItem().toString().equals("FOOT PER SECOND"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a/3.281) + " fps");
                    }
                    else if(spf.getSelectedItem().toString().equals("FOOT PER SECOND")&&spt.getSelectedItem().toString().equals("KILOMETER PER HOUR"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1.097)+" kmph");
                    }
                    else if(spf.getSelectedItem().toString().equals("FOOT PER SECOND")&&spt.getSelectedItem().toString().equals("METER PER SECOND"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a/3.281)+" mps");
                    }



                } catch (Exception e) {
                    Toast.makeText(speed.this, "Enter number", Toast.LENGTH_SHORT).show();
                    et1.setText("");
                }
            }
        });
    }
}