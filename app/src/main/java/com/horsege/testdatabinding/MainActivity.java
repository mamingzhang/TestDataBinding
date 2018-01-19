package com.horsege.testdatabinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.horsege.testdatabinding.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    private Handler handler = new Handler();

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User("First Name", "Last Name");
        binding.setUser(user);

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

//        testObservableObjects();
    }

    private void testObservableObjects() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                user.setFirstName("FirstName Changed");
                user.setLastName("LastName Changed");
                user.age.set(30);
            }
        }, 5000);
    }
}
