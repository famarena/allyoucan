package com.android.itfs.myapplication.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.android.itfs.myapplication.R;


/**
 * Created by francesca on 28/02/18.
 */


    public class InfoFragment extends Fragment{


    private TextView descrizione;
    private TextView prezzo;
    View viewRoot;


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            viewRoot =  inflater.inflate(R.layout.fragment_info, container, false);

                    descrizione = viewRoot.findViewById(R.id.textDesc);
                    prezzo = viewRoot.findViewById(R.id.textprz);
                    String url="";

                    
            return viewRoot;

        }




    }

