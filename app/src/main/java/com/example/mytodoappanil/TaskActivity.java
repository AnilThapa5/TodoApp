package com.example.mytodoappanil;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.os.Bundle;


public class TaskActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        loadFragment(new TaskFragment());
    }

    private void loadFragment(Fragment taskFragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.famelayout, taskFragment);
        fragmentTransaction.commit();
    }
}