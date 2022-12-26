package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class temp extends AppCompatActivity {
    EditText et1;
    TextView et2;
    Button btn;
    Spinner spf,spt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        et1=findViewById(R.id.temp_et1);
        et2=findViewById(R.id.temp_et2);
        btn=findViewById(R.id.temp_btn);
        spf=findViewById(R.id.sp_tempf);
        spt=findViewById(R.id.sp_tempt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    if(spf.getSelectedItem().toString().equals("CELSIUS")&&spt.getSelectedItem().toString().equals("FAHRENHEIT"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText(((a * 1.8) + 32) + "F");
                    }
                    else if(spf.getSelectedItem().toString().equals("CELSIUS")&&spt.getSelectedItem().toString().equals("KELVIN"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText(((a +273.15) ) + "K");
                    }
                    else if (spf.getSelectedItem().toString().equals("CELSIUS")&&spt.getSelectedItem().toString().equals("CELSIUS"))
                    {
                        Toast.makeText(temp.this, "CANT BE SAME", Toast.LENGTH_SHORT).show();
                    }


                    else if (spf.getSelectedItem().toString().equals("KELVIN")&&spt.getSelectedItem().toString().equals("KELVIN"))
                    {
                        Toast.makeText(temp.this, "CANT BE SAME", Toast.LENGTH_SHORT).show();
                    }
                    else if(spf.getSelectedItem().toString().equals("KELVIN")&&spt.getSelectedItem().toString().equals("CELSIUS"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText(((a -273.15) ) + " C");
                    }
                    else if(spf.getSelectedItem().toString().equals("KELVIN")&&spt.getSelectedItem().toString().equals("FAHRENHEIT"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText(((1.8*(a -273.15))+32) + " F");
                    }

                    else if (spf.getSelectedItem().toString().equals("FAHRENHEIT")&&spt.getSelectedItem().toString().equals("FAHRENHEIT"))
                    {
                        Toast.makeText(temp.this, "CANT BE SAME", Toast.LENGTH_SHORT).show();
                    }
                    else if(spf.getSelectedItem().toString().equals("FAHRENHEIT")&&spt.getSelectedItem().toString().equals("CELSIUS"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText(((a -32)*0.5556 ) + " C");
                    }
                    else if(spf.getSelectedItem().toString().equals("FAHRENHEIT")&&spt.getSelectedItem().toString().equals("KELVIN"))
                    {
                        double a = Double.parseDouble(et1.getText().toString());
                        et2.setText((((a-32)*5/9 )+273.15) + " K");
                    }

                    Toast.makeText(temp.this, "TEMPERATURE CONVERTED", Toast.LENGTH_SHORT).show();







                }
                catch (Exception e)
                {
                    Toast.makeText(temp.this, "Enter Number", Toast.LENGTH_SHORT).show();
                    et1.setText("");
                }
            }
        });




    }
}