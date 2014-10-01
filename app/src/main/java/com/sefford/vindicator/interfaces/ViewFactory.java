package com.sefford.vindicator.interfaces;

import android.view.View;

/**
 * Created by sefford on 30/09/14.
 */
public interface ViewFactory {

    View provideView(int position);

    void release();
}
