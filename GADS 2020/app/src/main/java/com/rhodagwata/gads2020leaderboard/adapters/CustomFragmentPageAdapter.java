package com.rhodagwata.gads2020leaderboard.adapters;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rhodagwata.gads2020leaderboard.fragments.LearningLeaders;
import com.rhodagwata.gads2020leaderboard.fragments.SkillLeaders;


public class CustomFragmentPageAdapter extends FragmentPagerAdapter {

    private static final String TAG = CustomFragmentPageAdapter.class.getSimpleName();

    private static final int FRAGMENT_COUNT = 2;

    public CustomFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new LearningLeaders();
            case 1:
                return new SkillLeaders();

        }
        return null;
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Learning Leaders";
            case 1:
                return "Skill IQ Leaders";

        }
        return null;
    }
}
