package com.learning.activities;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.learning.R;
import com.learning.adapters.SlidingTabAdapter;

public class MainActivity extends FragmentActivity {
    ViewPager tab;
    SlidingTabAdapter slidingTabAdapter;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        slidingTabAdapter = new SlidingTabAdapter(getSupportFragmentManager());
        tab = (ViewPager) findViewById(R.id.pager);
        tab.setOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {
                        actionBar = getActionBar();
                        actionBar.setSelectedNavigationItem(position);
                    }
                });
        tab.setAdapter(slidingTabAdapter);
        actionBar = getActionBar();
        //Enable Tabs on Action Bar
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
            @Override
            public void onTabReselected(android.app.ActionBar.Tab tab,
                                        FragmentTransaction ft) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTabSelected(ActionBar.Tab actionBarTab, FragmentTransaction ft) {
                tab.setCurrentItem(actionBarTab.getPosition());
            }

            @Override
            public void onTabUnselected(android.app.ActionBar.Tab tab,
                                        FragmentTransaction ft) {
                // TODO Auto-generated method stub
            }
        };
        //Add New Tab
        actionBar.addTab(actionBar.newTab().setText("Friends").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("Home").setTabListener(tabListener));
    }
}