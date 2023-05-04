package com.elizabeth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button btn_login = findViewById(R.id.btn_login);
        TextView txt_daftar = findViewById(R.id.txt_daftar);

        btn_login.setOnClickListener(v -> {
            Intent login = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(login);
        });

        txt_daftar.setOnClickListener(v -> {
            Intent daftar = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(daftar);
        });

    }
}