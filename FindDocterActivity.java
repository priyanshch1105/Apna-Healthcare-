package com.example.healthcare;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FindDocterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedinstanceState) {
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_finddocter);

        CardView exit = findViewById(R.id.cardBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FindDocterActivity.this,HomeActivity.class));
            }
        });

        CardView familyphysicians = findViewById(R.id.cardlabTest);
        familyphysicians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(FindDocterActivity.this,DoctersDetailsActivity.class);
                it.putExtra("title","Family Physicians");
                startActivity(it );
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView deitician = findViewById(R.id.carddeitician);
        deitician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(FindDocterActivity.this,DoctersDetailsActivity.class);
                it.putExtra("title","Dietician");
                startActivity(it );
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView gastroenterologist = findViewById(R.id.cardPhysician);
        gastroenterologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(FindDocterActivity.this,DoctersDetailsActivity.class);
                it.putExtra("title","Gastroenterologist");
                startActivity(it );
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView surgeon = findViewById(R.id.cardtherapits);
        surgeon .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(FindDocterActivity.this,DoctersDetailsActivity.class);
                it.putExtra("title","Surgeon");
                startActivity(it );
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView cardiologist = findViewById(R.id.cardCardiologist);
        cardiologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(FindDocterActivity.this,DoctersDetailsActivity.class);
                it.putExtra("title","Cardiologist");
                startActivity(it );
            }
        });
    }
}
