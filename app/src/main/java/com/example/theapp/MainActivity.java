package com.example.theapp;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    final Fragment home = new HomeFragment();
    final Fragment offer = new OffersFragment();
    final Fragment account = new AccountFragment();
    final Fragment transaction = new TransactionFragment();
    Fragment active = home;
    final FragmentManager fm = getSupportFragmentManager();
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fm.beginTransaction().hide(active).show(home).commit();
                    active = home;
                    return true;
                case R.id.navigation_transaction:
                    fm.beginTransaction().hide(active).show(transaction).commit();
                    active = transaction;
                    return true;
                case R.id.navigation_account:
                    fm.beginTransaction().hide(active).show(account).commit();
                    active = account;
                    return true;
                case R.id.navigation_offers:
                    fm.beginTransaction().hide(active).show(offer).commit();
                    active = offer;
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fm.beginTransaction().add(R.id.main_container, account, "4").hide(account).commit();
        fm.beginTransaction().add(R.id.main_container, offer, "3").hide(offer).commit();
        fm.beginTransaction().add(R.id.main_container, transaction, "2").hide(transaction).commit();
        fm.beginTransaction().add(R.id.main_container,home, "1").commit();
    }

}
