package com.example.floatinghint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView etlastname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etlastname=(AutoCompleteTextView) findViewById(R.id.etlastname);
        String [] names={"James","Jhone","jannice","Jenifer","Jacob"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.custom_designet,names);
        etlastname.setThreshold(1);
        etlastname.setAdapter(adapter);
    }
}