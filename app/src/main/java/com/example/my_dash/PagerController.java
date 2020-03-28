package com.example.my_dash;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {
    public PagerController(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch(position){
            case 0:
                fragment = new Departmental();
                break;
            case 1:
                fragment = new Technical();
                break;
            case 2:
                fragment = new Cultural();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
