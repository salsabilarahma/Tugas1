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
public class KontenFragment extends Fragment {

    private FragmentTabHost tabHost;

    public static KontenFragment newInstance(){
        KontenFragment fragment = new KontenFragment();
        return  fragment;
    }


    public KontenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_konten, container, false);
    }

}
