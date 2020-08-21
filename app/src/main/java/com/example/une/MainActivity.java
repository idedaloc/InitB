package com.example.une;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.une.Home.HomeFragmentDirections;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView menu = findViewById(R.id.navigationView);
        menu.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.homeMenu:
                        Navigation.createNavigateOnClickListener(R.id.home);
                        break;
                    case R.id.searchMenu:
                        Navigation.createNavigateOnClickListener(R.id.search);
                        break;
                    case R.id.recomendationsMenu:
                        Navigation.createNavigateOnClickListener(R.id.recommendations);
                        break;
                }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
