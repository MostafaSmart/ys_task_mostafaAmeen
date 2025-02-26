package com.example.ys_task_mostafaameen.data.Models.Orders;

import java.util.List;

public class OrderResponse {
    private List<OrderMaster> OrderMasterList;

    public List<OrderMaster> getOrderMasterList() { return OrderMasterList; }
    public void setOrderMasterList(List<OrderMaster> OrderMasterList) { this.OrderMasterList = OrderMasterList; }
}

