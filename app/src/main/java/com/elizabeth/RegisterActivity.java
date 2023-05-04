package com.elizabeth;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        @SuppressLint("MissingInflatedId") Button btn_regis = findViewById(R.id.btn_regis);
        TextView txt_login = findViewById(R.id.txt_login);

        btn_regis.setOnClickListener(v -> {
            Intent regis = new Intent(RegisterActivity.this, MenuActivity.class);
            startActivity(regis);
        });

        txt_login.setOnClickListener(v -> {
            Intent regis = new Intent(RegisterActivity.this, MainActivity.class);
            startActivity(regis);
        });
    }
}