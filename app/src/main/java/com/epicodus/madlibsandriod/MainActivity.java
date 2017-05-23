package com.epicodus.madlibsandriod;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mAppNameTextView;
    private Button mLetsPlayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAppNameTextView = (TextView) findViewById(R.id.textView);
        Typeface edgeracer = Typeface.createFromAsset(getAssets(), "fonts/edgeracer.ttf");

        mAppNameTextView.setTypeface(edgeracer);

        mLetsPlayButton = (Button) findViewById(R.id.letsPlayButton);
            mLetsPlayButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, UserInput.class);
                    startActivity(intent);
                }
            });

    }


}
