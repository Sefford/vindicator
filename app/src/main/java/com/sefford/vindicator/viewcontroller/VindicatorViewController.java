package com.sefford.vindicator.viewcontroller;

import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.sefford.vindicator.interfaces.ViewFactory;
import com.sefford.vindicator.interfaces.Vindicable;
import com.sefford.vindicator.interfaces.VindicableFactory;

/**
 * Created by sefford on 30/09/14.
 */
public class VindicatorViewController {

    final VindicableFactory vindicableFactory;
    ViewFactory viewFactory;
    ViewPager pager;
    Vindicable[] vindicables;

    public VindicatorViewController(VindicableFactory vindicableFactory) {
        this.vindicableFactory = vindicableFactory;
    }

    public void bind(ViewPager target, ViewGroup indicator, ViewFactory viewFactory, int maxElements) {
        this.viewFactory = viewFactory;
        this.vindicables = new Vindicable[maxElements];
        for (int i = 0; i < maxElements; i++) {
            ImageView view = (ImageView) viewFactory.provideView(i);
            indicator.addView(view);
            Vindicable vindicable = vindicableFactory.provideVindicable(i);
            view.setImageDrawable((Drawable) vindicable);
        }

    }
}
