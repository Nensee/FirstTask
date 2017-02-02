package com.test.nensee.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nensee on 2/1/17.
 */
public class fragment_two extends Fragment
{
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
                // Inflate the layout for this fragment
        return inflater.inflate(
                R.layout.fragmenttwo, container, false);
    }
}
