package com.epicodus.madlibsandriod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class StoryActivity extends AppCompatActivity {

    private TextView mHeroView;
    private TextView mHopelessView;
    private TextView mEmperorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        mEmperorView = (TextView) findViewById(R.id.emperorView);
        mHopelessView = (TextView) findViewById(R.id.hopelessView);
        mHeroView = (TextView) findViewById(R.id.heroView);

        ArrayList<String> list = getIntent().getStringArrayListExtra("input");

        mEmperorView.setText(list.get(0));
        mHopelessView.setText(list.get(1));
        mHeroView.setText(list.get(2));

    }
}
