package com.epicodus.madlibsandriod;


import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class StoryArrayAdapter extends ArrayAdapter {

    private Context mContext;
    private ArrayList<String> mInputArray;

    public StoryArrayAdapter (Context mContext, int resource, ArrayList<String> mInputArray) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mInputArray = mInputArray;
    }

    @Override
    public Object getItem (int position) {
        String hero = mInputArray.get(0);
        String hopeless = mInputArray.get(1);
        String emperor = mInputArray.get(2);
        return String.format("%s and %s and %s lived in a far far away galaxy", hero, hopeless, emperor);
    }
}
