package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar tb;
    CardView btnarea,btnvolume,btntime,btntemp,btnlength,btnweight,btnpressure,btnfreq,btnspeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(findViewById(R.id.toolbar_main));
        btnarea=findViewById(R.id.cv_area);
        btnspeed=findViewById(R.id.cv_speed);
        btnfreq=findViewById(R.id.cv_freq);
        btnpressure=findViewById(R.id.cv_pressure);
        btnlength=findViewById(R.id.cv_length);
        btntemp=findViewById(R.id.cv_temp);
        btnvolume=findViewById(R.id.cv_volume);
        btntime=findViewById(R.id.cv_time);
        btnweight=findViewById(R.id.cv_weight);
        btnspeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,speed.class);
                startActivity(intent);
            }
        });
        btnfreq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,frequency.class);
                startActivity(intent);
            }
        });
        btnpressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,pressure.class);
                startActivity(intent);
            }
        });
        btnarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,area.class);
                startActivity(intent);
            }
        });

        btnvolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,volume.class);
                startActivity(intent);
            }
        });
        btntemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,temp.class);
                startActivity(intent);
            }
        });
        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,time.class);
                startActivity(intent);
            }
        });
        btnlength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,length.class);
                startActivity(intent);
            }
        });
        btnweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,weight.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=this.getMenuInflater();
        menuInflater.inflate(R.menu.optionmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.cm_1)
        {
            Intent intent=new Intent(MainActivity.this,help.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.cm_3)
        {
            Intent intent=new Intent(MainActivity.this,about.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
