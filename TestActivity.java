package com.example.healthcare;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class TestActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        CardView depressionform = findViewById(R.id.cardStress);
        depressionform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://forms.gle/w4NfoBBqvTTQdHuZA");
                 }
        });

        CardView anxietyform = findViewById(R.id.cardAnxiety);
        anxietyform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://forms.gle/3Csu43VUp7hhKHsTA");
                }
        });

        CardView sleepdisorderform = findViewById(R.id.cardSleep);
        sleepdisorderform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://forms.gle/PbsG8LRG46GEYL3LA");
            }
        });

        CardView anorexiaform = findViewById(R.id.cardanorexia);
        anorexiaform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://forms.gle/NzMvgpeBH4YgqHw48");
            }
        });

        CardView personalityform = findViewById(R.id.cardpersonality);
        personalityform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://forms.gle/v8LQSJDbXFaF32XN9");
                }
        });

        CardView addictiveform = findViewById(R.id.cardaddictive);
        addictiveform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://forms.gle/XY7fMY8PMeyuwmDY8");
               }
        });

        CardView back = findViewById(R.id.cardBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestActivity.this,HomeActivity.class));
            }
        });

    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
