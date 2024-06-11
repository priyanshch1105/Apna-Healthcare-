package com.example.healthcare;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FindDocterActivity extends AppCompatActivity{

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

        @SuppressLint({"LocalSuppress", "MissingInflatedId"}) CardView familyphysicians = findViewById(R.id.cardfamilyphysician);
        familyphysicians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // for passing message we use a intent
                Intent it=new Intent(FindDocterActivity.this,DoctersDetailsActivity.class);
                it.putExtra("title","Family Physicians");
                startActivity(it );
            }
        });


        CardView dietician = findViewById(R.id.carddeitician);
        dietician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // for passing message we use a intent
                Intent it=new Intent(FindDocterActivity.this,DoctersDetailsActivity.class);
                it.putExtra("title","Deitician");
                startActivity(it );
            }
        });


        CardView gastroenterologist = findViewById(R.id.cardPhysician);
        gastroenterologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // for passing message we use a intent
                Intent it=new Intent(FindDocterActivity.this,DoctersDetailsActivity.class);
                it.putExtra("title","Gastroenterologist");
                startActivity(it );
            }
        });


        CardView therapits = findViewById(R.id.cardtherapits);
        therapits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // for passing message we use a intent
                Intent it=new Intent(FindDocterActivity.this,DoctersDetailsActivity.class);
                it.putExtra("title","Therapits");
                startActivity(it );
            }
        });


        CardView cardiologist = findViewById(R.id.cardCardiologist);
        cardiologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // for passing message we use a intent
                Intent it=new Intent(FindDocterActivity.this,DoctersDetailsActivity.class);
                it.putExtra("title","Cardiologist");
                startActivity(it );
            }
        });

    }
}
