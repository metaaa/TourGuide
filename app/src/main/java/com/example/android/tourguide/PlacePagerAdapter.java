package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlacePagerAdapter extends FragmentPagerAdapter{

    private Context mContext;

    //PUBLIC CONSTRUCTOR FOR THE ADAPTER OF THE VIEWPAGER
    public PlacePagerAdapter(FragmentManager fragmentManager, Context context){
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        //CONNECTING THE FRAGMENTS WITH THE VIEWPAGERS ITEMS
        if (position == 0){
            return new SightsFragment();
        } else if (position == 1){
            return new ToDoFragment();
        } else if (position == 2){
            return new EatFragment();
        } else{
            return new BarsFragment();
        }
    }

    @Override
    //RETURNS THE NUMBER OF ITEMS IN THE VIEWPAGER
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //SETTING THE TITLES OF THE TABS
        if (position == 0){
            return "Sights";
        } else if (position == 1){
            return "ToDos";
        }else if (position == 2){
            return "Eat out";
        } else{
            return "Bars";
        }
    }
}
