package com.skyblue.databindingfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.skyblue.databindingfragment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Initialize variable
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Assign variable
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Initialize fragment
        Fragment fragment = new MainFragment();

        // Commit fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, fragment).commit();
    }
}