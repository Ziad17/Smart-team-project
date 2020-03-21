package com.example.ApiPackage;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyApiClient {
    private static final String BASE_URL="http://localhost/myapifiles";
    private static MyApiClient instance;
    private Retrofit retrofit;

    private MyApiClient()
    {
        retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized MyApiClient getInstance()
    {
        if (instance==null)
        {
            instance=new MyApiClient();
        }
        return instance;
    }
    public RESTApi getApi()
    {
        return retrofit.create(RESTApi.class);
    }
}
