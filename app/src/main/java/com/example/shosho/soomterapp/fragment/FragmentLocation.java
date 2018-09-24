package com.example.shosho.soomterapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.shosho.soomterapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLocation extends Fragment {


    public FragmentLocation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate( R.layout.fragment_fragment_location, container, false );
        ImageView imageLocation=view.findViewById( R.id.image_location);
        imageLocation.setImageResource( R.drawable.map );
        return view;
    }

}
