package com.example.android.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //CREATE THE VIEWPAGER
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        //SETTING THE ADAPTER FOR THE VIEWPAGER
        PlacePagerAdapter adapter = new PlacePagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(adapter);
        //SETTING THE TABLAYOUT FOR THE VIEWPAGER
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }
}
