package com.hk.bd.lx_banner;

import android.icu.text.StringSearch;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MyView main_my_view_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_my_view_1 = (MyView) findViewById(R.id.main_my_view_1);
        main_my_view_1.setContext(MainActivity.this);




    }
}
