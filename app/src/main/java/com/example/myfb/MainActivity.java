package com.example.myfb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    MyFragmentAdapter adapter;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.fragment_pager);
        tabLayout = findViewById(R.id.tabs);
        adapter = new MyFragmentAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);



    }

    /*public void ActBar(View view) {
        String click = view.getTag().toString();
        if(click.equals("blue")) {
            viewPager.setCurrentItem(0);
        }else if(click.equals("red")){
            viewPager.setCurrentItem(1);
        }else if(click.equals("black")){
            viewPager.setCurrentItem(2);
        }else if(click.equals("green")){
            viewPager.setCurrentItem(3);
        }
    }*/
}
