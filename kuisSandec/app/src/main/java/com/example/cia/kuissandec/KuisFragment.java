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
public class KuisFragment extends Fragment {


    private FragmentTabHost tabHost;

    public static KuisFragment newInstance(){
        KuisFragment fragment = new KuisFragment();
        return fragment;
    }


    public KuisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_kuis, container, false);
        // Inflate the layout for this fragment

        tabHost = new FragmentTabHost(getActivity());
        tabHost.setup(getActivity(),getChildFragmentManager(), R.layout.fragment_kuis);
        Bundle arg1 = new Bundle();
        arg1.putInt("Arg for Frag",1);
        tabHost.addTab(tabHost.newTabSpec("Tab1").setIndicator("Easy"),EasyFragment.class, arg1);

        Bundle arg2 = new Bundle();
        arg2.putInt("Arg for Frag2", 2);
        tabHost.addTab(tabHost.newTabSpec("Tab2").setIndicator("Hard"), HardFragment.class, arg2);

        return tabHost;


        /*
        tabHost = new FragmentTabHost(getActivity());
        tabHost.setup(getActivity(), getChildFragmentManager(), R.layout.fragment_kuis);

        Bundle arg1 = new Bundle();
        arg1.putInt("Arg for Frag1", 1);
        tabHost.addTab(tabHost.newTabSpec("Tab1").setIndicator("Easy"),
                EasyFragment.class, arg1);

        Bundle arg2 = new Bundle();
        arg2.putInt("Arg for Frag2", 2);
        tabHost.addTab(tabHost.newTabSpec("Tab2").setIndicator("Hard"),
                HardFragment.class, arg2);

        ///ini test


        return tabHost;
        */
    }

}
