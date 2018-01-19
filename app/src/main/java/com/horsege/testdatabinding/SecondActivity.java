package com.horsege.testdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;

import com.horsege.testdatabinding.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySecondBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        User user = new User("Second", "ViewStub");
        binding.setUser(user);

        binding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                //TODO: 无需在inflate后主动绑定数据，xml指定也可，和文档冲突
            }
        });

        binding.viewStub.getViewStub().inflate();
    }
}
