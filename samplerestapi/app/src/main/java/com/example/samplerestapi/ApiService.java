package com.example.samplerestapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("users")
    Call<UserResponse> getUsers(@Query("page") int page);
}