package com.example.mariu.selectinglayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
    {
        //        private static final String TAG = "MainActivity";

        @Override
        protected void onCreate ( Bundle savedInstanceState )
            {
                super.onCreate ( savedInstanceState );
                setContentView ( R.layout.activity_main );
                //                Configuration config   = getResources().getConfiguration();
                int sw = getResources ().getConfiguration ().smallestScreenWidthDp;
                Button centerButton = findViewById ( R.id.buttonCenter );
                centerButton.setText ( String.valueOf ( sw ) );
            }
    }
