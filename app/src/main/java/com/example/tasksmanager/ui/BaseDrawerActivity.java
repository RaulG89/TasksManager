package com.example.tasksmanager.ui;

/* Created by Raúl Gómez on 22/05/2019 */

import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.tasksmanager.R;
import com.google.android.material.navigation.NavigationView;

import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseDrawerActivity extends DaggerAppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private NavigationView navigationView;
    private Toolbar toolbar = null;
    private DrawerLayout drawer;

    private void setupToolbar(){
        toolbar = findViewById(R.id.toolbar);
    }

    private void setupNavigationView(){
        navigationView = findViewById(R.id.nav_view);
        assert navigationView != null;
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void setupDrawerLayout(){
        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    /* Actions of the menu options  */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.nav_tasks_list:
                Toast.makeText(getApplicationContext(),"Tasks", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_technician:
                Toast.makeText(getApplicationContext(),"Technician", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_categories:
                Toast.makeText(getApplicationContext(),"Categories", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
