package com.example.shosho.soomterapp.presenter;

import android.content.Context;
import android.widget.Toast;

import com.example.shosho.soomterapp.EventView;
import com.example.shosho.soomterapp.Model.ItemRequest;
import com.example.shosho.soomterapp.Model.ItemResponse;
import com.example.shosho.soomterapp.api.Client;
import com.example.shosho.soomterapp.api.Service;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventPresenter {
    Context context;
    EventView eventView;

    public EventPresenter(Context context, EventView eventView) {
        this.context = context;
        this.eventView = eventView;
    }

    public void getData(ItemRequest itemRequest) {

        String Base_URL = "http://mobile.soomter.com/API/";

        Service service = Client.getClient( Base_URL ).create( Service.class );
        Call<ItemResponse> call = service.getEventsById( itemRequest );
        call.enqueue( new Callback<ItemResponse>() {
            @Override
            public void onResponse(Call<ItemResponse> call, Response<ItemResponse> response) {
                eventView.showResult( response.body().getResult() );
            }

            @Override
            public void onFailure(Call<ItemResponse> call, Throwable t) {
                Toast.makeText( context, "failed", Toast.LENGTH_SHORT ).show();
            }
        } );
    }
}
