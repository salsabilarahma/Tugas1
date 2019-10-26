package com.example.cia.kuissandec;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PengenalanFragment extends Fragment {

    private FragmentTabHost tabHost;

    public static PengenalanFragment newInstance(){
        PengenalanFragment fragment = new PengenalanFragment();
        return fragment;
    }


    public PengenalanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pengenalan, container, false);
    }

}
