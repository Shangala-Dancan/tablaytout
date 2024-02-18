package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class myAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragmentArrayList=new ArrayList<>();
    ArrayList<String> arrayList=new ArrayList<>();


    public myAdapter(@NonNull FragmentManager fm) {
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    public void addFragment(Fragment fragment, String title) {
        fragmentArrayList.add(fragment);
        arrayList.add(title);

    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }



    @Override
    public int getCount() {
        return arrayList.size();
    }

    public CharSequence getPageTitle(int position){
        return arrayList.get(position);
    }
}
