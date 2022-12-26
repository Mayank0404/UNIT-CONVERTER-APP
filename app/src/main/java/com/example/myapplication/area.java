package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class area extends AppCompatActivity {
    Button btn;
    EditText et1;
    TextView et2;
    Spinner spf,spt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        btn=findViewById(R.id.area_btn);
        et1=findViewById(R.id.area_et1);
        et2=findViewById(R.id.area_et2);
        spf=findViewById(R.id.sp_areaf);
        spt=findViewById(R.id.sp_areat);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    if(spf.getSelectedItem().toString().equals(spt.getSelectedItem().toString()))
                    {
                        Toast.makeText(area.this, "can't be same", Toast.LENGTH_SHORT).show();
                    }
                    else if(spf.getSelectedItem().toString().equals("SQUARE METER")&&spt.getSelectedItem().toString().equals("SQUARE KILOMETER")) {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a / 1000000) + " skm");
                    }
                    else if(spf.getSelectedItem().toString().equals("SQUARE METER")&&spt.getSelectedItem().toString().equals("SQUARE FOOT")) {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a*10.764) + " sf");
                    }
                    else if(spf.getSelectedItem().toString().equals("SQUARE FOOT")&&spt.getSelectedItem().toString().equals("SQUARE METER")) {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a/10.764) + " sf");
                    }
                    else if(spf.getSelectedItem().toString().equals("SQUARE FOOT")&&spt.getSelectedItem().toString().equals("SQUARE KILOMETER")) {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a/(1.076*10000000)) + " sKm");
                    }
                    else if(spf.getSelectedItem().toString().equals("SQUARE KILOMETER")&&spt.getSelectedItem().toString().equals("SQUARE METER")) {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1000000) + " sm");
                    }
                    else if(spf.getSelectedItem().toString().equals("SQUARE KILOMETER")&&spt.getSelectedItem().toString().equals("SQUARE FOOT")) {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1.076*10000000) + " sf");
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(area.this, "Enter Number", Toast.LENGTH_SHORT).show();
                    et1.setText("");
                }

            }
        });
    }
}