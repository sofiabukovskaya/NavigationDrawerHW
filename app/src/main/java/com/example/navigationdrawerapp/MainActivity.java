package com.example.navigationdrawerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    String tag = "LifeCycleEvents";
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "In the onCreate() event");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    public void onStart()
    {
        super.onStart();
        Log.d(tag, "In the onStart() event");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "In the onResume() event");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag, "In the onPause() event");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(tag, "In the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
    }

    @SuppressLint("ResourceType")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_alarm:
                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_child, new Fragment()).commit();
                break;
            case R.id.nav_calendar:
                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_child, new Fragment()).commit();
                break;
            case R.id.nav_extension:
                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_child, new Fragment()).commit();
                break;
            case R.id.nav_favorite:
                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_child, new Fragment()).commit();
                break;
            case R.id.nav_fitness:
                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_child, new Fragment()).commit();
                break;
            case R.id.nav_person:
                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_child, new Fragment()).commit();
                break;
            case R.id.nav_saving:
                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_child, new Fragment()).commit();
                break;
            case R.id.nav_smile:
                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_child, new Fragment()).commit();
                break;
            case R.id.nav_video:
                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_child, new Fragment()).commit();
                break;
            case R.id.nav_view:
                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_child, new Fragment()).commit();
                break;
            case R.id.nav_vote:
                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_child, new Fragment()).commit();
                break;
            case R.id.nav_wash:
                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_child, new Fragment()).commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}