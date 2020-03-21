package com.example.ApiPackage;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RESTApi {

    @FormUrlEncoded
    @POST("")
    Call<ResponseBody> createuser(@Field("parameter1") String hehe,
                                  @Field("parameter1") String hehe1
                                  );

}
