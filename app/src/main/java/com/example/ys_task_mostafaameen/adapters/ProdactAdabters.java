package com.example.ys_task_mostafaameen.adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ys_task_mostafaameen.R;
import com.example.ys_task_mostafaameen.data.Models.Orders.OrderDetail;
import com.example.ys_task_mostafaameen.data.Models.Orders.OrderMaster;

import java.util.List;

public class ProdactAdabters extends RecyclerView.Adapter<ProdactAdabters.ProdactViewHolder> {

    private List<OrderDetail> postList;


    public ProdactAdabters(List<OrderDetail> postList) {
        this.postList = postList;

    }

    @NonNull
    @Override
    public ProdactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.prodact_item_order, parent, false);


        return new ProdactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdactViewHolder holder, int position) {
        OrderDetail data = postList.get(position);

        holder.txtProdect.setText(data.getItemName());
    }


    @Override
    public int getItemCount() {


    return postList.size();


    }


    static class ProdactViewHolder extends RecyclerView.ViewHolder {
        private View colorView;
        private CheckBox checkBox;
        private TextView txtProdect;



        public ProdactViewHolder(@NonNull View itemView) {
            super(itemView);



            checkBox = itemView.findViewById(R.id.checkBox);
            colorView = itemView.findViewById(R.id.colorView);
            txtProdect = itemView.findViewById(R.id.txtProdect);

        }
    }
}