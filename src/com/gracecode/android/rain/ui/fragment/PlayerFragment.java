package com.gracecode.android.rain.ui.fragment;


import android.support.v4.app.Fragment;

abstract class PlayerFragment extends Fragment {
    private static boolean mPlaying = false;

    public void setPlaying() {
        mPlaying = true;
    }

    public void setStopped() {
        mPlaying = false;
    }

    public boolean isPlaying() {
        return mPlaying;
    }
}
