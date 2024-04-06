package com.example.healthcare;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TmActivity extends AppCompatActivity {
TextView begin,support,tmarticle;
    private Class<?> MainActivity;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tm);

        begin = findViewById(R.id.cardlink);
        support = findViewById(R.id.cardsupportform);
        tmarticle= findViewById(R.id.cardtmarticle);

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = null;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(TmActivity.this,MainActivity));
                            }
        });

        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/fbX5eNAbpeo?si=VsOYUP5fjEf0z7YB");
               }
        });

        tmarticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/fbX5eNAbpeo?si=VsOYUP5fjEf0z7YB");
            }
        });

    }

    private void gotoUrl(String url) {

    }
}