package com.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Slava on 05.03.2016.
 */
public class BaseMenuActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // click sparta item menu
    public void onSpartaMenuClick(MenuItem item) {
        Intent intent = new Intent(this, SpartaActivity.class);
        startActivity(intent);
    }

    // click main item menu
    public void onMainMenuClick(MenuItem item) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
