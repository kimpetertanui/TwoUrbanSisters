package com.app.two_urban_sisters;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class OrdersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        TextView title = (TextView) findViewById(R.id.activityTitle1);
        title.setText("Orders Activity");

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_back:
                        Intent a = new Intent(OrdersActivity.this, MainActivity.class);
                        startActivity(a);

                        break;
                    case R.id.navigation_usb:
                        break;
                    case R.id.navigation_logo:
                        Intent b = new Intent(OrdersActivity.this, SalesActivity.class);
                        startActivity(b);
                        break;
                }
                return false;
            }
        });
    }
}