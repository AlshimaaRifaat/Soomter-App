package com.example.shosho.soomterapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shosho.soomterapp.Model.Organizer;
import com.example.shosho.soomterapp.R;
import com.example.shosho.soomterapp.adapter.AdapterOrganizer;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOrganizer extends Fragment {

    ArrayList<Organizer> organizers;

    public FragmentOrganizer() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        organizers=new ArrayList<>(  );
        Organizer organizer=new Organizer(  );
        organizer.setCompanyName( "شركة الهضبة السعودية لتنظيم المؤتمرات والمعارض" );
        organizer.setImage( "https://soomter.com//AttachmentFiles/24629.png" );
        organizers.add( organizer );
        View view= inflater.inflate( R.layout.fragment_fragment_organizer, container, false );

        RecyclerView recyclerView=view.findViewById( R.id.recycler_organizer );
        AdapterOrganizer adapterOrganizer=new AdapterOrganizer( getContext(),organizers );
        GridLayoutManager gridLayoutManager=new GridLayoutManager( getActivity(),2 );
        recyclerView.setAdapter( adapterOrganizer );
        recyclerView.setLayoutManager( gridLayoutManager );
        return view;
    }

}
