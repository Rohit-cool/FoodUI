package com.gamertickky.foodui;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ViewHolder> {

    private List<horizontalModel>horizontalModelList;
    int row_index = -1;


    public HorizontalAdapter(List<horizontalModel> horizontalModelList) {
        this.horizontalModelList = horizontalModelList;
    }

    @NonNull
    @Override
    public HorizontalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizonta_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalAdapter.ViewHolder holder, final int position) {
        String text = horizontalModelList.get(position).getText();

        holder.setProductText(text);
        holder.horiItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index=position;
                notifyDataSetChanged();
            }
        });

        if (row_index==position) {
            holder.horiItem.setBackgroundColor(Color.YELLOW);

        } else {
            holder.horiItem.setBackgroundColor(Color.parseColor("#E6DCD9C4"));
        }
    }

    @Override
    public int getItemCount() {
        return horizontalModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView text;
        private ConstraintLayout horiItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.text);
            horiItem = itemView.findViewById(R.id.horiItem);
        }
        private void setProductText(String productText){
            text.setText(productText);
        }
    }
}
