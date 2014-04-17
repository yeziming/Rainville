package com.gracecode.android.rain;

import com.gracecode.android.common.CustemApplication;

/**
 * Created with IntelliJ IDEA.
 * <p/>
 * User: mingcheng
 * Date: 14-4-17
 */
public class Rainville extends CustemApplication {
    private static Rainville mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static Rainville getInstance() {
        return mInstance;
    }
}