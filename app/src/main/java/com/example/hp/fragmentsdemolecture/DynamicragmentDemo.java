package com.example.hp.fragmentsdemolecture;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DynamicragmentDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamicragment_demo);
    }


    void ChangeFragment(View view)
    {
        Fragment fragment;

        if(view == findViewById(R.id.button2))
        {
            FragmentManager fragmentManager;
            FragmentTransaction fragmentTransaction;
            fragment= new Dyanmicragment1();
            fragmentManager=getSupportFragmentManager();
            fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment3,fragment);
            fragmentTransaction.commit();
        }
        if(view == findViewById(R.id.button3))
        {
            FragmentManager fragmentManager;
            FragmentTransaction fragmentTransaction;
            fragment= new DynamicProgramming2();
            fragmentManager=getSupportFragmentManager();
            fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment3,fragment);
            fragmentTransaction.commit();
        }
    }
}
