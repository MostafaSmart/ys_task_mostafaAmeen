package com.example.ys_task_mostafaameen.data.Retrofit;

import com.example.ys_task_mostafaameen.data.Api.RequestModels.LoginRequest;
import com.example.ys_task_mostafaameen.data.Api.RequestModels.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginApi {

    @POST("User/GetUserDetails")
    Call<LoginResponse> login(@Body LoginRequest authRequest);

}
