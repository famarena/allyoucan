package com.android.itfs.myapplication.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.itfs.myapplication.R;


/**
 * Created by francesca on 28/02/18.
 */


public class PrenotaFragment extends Fragment{



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prenota, container, false);
    }

}

