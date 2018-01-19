package com.horsege.testdatabinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.horsege.testdatabinding.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User("First Name", "Last Name");
        binding.setUser(user);

//        Intent intent = new Intent(this, SecondActivity.class);
//        startActivity(intent);
    }
}
