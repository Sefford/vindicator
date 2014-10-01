package com.sefford.vindicator.listener;

import android.support.v4.view.ViewPager;
import android.util.Log;

import com.sefford.vindicator.interfaces.Vindicable;

/**
 * Created by sefford on 30/09/14.
 */
public class VindicablePagerListener implements ViewPager.OnPageChangeListener {

    final Vindicable[] vindicables;
    final ViewPager viewPager;

    public VindicablePagerListener(Vindicable[] vindicables, ViewPager viewPager) {
        this.vindicables = vindicables;
        this.viewPager = viewPager;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        // This space for rent
        Log.d("vindicator", "Scroll:" + viewPager.getScrollX());
    }

    @Override
    public void onPageSelected(int position) {
        selectTab(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        // This one too
    }
}
