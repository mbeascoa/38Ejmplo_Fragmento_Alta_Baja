package com.example.a38ejmplo_fragmento_alta_baja;

import android.app.Fragment;
import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentAlta extends Fragment {



    public FragmentAlta() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_alta, container, false);


        }


    }