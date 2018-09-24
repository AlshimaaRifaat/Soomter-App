package com.example.shosho.soomterapp;

import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.shosho.soomterapp.Model.ItemRequest;
import com.example.shosho.soomterapp.Model.Result;
import com.example.shosho.soomterapp.fragment.FragmentData;
import com.example.shosho.soomterapp.fragment.FragmentLocation;
import com.example.shosho.soomterapp.fragment.FragmentOrganizer;
import com.example.shosho.soomterapp.fragment.MainFragment;
import com.example.shosho.soomterapp.fragment.NotifyFragment;
import com.example.shosho.soomterapp.fragment.SearchFragment;
import com.example.shosho.soomterapp.presenter.EventPresenter;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        fragment=new MainFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace( R.id.main_fragment_container,fragment );
        fragmentTransaction.commit();
        bottomNavigationView=findViewById( R.id.bottom_navigation );
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener  );

    }

    private  BottomNavigationView.OnNavigationItemSelectedListener navListener=
        new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment=null;
                switch (item.getItemId())
                {
                    case R.id.icon_main :
                        selectedFragment=new FragmentOrganizer();
                        break;
                    case R.id.icon_search :
                        selectedFragment=new SearchFragment();
                        break;
                    case R.id.icon_notify :
                        selectedFragment=new NotifyFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction()
                        .replace( R.id.fragment_container,selectedFragment );;
                return true;
            }
        };


}
