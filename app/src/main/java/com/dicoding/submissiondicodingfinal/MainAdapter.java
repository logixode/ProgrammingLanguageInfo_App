package com.dicoding.submissiondicodingfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.submissiondicodingfinal.model.varData;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.CategoryViewHolder> {

    private ArrayList<varData> listData;
    public MainAdapter(ArrayList<varData> list) {
        this.listData = list;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
//    public void setOnItemClickCallback(OnItemClickCallbak onItemClickCallback){
//    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.homepage_list, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder holder, int position) {
        varData varData = listData.get(position);
        Glide.with(holder.itemView.getContext())
                .load(varData.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(varData.getName());
        holder.tvDetail.setText(varData.getFrom());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onItemClickCallback.onItemClicked();
//            }
//        });

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent moveIntent = new Intent(v.getContext(), MainAdapter.class);
//                    v.getContext().startActivity(moveIntent);
//                }
//            });
    }


    public interface OnItemClickCallback {
        void onItemClicked(varData data);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        CategoryViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle bundle = new Bundle();
                    bundle.putString
                    Intent moveIntent = new Intent(MainActivity.this, MainAdapter.class);
                    v.getContext().startActivity(moveIntent);
                    showRecyclerList
                }
            });

        }

//        public String getContext() {
//            return context;
//        }
    }
}
