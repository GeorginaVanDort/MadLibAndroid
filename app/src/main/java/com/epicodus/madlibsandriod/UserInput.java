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
    private Button mGenerateButton;
    private ArrayList<String>mInputArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

        mHero = (EditText) findViewById(R.id.hero);
        mGenerateButton = (Button) findViewById(R.id.generateButton);

        mGenerateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String hero = mHero.getText().toString();
                ArrayList<String>mInputArrayList = new ArrayList<String>();
                   mInputArrayList.add(hero);

                Intent intent = new Intent(UserInput.this, StoryActivity.class);
            }
        });
    }


}
