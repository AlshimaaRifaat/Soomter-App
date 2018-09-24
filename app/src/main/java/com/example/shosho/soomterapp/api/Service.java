package com.example.shosho.soomterapp.api;

import com.example.shosho.soomterapp.Model.ItemRequest;
import com.example.shosho.soomterapp.Model.ItemResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface Service {
    @POST("GetEVENTSBYID/")
    Call<ItemResponse>getEventsById(@Body ItemRequest itemRequest);
}
