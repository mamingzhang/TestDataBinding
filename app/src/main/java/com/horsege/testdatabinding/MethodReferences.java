package com.horsege.testdatabinding;

import android.view.View;
import android.widget.Toast;

/**
 * Created by mamingzhang on 2018/1/19.
 */

public class MethodReferences {
    public void onFirstNameClick(View view) {
        Toast.makeText(view.getContext(), "First Name CLicked", Toast.LENGTH_SHORT);
    }
}
