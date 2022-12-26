package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class frequency extends AppCompatActivity {
    Button btn;
    EditText et1;
    TextView et2;
    Spinner spf,spt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequency);
        btn=findViewById(R.id.freq_btn);
        et1=findViewById(R.id.freq_et1);
        et2=findViewById(R.id.freq_et2);
        spf=findViewById(R.id.sp_freqf);
        spt=findViewById(R.id.sp_freqt);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    if(spf.getSelectedItem().toString().equals(spt.getSelectedItem().toString()))
                    {
                        Toast.makeText(frequency.this, " units can't be same", Toast.LENGTH_SHORT).show();
                    }
                    else if(spf.getSelectedItem().toString().equals("HERTZ")&&spt.getSelectedItem().toString().equals("KILOHERTZ")) {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a / 1000) + " Kh");
                    }
                    else if(spf.getSelectedItem().toString().equals("HERTZ")&&spt.getSelectedItem().toString().equals("MEGAHERTZ")) {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a/1000000) + " Mh");
                    }
                    else if(spf.getSelectedItem().toString().equals("KILOHERTZ")&&spt.getSelectedItem().toString().equals("HERTZ")) {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1000) + " h");
                    }
                    else if(spf.getSelectedItem().toString().equals("KILOHERTZ")&&spt.getSelectedItem().toString().equals("MEGAHERTZ")) {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a/1000) + " Mh");
                    }
                    else if(spf.getSelectedItem().toString().equals("MEGAHERTZ")&&spt.getSelectedItem().toString().equals("KILOHERTZ")) {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1000) + " Kh");
                    }
                    else if(spf.getSelectedItem().toString().equals("MEGAHERTZ")&&spt.getSelectedItem().toString().equals("HERTZ")) {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1000000) + " h");
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(frequency.this, "Enter Number", Toast.LENGTH_SHORT).show();
                    et1.setText("");
                }

            }
        });

    }
}