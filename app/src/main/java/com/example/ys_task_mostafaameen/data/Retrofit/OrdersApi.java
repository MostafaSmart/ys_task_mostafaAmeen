package com.example.ys_task_mostafaameen.data.Retrofit;

import com.example.ys_task_mostafaameen.data.Api.RequestModels.LoginRequest;
import com.example.ys_task_mostafaameen.data.Api.RequestModels.LoginResponse;
import com.example.ys_task_mostafaameen.data.Models.Orders.GetAllOrderRequest;
import com.example.ys_task_mostafaameen.data.Models.Orders.OrderResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface OrdersApi {

    @POST("Order/GetOrders")
    Call<OrderResponse> getAllOrders(@Body GetAllOrderRequest orderRequest);
}
