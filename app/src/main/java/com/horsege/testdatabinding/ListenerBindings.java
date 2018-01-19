package com.horsege.testdatabinding;

import android.view.View;
import android.widget.Toast;

/**
 * Created by mamingzhang on 2018/1/19.
 */

public class ListenerBindings {
    public void onLastNameClick(View view) {
        Toast.makeText(view.getContext(), "Last Name CLicked", Toast.LENGTH_SHORT);
    }
}
