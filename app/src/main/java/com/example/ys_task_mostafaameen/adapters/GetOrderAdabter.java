package com.example.ys_task_mostafaameen.adapters;

import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ys_task_mostafaameen.R;
import com.example.ys_task_mostafaameen.data.Models.Orders.OrderMaster;
import com.example.ys_task_mostafaameen.data.Models.Orders.OrderResponse;

import java.util.List;

public class GetOrderAdabter extends RecyclerView.Adapter<GetOrderAdabter.OrderViewHolder> {

private List<OrderMaster> postList;
private int startCount;


public GetOrderAdabter(List<OrderMaster> postList,int startCount) {
        this.postList = postList;
        this.startCount=startCount;
        }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_item, parent, false);

        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {

        OrderMaster data = postList.get(position);

        holder.txtTime.setText(data.getBillTime());

        holder.txtTimee.setText(data.getPassedTime());

        holder.txtOrderState.setText("#order no: " + data.getBillNo());


        if ("محلي".equals(data.getBillDocTypeName())){
            holder.txtDine.setText("Dine in");

        }
        else{
            holder.txtDine.setText("Dine out");

        }

        if ("1".equals(data.getCancelFlag())) {
            holder.txtState.setText("Canceled");
            holder.txtState.setTextColor(Color.RED);
        } else {
            switch (data.getOrderStatus()) {
                case "1":
                    holder.txtState.setText("New Order");
                    holder.txtState.setTextColor(Color.GREEN);
                    break;
                case "2":
                    holder.txtState.setText("Order Modified");
                    holder.txtState.setTextColor(Color.BLUE);
                    break;
                case "3":
                    holder.txtState.setText("Order Delayed");
                    holder.txtState.setTextColor(Color.YELLOW);
                    break;
                default:
                    holder.txtState.setText("Unknown Status");
                    holder.txtState.setTextColor(Color.GRAY);
                    break;
            }
        }


        Log.d("countssProdacr:", String.valueOf(data.getOrderDetails().size()));

        ProdactAdabters adabter = new ProdactAdabters(data.getOrderDetails());
        LinearLayoutManager layoutManager = new LinearLayoutManager(holder.itemView.getContext(), LinearLayoutManager.VERTICAL, false);
        holder.recyclerViewOnePr.setLayoutManager(layoutManager);
        holder.recyclerViewOnePr.setAdapter(adabter);



    }



@Override
public int getItemCount() {


        if(startCount+4 < postList.size()){
            return postList.size();
        }
        else
        {
            return startCount+4;

        }


        }


static class OrderViewHolder extends RecyclerView.ViewHolder {

    private TextView txtTime;
    private TextView txtDine;
    private TextView txtState;
    private TextView txtTimee;
    private TextView txtOrderState;
    private LinearLayout colorItem;
    private androidx.recyclerview.widget.RecyclerView recyclerViewOnePr;

    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);


        txtTime = itemView.findViewById(R.id.txtTime);
        txtDine = itemView.findViewById(R.id.txtDine);
        txtState = itemView.findViewById(R.id.txtState);
        txtTimee =itemView.findViewById(R.id.txtTimee);
        txtOrderState = itemView.findViewById(R.id.txtOrderState);
        recyclerViewOnePr = itemView.findViewById(R.id.recyclerViewOnePr);
        colorItem = itemView.findViewById(R.id.colorItem);

    }
}
}