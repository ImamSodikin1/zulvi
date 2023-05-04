package com.elizabeth;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Transaksi extends AppCompatActivity {

    TextView belumBayar, selesai, dikemas;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);

        belumBayar = findViewById(R.id.belum_bayar);
        belumBayar.setOnClickListener(v -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.fram_layout, new BelumBayarFragment()).commit());

        selesai = findViewById(R.id.selesai);
        selesai.setOnClickListener(v -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.fram_layout, new TransaksiSelesaiFragment()).commit());

        dikemas = findViewById(R.id.dikemas);
        dikemas.setOnClickListener(v -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.fram_layout, new DikemasFragment()).commit());
    }
}