package com.learning.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.learning.R;

public class Friends extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View friends = inflater.inflate(R.layout.friends, container, false);
        ((TextView)friends.findViewById(R.id.textView)).setText("Friends");
        return friends;
    }
}