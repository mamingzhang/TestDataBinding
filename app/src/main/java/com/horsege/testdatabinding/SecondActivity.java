package com.horsege.testdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.horsege.testdatabinding.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySecondBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        User user = new User("Second", "Activity");
        binding.setUser(user);
    }
}
