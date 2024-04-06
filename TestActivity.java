package com.example.healthcare;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class TestActivity extends AppCompatActivity {
TextView depressionform,anxietyform,anorexiaform,sleepdisorderform,addictiveform,personalityform;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        CardView depressionform = findViewById(R.id.carddepression);
        depressionform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = null;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(TestActivity.this,StressActivity.class));
            }
        });

        CardView anxietyform = findViewById(R.id.cardAnxiety);
        anxietyform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = null;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(TestActivity.this,AnxietyActivity.class));
            }
        });

        CardView sleepdisorderform = findViewById(R.id.cardSleep);
        sleepdisorderform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = null;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(TestActivity.this,SleepActivity.class));
            }
        });

        CardView anorexiaform = findViewById(R.id.cardanorexia);
        anorexiaform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = null;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(TestActivity.this,AnorexiaActivity.class));
            }
        });

        CardView personalityform = findViewById(R.id.cardpersonality);
        personalityform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = null;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(TestActivity.this,PersonalityActivity.class));
            }
        });

        CardView addictiveform = findViewById(R.id.cardAddictive);
        addictiveform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://forms.gle/NzMvgpeBH4YgqHw48");
            }
        });



    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}