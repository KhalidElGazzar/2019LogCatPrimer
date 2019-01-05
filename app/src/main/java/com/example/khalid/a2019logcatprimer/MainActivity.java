    package com.example.khalid.a2019logcatprimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;


    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void printToLogs(View view) {
            // Find first menu item TextView and print the text to the logs
            TextView textViewMI1 = findViewById(R.id.menu_item_1);
            Log.i("MainActivity","First Menu item is: " + textViewMI1.getText().toString());

            // Find second menu item TextView and print the text to the logs
            TextView textViewMI2 = findViewById(R.id.menu_item_2);
            Log.i("MainActivity","Second Menu item is: " + textViewMI2.getText().toString());

            // Find third menu item TextView and print the text to the logs
            TextView textViewMI3 = findViewById(R.id.menu_item_3);
            Log.i("MainActivity","Finally, the third Menu item is: " + textViewMI3.getText().toString());

        }
    }
