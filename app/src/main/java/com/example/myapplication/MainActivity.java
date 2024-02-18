package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    myAdapter myAdapter;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tab);
        viewPager=findViewById(R.id.page);

        myAdapter=new myAdapter(getSupportFragmentManager());

        myAdapter.addFragment(new homeFragment(),"Home");
        myAdapter.addFragment(new statusFragment(),"Status");
        myAdapter.addFragment(new callFragment(),"Calls");


        viewPager.setAdapter(myAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }

}