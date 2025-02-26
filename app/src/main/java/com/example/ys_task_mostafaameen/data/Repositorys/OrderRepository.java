package com.example.ys_task_mostafaameen.data.Repositorys;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.ys_task_mostafaameen.data.Api.RequestModels.Datam;
import com.example.ys_task_mostafaameen.data.Api.RequestModels.LoginRequest;
import com.example.ys_task_mostafaameen.data.Api.RequestModels.LoginResponse;
import com.example.ys_task_mostafaameen.data.Api.RequestModels.UserData;
import com.example.ys_task_mostafaameen.data.Models.Orders.GetAllOrderRequest;
import com.example.ys_task_mostafaameen.data.Models.Orders.OrderResponse;
import com.example.ys_task_mostafaameen.data.Retrofit.ApiClient;
import com.example.ys_task_mostafaameen.data.Retrofit.LoginApi;
import com.example.ys_task_mostafaameen.data.Retrofit.OrdersApi;
import com.example.ys_task_mostafaameen.data.Room.Entity.UserDataRoom;
import com.example.ys_task_mostafaameen.data.Room.Helpers.UserDatabaseHelper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OrderRepository{


    private OrdersApi api;

    public OrderRepository() {
        this.api = ApiClient.getClient().create(OrdersApi.class);
    }

    public LiveData<OrderResponse> getAllOrders (GetAllOrderRequest orderRequest){

        MutableLiveData<OrderResponse> data = new MutableLiveData<>();
        Log.d("data_request" ,orderRequest.toString() );

        Call<OrderResponse> call = api.getAllOrders(orderRequest);

        call.enqueue(new Callback<OrderResponse>() {
            @Override
            public void onResponse(Call<OrderResponse> call, Response<OrderResponse> response) {
                if (response.isSuccessful() && response.body() != null) {

                    Log.d("API_RESPONSE", response.body().toString());

                    data.setValue(response.body());

                } else {

                    Log.d("API_RdddESPONSE", response.toString());
                    data.setValue(null);
                }

            }

            @Override

            public void onFailure(Call<OrderResponse> call, Throwable t) {
                Log.d("API_ERROR", t.getMessage());
                data.setValue(null);

            }

        });

        return data;
    }




}
