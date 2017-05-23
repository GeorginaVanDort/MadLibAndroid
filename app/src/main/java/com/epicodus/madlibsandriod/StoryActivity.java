package com.epicodus.madlibsandriod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.AdapterView;
import android.view.View;

import java.util.ArrayList;

public class StoryActivity extends AppCompatActivity {

    private TextView mHeroView;
    private TextView mHopelessView;
    private TextView mEmperorView;
    private TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        mEmperorView = (TextView) findViewById(R.id.emperorView);
        mHopelessView = (TextView) findViewById(R.id.hopelessView);
        mHeroView = (TextView) findViewById(R.id.heroView);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);

        ArrayList<String> list = getIntent().getStringArrayListExtra("input");

        StoryArrayAdapter adapter = new StoryArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        mStoryTextView.set

    }
}


//        mHeroView.setText(list.get(0));
//        mHopelessView.setText(list.get(1));
//        mEmperorView.setText(list.get(2));