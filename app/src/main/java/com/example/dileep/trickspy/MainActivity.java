package com.example.dileep.trickspy;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView cs11,cs22,cs33,cs44,cs55,cs66,cs77,cs88,cs99,tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cs11=(TextView)findViewById(R.id.cs1);
        cs22=(TextView)findViewById(R.id.cs2);
        cs33=(TextView)findViewById(R.id.cs3);
        cs44=(TextView)findViewById(R.id.cs4);
        cs55=(TextView)findViewById(R.id.cs5);
        cs66=(TextView)findViewById(R.id.cs6);
        cs77=(TextView)findViewById(R.id.cs7);
        cs88=(TextView)findViewById(R.id.cs8);
        cs99=(TextView)findViewById(R.id.cs9);
        tv5=(TextView)findViewById(R.id.tv5);
        setTitle("Trickspy");
        /*Typeface tf=Typeface.createFromAsset(getAssets(),"fonts/arial.ttf");*/
        cs11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,Main3Activity.class);
                i1.putExtra("id",1);
                startActivity(i1);
            }

        });
        cs22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,Main3Activity.class);
                i1.putExtra("id",2);
                startActivity(i1);
            }

        });
        cs33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,Main3Activity.class);
                i1.putExtra("id",3);
                startActivity(i1);
            }

        });
        cs44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,Main3Activity.class);
                i1.putExtra("id",4);
                startActivity(i1);
            }

        });
        cs55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,Main3Activity.class);
                i1.putExtra("id",5);
                startActivity(i1);
            }

        });
        cs66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,Main3Activity.class);
                i1.putExtra("id",6);
                startActivity(i1);
            }

        });
        cs77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,Main3Activity.class);
                i1.putExtra("id",7);
                startActivity(i1);
            }

        });
        cs88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,Main3Activity.class);
                i1.putExtra("id",8);
                startActivity(i1);
            }

        });
        cs99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,Main3Activity.class);
                i1.putExtra("id",9);
                startActivity(i1);
            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}

