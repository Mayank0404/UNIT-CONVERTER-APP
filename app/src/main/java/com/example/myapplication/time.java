package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class time extends AppCompatActivity {
    EditText et1;
    TextView et2;
    Button btn;
    Spinner spf,spt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        et1=findViewById(R.id.time_et1);
        et2=findViewById(R.id.time_et2);
        btn=findViewById(R.id.time_btn);
        spf=findViewById(R.id.sp_timef);
        spt=findViewById(R.id.sp_timet);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    if(spf.getSelectedItem().toString().equals("HOUR")&&spt.getSelectedItem().toString().equals("HOUR"))
                    {
                        Toast.makeText(time.this, "CANT BE SAME", Toast.LENGTH_SHORT).show();
                    }
                    else if(spf.getSelectedItem().toString().equals("HOUR")&&spt.getSelectedItem().toString().equals("MINUTE"))
                    {
                       double a;
                       a=Double.parseDouble(et1.getText().toString());
                       et2.setText((a*60)+" m");
                    }
                    else if(spf.getSelectedItem().toString().equals("HOUR")&&spt.getSelectedItem().toString().equals("SECOND"))
                    {
                        double a;
                        a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a*60*60)+" s");
                    }
                    else if(spf.getSelectedItem().toString().equals("SECOND")&&spt.getSelectedItem().toString().equals("SECOND"))
                    {
                        Toast.makeText(time.this, "CANT BE SAME", Toast.LENGTH_SHORT).show();
                    }
                    else if(spf.getSelectedItem().toString().equals("SECOND")&&spt.getSelectedItem().toString().equals("MINUTE"))
                    {
                        double a;
                        a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a/60)+" m");
                    }
                    else if(spf.getSelectedItem().toString().equals("SECOND")&&spt.getSelectedItem().toString().equals("HOUR"))
                    {
                        double a;
                        a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a/3600)+" h");
                    }
                    else if(spf.getSelectedItem().toString().equals("MINUTE")&&spt.getSelectedItem().toString().equals("MINUTE"))
                    {
                        Toast.makeText(time.this, "CANT BE SAME", Toast.LENGTH_SHORT).show();
                    }
                    else if(spf.getSelectedItem().toString().equals("MINUTE")&&spt.getSelectedItem().toString().equals("HOUR"))
                    {
                        double a;
                        a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a/60)+" h");
                    }
                    else if(spf.getSelectedItem().toString().equals("MINUTE")&&spt.getSelectedItem().toString().equals("SECOND"))
                    {
                        double a;
                        a=Double.parseDouble(et1.getText().toString());
                        et2.setText((a*60)+" s");
                    }



                }
                catch (Exception e)
                {
                    Toast.makeText(time.this, "Enter Number", Toast.LENGTH_SHORT).show();
                    et1.setText("");
                }
            }
        });

    }
}