package com.app.two_urban_sisters;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = (TextView) findViewById(R.id.homeTitle1);
        title.setText("Home Activity");

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_back:
                        break;
                    case R.id.navigation_usb:
                        Intent a = new Intent(MainActivity.this, OrdersActivity.class);
                        startActivity(a);
                        break;
                    case R.id.navigation_logo:
                        Intent b = new Intent(MainActivity.this, SalesActivity.class);
                        startActivity(b);
                        break;
                }
                return false;
            }
        });
    }
}
