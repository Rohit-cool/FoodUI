package com.gamertickky.foodui;

import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.ViewHolder> {

    private List<VerticalModel>verticalModelList;

    public VerticalAdapter(List<VerticalModel> verticalModelList) {
        this.verticalModelList = verticalModelList;
    }

    @NonNull
    @Override
    public VerticalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_item,parent,false);
        return new VerticalAdapter.ViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull VerticalAdapter.ViewHolder holder, int position) {
        String text = verticalModelList.get(position).getItem();
        String price = verticalModelList.get(position).getPrice();
        String review = verticalModelList.get(position).getReview();
        int image = verticalModelList.get(position).getImage();


        holder.setProductName(text);
        holder.setProductPrice(price);
        holder.setProductRating(review);
        holder.setProductImage(image);

    }

    @Override
    public int getItemCount() {
        return verticalModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView text,review,price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            text = itemView.findViewById(R.id.itemName);
            review = itemView.findViewById(R.id.totalReview);
            price = itemView.findViewById(R.id.itemPrce);
        }
        private void setProductName(String productName){
            text.setText(productName);
        }
        private void setProductPrice(String productPrice){
            price.setText(productPrice);
        }
        private void setProductRating(String productRating){
            review.setText(productRating);
        }
        private void setProductImage(int productImage){
            image.setImageResource(productImage);
        }

    }
}
