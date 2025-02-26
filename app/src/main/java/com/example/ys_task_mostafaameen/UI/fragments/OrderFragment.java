package com.example.ys_task_mostafaameen.UI.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ys_task_mostafaameen.R;


public class OrderFragment extends Fragment {
    private androidx.recyclerview.widget.RecyclerView orderRecyclerView;


    public OrderFragment() {
        // Required empty public constructor
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.fragment_order, container, false);
        implmnet(view);


        return view;
    }

    private void implmnet(View view) {
        orderRecyclerView = view.findViewById(R.id.orderRecyclerView);
    }
}