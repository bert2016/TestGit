package com.gamegamix.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a =1 ;
        b = 1+2;
        c = b + a;
        Toast.makeText(MainActivity.this, c+"", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, a+b+c+"", Toast.LENGTH_SHORT).show();
    }
}
