package com.example.une;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.une.Home.HomeFragmentDirections;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import static androidx.navigation.fragment.NavHostFragment.findNavController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView menu = (BottomNavigationView) findViewById(R.id.navigationView);
        menu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean  onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment);

                switch (menuItem.getItemId()) {
                    case R.id.homeMenu:
                        NavHostFragment.findNavController(fragment).navigate(R.id.home,null);
                        break;
                    case R.id.searchMenu:
                        NavHostFragment.findNavController(fragment).navigate(R.id.search,null);
                        break;
                    case R.id.recomendationsMenu:
                        NavHostFragment.findNavController(fragment).navigate(R.id.recommendations,null);
                        break;
                }

                return true;
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
