package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity  extends AppCompatActivity {
    EditText edusername,edEmail,edPassword,edConfirmpassword;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedinstanceState) {
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_register);

        edusername = findViewById(R.id.editLoginUserName);
        edEmail = findViewById(R.id.edittextRegAddress);
        edPassword = findViewById(R.id.editTextAppContactNumber);
        edConfirmpassword = findViewById(R.id.editTextAppFees);
        btn = findViewById(R.id.buttonBack);
        tv = findViewById(R.id.textViewNewUser1);


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
                    String confirm = null;
                    if (password.compareTo(confirm) == 0) {
                        if (isValid(password)) {
db.register(username,email,password);
                            Toast.makeText(getApplicationContext(), "Record Inserted", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegisterActivity.this, loginActivity.class));
                        } else {
                            Toast.makeText(getApplicationContext(), "Password must contain atleast 8 character", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "both the password is not same", Toast.LENGTH_SHORT).show();

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