package com.elizabeth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MenuActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {


    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bottomNavigationView = findViewById(R.id.nav_bottom);
        bottomNavigationView.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.icon_home:
                Toast.makeText(this, "This Home", Toast.LENGTH_SHORT).show();
                break;
            case R.id.icon_transaksi:
                Intent transaksi = new Intent(MenuActivity.this, Transaksi.class);
                startActivity(transaksi);
                break;
            case R.id.icon_pesan:
                Toast.makeText(this, "Pesan", Toast.LENGTH_SHORT).show();
                break;
            case R.id.icon_profile:
                Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}