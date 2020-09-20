package com.example.splashscreen_logo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class activity_splash extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setUpToolbar();
        navigationView = findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {

                switch (menuItem.getItemId()){
                    case R.id.nav_home:
                        Toast.makeText(activity_splash.this,"Clicked Home",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_android:
                        Toast.makeText(activity_splash.this,"Clicked Android",Toast.LENGTH_SHORT).show();
                        break;
                    
                }
                return false;
            }
        });
    }
        //create hamburger layout
        //joint to toolbar and drawer layout

        private void setUpToolbar()
        {
            drawerLayout = findViewById(R.id.drawerLayout);
            toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);  //for backword compatible of toolbar
            //for toggle the drawer layout
            actionBarDrawerToggle =new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
            drawerLayout.addDrawerListener(actionBarDrawerToggle); //penand close drawer layout
            actionBarDrawerToggle.syncState(); //handles all the events for sync both

        }

}