package com.example.shosho.soomterapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shosho.soomterapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentData extends Fragment {


    public FragmentData() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate( R.layout.fragment_fragment_data, container, false );
        TextView mobile,phone,email,website;
        mobile=view.findViewById( R.id.textview_mobile );
        phone=view.findViewById( R.id.textview_phone);
        email=view.findViewById( R.id.textview_email );
        website=view.findViewById( R.id.textview_website );

        mobile.setText( "4503638" );
        phone.setText( "لا توجد معلومات" );
        email.setText( "info@diaaexhibition.com" );
        website.setText( "http://www.diaaexhibition.com/ar/index.php" );
        return  view;
    }


}
