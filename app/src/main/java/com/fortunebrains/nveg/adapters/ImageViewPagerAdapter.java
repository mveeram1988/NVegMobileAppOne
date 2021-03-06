package com.fortunebrains.nveg.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.fortunebrains.nveg.fragments.ImageOneFragment;
import com.fortunebrains.nveg.fragments.ImageThreeFragment;
import com.fortunebrains.nveg.fragments.ImageTwoFragment;


public class ImageViewPagerAdapter extends FragmentPagerAdapter {
    private Context _context;
    public static int totalPage = 3;

    public ImageViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        _context = context;

    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = new Fragment();
        switch (position) {
            case 0:
                f = new ImageOneFragment();
                break;
            case 1:
                f = new ImageTwoFragment();
                break;
            case 2:
                f = new ImageThreeFragment();
                break;
        }
        return f;
    }

    @Override
    public int getCount() {
        return totalPage;
    }

}

