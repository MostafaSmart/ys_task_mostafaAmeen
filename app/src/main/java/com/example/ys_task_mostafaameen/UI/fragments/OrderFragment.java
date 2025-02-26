package com.example.ys_task_mostafaameen.UI.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ys_task_mostafaameen.MVVM.ModelFactory.AuthViewModelFactory;
import com.example.ys_task_mostafaameen.MVVM.ModelFactory.OrdersViewModelFactory;
import com.example.ys_task_mostafaameen.MVVM.ViewModels.AuthModelView;
import com.example.ys_task_mostafaameen.MVVM.ViewModels.OrdersViewModels;
import com.example.ys_task_mostafaameen.R;
import com.example.ys_task_mostafaameen.adapters.GetOrderAdabter;
import com.example.ys_task_mostafaameen.data.Models.Orders.GetAllOrderRequest;
import com.example.ys_task_mostafaameen.data.Models.Orders.OrderMaster;
import com.example.ys_task_mostafaameen.data.Models.Orders.OrderResponse;
import com.example.ys_task_mostafaameen.data.Repositorys.LoginRepository;
import com.example.ys_task_mostafaameen.data.Repositorys.OrderRepository;

import java.util.List;


public class OrderFragment extends Fragment {
    private androidx.recyclerview.widget.RecyclerView orderRecyclerView;
    private GetOrderAdabter adabter;
    private int startCount =0 ;
    private Button next;
    private OrdersViewModels ordersViewModels;

    public OrderFragment() {
    }

    public static OrderFragment newInstance() {
        OrderFragment fragment = new OrderFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }

        OrderRepository orderRepository = new OrderRepository();
        OrdersViewModelFactory authViewModelFactory = new OrdersViewModelFactory(orderRepository);

        ordersViewModels = new ViewModelProvider(this,authViewModelFactory).get(OrdersViewModels.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.fragment_order, container, false);

        GetAllOrderRequest.ValueGetOrder value = new GetAllOrderRequest.ValueGetOrder("87", "1", "1", "2");
        GetAllOrderRequest request = new GetAllOrderRequest(value);
        ordersViewModels.getAllOrders(request);
        implmnet(view);
        setupViewModel();

        return view;
    }


    private void setupViewModel() {



        ordersViewModels.getAllOrdersResponse().observe(getViewLifecycleOwner(), orderResponse -> {
            if (orderResponse != null && orderResponse.getData() != null) {

                OrderResponse.Data dd=    orderResponse.getData();

                List<OrderMaster> orders =  dd.getOrderMasterList();
                Log.d("counnt", String.valueOf(orders.size()));
                adabter = new GetOrderAdabter(orders,startCount);
                orderRecyclerView.setAdapter(adabter);
            }
        });
    }

    private void implmnet(View view) {
        orderRecyclerView = view.findViewById(R.id.orderRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        orderRecyclerView.setLayoutManager(layoutManager);
    }
}