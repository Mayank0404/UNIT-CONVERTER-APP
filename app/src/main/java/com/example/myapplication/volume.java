package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class volume extends AppCompatActivity {
    EditText et1;
    TextView et2;
    Button btn;
    Spinner spf,spt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        et1=findViewById(R.id.volume_et1);
        et2=findViewById(R.id.volume_et2);
        btn=findViewById(R.id.volume_btn);
        spf=findViewById(R.id.sp_volumef);
        spt=findViewById(R.id.sp_volumet);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(spf.getSelectedItem().toString().equals(spt.getSelectedItem().toString()))
                    {
                        Toast.makeText(volume.this, "UNITS CAN'T BE SAME" , Toast.LENGTH_SHORT).show();
                    }
                    else if(spf.getSelectedItem().toString().equals("LITER")&&spt.getSelectedItem().toString().equals("CUBIC METER"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a/1000)+" Cubic m");
                    }
                    else if(spf.getSelectedItem().toString().equals("LITER")&&spt.getSelectedItem().toString().equals("MILLILITER"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1000)+" ml");
                    }
                    else if(spf.getSelectedItem().toString().equals("CUBIC METER")&&spt.getSelectedItem().toString().equals("MILLILITER"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1000000)+" ml");
                    }
                    else if(spf.getSelectedItem().toString().equals("CUBIC METER")&&spt.getSelectedItem().toString().equals("LITER"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a*1000)+" l");
                    }
                    else if(spf.getSelectedItem().toString().equals("MILLILITER")&&spt.getSelectedItem().toString().equals("LITER"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a/1000)+" l");
                    }
                    else if(spf.getSelectedItem().toString().equals("MILLILITER")&&spt.getSelectedItem().toString().equals("CUBIC METER"))
                    {
                        double a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a/1000000)+" Cubic m");
                    }




                }
                catch (Exception e)
                {
                    Toast.makeText(volume.this, "Enter number", Toast.LENGTH_SHORT).show();
                    et1.setText("");
                }
            }
        });
    }
}