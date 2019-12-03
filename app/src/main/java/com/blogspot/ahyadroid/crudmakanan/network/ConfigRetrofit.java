package com.blogspot.ahyadroid.crudmakanan.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConfigRetrofit {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://127.0.0.1/server_resto_ios/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public ApiService service = retrofit.create(ApiService.class);

}



