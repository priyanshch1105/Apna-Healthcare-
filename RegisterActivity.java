package com.example.healthcare;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity{
    EditText edusername,edEmail,edPassword,edConfirmpassword;
    Button btn;
    TextView tv;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedinstanceState) {
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_register);

        edusername = findViewById(R.id.edittextUsername);
        edEmail = findViewById(R.id.edittextemail);
        edPassword = findViewById(R.id.edittextPassword);
        edConfirmpassword = findViewById(R.id.edittextConfirmPassword);
        btn = findViewById(R.id.buttonRegistration);
        tv = findViewById(R.id.textViewOldUser);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edusername.getText().toString();
                String email = edEmail.getText().toString();
                String password = edPassword.getText().toString();
                String confirmpassword = edConfirmpassword.getText().toString();
                Database db = new Database(getApplicationContext(),"healthcare",null,1);

                if (username.length() == 0 || email.length() == 0 || password.length() == 0 || confirmpassword.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please fill all details", Toast.LENGTH_SHORT).show();
                } else {
                    String confirm = confirmpassword;
                    if (password.compareTo(confirm) == 0) {
                        if (isValid(password)) {

                           }
                        else{
                            db.register(username,email,password);
                            Toast.makeText(getApplicationContext(), "Record Inserted", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegisterActivity.this, loginActivity.class));
                        }
                    }
                }

            }

            private boolean isValid(String password) {
                return  false;
            }
        });



        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, loginActivity.class));
            }
        });
        }
    }