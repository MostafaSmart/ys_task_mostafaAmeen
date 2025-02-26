package com.example.ys_task_mostafaameen.MVVM.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.ys_task_mostafaameen.data.Api.RequestModels.LoginRequest;
import com.example.ys_task_mostafaameen.data.Api.RequestModels.LoginResponse;
import com.example.ys_task_mostafaameen.data.Models.Orders.GetAllOrderRequest;
import com.example.ys_task_mostafaameen.data.Models.Orders.OrderResponse;
import com.example.ys_task_mostafaameen.data.Repositorys.LoginRepository;
import com.example.ys_task_mostafaameen.data.Repositorys.OrderRepository;

public class OrdersViewModels extends ViewModel {


    private MutableLiveData<OrderResponse> orderResponseMutableLiveData;
    private OrderRepository orderRepository;

    public OrdersViewModels(OrderRepository orderRepository) {
        this.orderResponseMutableLiveData = new MutableLiveData<>();
        this.orderRepository=orderRepository;
    }

    public void getAllOrders (GetAllOrderRequest getAllOrderRequest){
        orderRepository.getAllOrders(getAllOrderRequest).observeForever(authResponse -> orderResponseMutableLiveData.setValue(authResponse));
    }




    public LiveData<OrderResponse> getAllOrdersResponse() {
        return orderResponseMutableLiveData;
    }


}
