package com.example.shosho.soomterapp.fragment;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.shosho.soomterapp.EventView;
import com.example.shosho.soomterapp.Model.ItemRequest;
import com.example.shosho.soomterapp.Model.Result;
import com.example.shosho.soomterapp.R;
import com.example.shosho.soomterapp.presenter.EventPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements EventView,View.OnClickListener  {
Button organizer ,data,location;
    EventPresenter eventPresenter;
    TextView eventTitle,eventCategory,eventDateHigri,eventDateMilady,
            eventTime,eventLocation,eventDescription,waitingText;
    Typeface customFontLight,customFontMedium,customFontRoman;
    CardView c1,c2,c3,c4;
    LinearLayout c5;
    BottomNavigationView bottomNavigationView;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate( R.layout.fragment_main, container, false );

        eventPresenter=new EventPresenter( getContext(),this );

        eventPresenter.getData(new ItemRequest( 10,"ar" ));
        eventTitle=view.findViewById( R.id.textview_event_title );
        eventCategory=view.findViewById( R.id.textview_event_category );
        eventDateHigri=view.findViewById( R.id.textview_event_date1 );
        eventDateMilady=view.findViewById( R.id.textview_event_date2 );
        eventTime=view.findViewById( R.id.textview_event_time );
        eventLocation=view.findViewById( R.id.textview_event_location );
        eventDescription=view.findViewById( R.id.textview_event_description );
        c1=view.findViewById( R.id.card_visible1 );
        c2=view.findViewById( R.id.card_visible2 );
        c3=view.findViewById( R.id.card_visible3 );
        c4=view.findViewById( R.id.card_visible4 );
        c5=view.findViewById( R.id.card_visible5 );
        waitingText=view.findViewById( R.id.textview_visible );
        organizer=view.findViewById( R.id.button_gehatMonazama );
        data=view.findViewById( R.id.button_byanat );
        location=view.findViewById( R.id.button_mawke3 );

        organizer.setOnClickListener( this );
        data.setOnClickListener( this );
        location.setOnClickListener( this );

        customFontLight= Typeface.createFromAsset(getActivity().getAssets(),"font/SST Arabic Light.ttf");
        customFontMedium= Typeface.createFromAsset(getActivity().getAssets(),"font/SST Arabic Medium.ttf");
        customFontRoman= Typeface.createFromAsset(getActivity().getAssets(),"font/SST Arabic Roman.ttf");

        eventTitle.setTypeface( customFontMedium );
        eventCategory.setTypeface( customFontLight );
        eventDateHigri.setTypeface( customFontLight );
        eventDateMilady.setTypeface( customFontLight );
        eventTime.setTypeface( customFontLight );
        eventLocation.setTypeface( customFontLight );
        eventDescription.setTypeface( customFontRoman );
        return view;
    }
    @Override
    public void showResult(Result result) {
        eventTitle.setText( result.getTitle());
        eventCategory.setText("التصنيف ( "+ result.getBusinessCategory()+" )"  );
        String dateHigri=result.getHigriFromDate()+" إلى "+result.getHigriToDate();
        eventDateHigri.setText( dateHigri );
        String dateMilady=result.getDateFrom()+" إلي "+result.getDateTo();
        eventDateMilady.setText( dateMilady);
        String event_Time=result.getTimeFrom()+" إلي "+result.getTimeTo();
        eventTime.setText( event_Time );
        eventLocation.setText(result.getLocation());
        eventDescription.setText( result.getDetails() );

        waitingText.setVisibility( View.GONE );
        c1.setVisibility( View.VISIBLE );
        c2.setVisibility( View.VISIBLE );
        c3.setVisibility( View.VISIBLE );
        c4.setVisibility( View.VISIBLE );
        c5.setVisibility( View.VISIBLE );


    }



    @Override
    public void onClick(View view) {

        Fragment fragment;
        if(view==view.findViewById( R.id.button_gehatMonazama ))
        {
            fragment=new FragmentOrganizer();
        }else if(view==view.findViewById( R.id.button_mawke3 ))
        {
            fragment=new FragmentLocation();
        }
        else
            fragment=new FragmentData();
        FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace( R.id.fragment_container,fragment );
        fragmentTransaction.commit();
    }
}
