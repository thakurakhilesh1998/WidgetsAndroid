package com.example.widgetsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textview);
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        textView.setText(sharedPref.getString("click",""));
        Toast.makeText(this,sharedPref.getString("click","not clikced"),Toast.LENGTH_LONG).show();

    }
}
