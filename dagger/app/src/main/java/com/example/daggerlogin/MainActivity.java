package com.example.daggerlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daggerlogin.root.App;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);
    }
}
