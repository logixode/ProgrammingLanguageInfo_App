package com.dicoding.submissiondicodingfinal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.submissiondicodingfinal.model.varData;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.CategoryViewHolder> {

    private ArrayList<varData> listProgram;
    private Context context;
    private Activity activity;

    private OnItemClickCallback onItemClickCallback;

    public MainAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<varData> getListProgram() {
        return listProgram;
    }

    public void setList(ArrayList<varData> listData) {
        this.listProgram = listProgram;
    }

//    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
//        this.onItemClickCallback = onItemClickCallback;
//    }
//
    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.homepage_list, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder holder, int position) {
        varData varData = getListProgram().get(position);
//        Glide.with(context).load(varData.getPhoto()).override(350,550).into(holder.imgPhoto);

        Glide.with(holder.itemView.getContext())
                .load(varData.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(varData.getName());
        holder.tvDetail.setText(varData.getFrom());
        holder.varData = varData;
    }


    public interface OnItemClickCallback {
        void onItemClicked(varData data);
    }

    @Override
    public int getItemCount() {
        return getListProgram().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btndetail;
        varData varData;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btndetail = itemView.findViewById(R.id.btn_set_detail);
            btndetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("key", varData);
            context.startActivity(intent);
        }
    }
}
