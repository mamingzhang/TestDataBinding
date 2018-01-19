package com.horsege.testdatabinding;

import android.text.TextUtils;

/**
 * Created by mamingzhang on 2018/1/19.
 */

public class MyStringUtils {
    public static String capitalize(String param) {
        if (TextUtils.isEmpty(param)) {
            return "";
        }

        return param.toUpperCase();
    }
}
