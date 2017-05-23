package com.epicodus.madlibsandriod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class UserInput extends AppCompatActivity {

    private EditText mHero;
    private EditText mHopeless;
    private EditText mEmperor;
    private Button mGenerateButton;
    private ArrayList<String>mInputArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

        mEmperor = (EditText) findViewById(R.id.emperor);
        mHero = (EditText) findViewById(R.id.hero);
        mHopeless = (EditText) findViewById(R.id.hopeless);
        mGenerateButton = (Button) findViewById(R.id.generateButton);

        mGenerateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String hero = mHero.getText().toString();
                String hopeless = mHopeless.getText().toString();
                String emperor = mEmperor.getText().toString();

                ArrayList<String>mInputArrayList = new ArrayList<String>();
                   mInputArrayList.add(hero);
                   mInputArrayList.add(hopeless);
                   mInputArrayList.add(emperor);

                Intent intent = new Intent(UserInput.this, StoryActivity.class);
                intent.putStringArrayListExtra("input", mInputArrayList);
                startActivity(intent);

            }
        });
    }


}
