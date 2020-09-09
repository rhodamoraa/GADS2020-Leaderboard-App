package com.rhodagwata.gads2020leaderboard.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.rhodagwata.gads2020leaderboard.R;
import com.rhodagwata.gads2020leaderboard.model.GADS2020;

import java.util.List;


/**
 * Created by Aws on 11/03/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<GADS2020> mData ;
    RequestOptions option;


    public RecyclerViewAdapter(Context mContext, List<GADS2020> mData) {
        this.mContext = mContext;
        this.mData = mData;

        // Request option for Glide
       // option = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.gads_row_item,parent,false) ;


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {



          holder.tv_name.setText(mData.get(position).getName());
           holder.tv_ln_hours.setText(mData.get(position).getLn_hours());
          holder.tv_country.setText(mData.get(position).getCountry());

        // Load Image from the internet and set it into Imageview using Glide
        Glide.with(mContext).load(mData.get(position).getImage_url()).into(holder.img_thumbnail);



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name ;
        TextView tv_ln_hours ;
        TextView tv_country ;
        ImageView img_thumbnail;
        CardView view_container;





        public MyViewHolder(View itemView) {
            super(itemView);

            view_container = itemView.findViewById(R.id.container);
            tv_name = itemView.findViewById(R.id.gads_name);
            tv_ln_hours = itemView.findViewById(R.id.ln_hours);
            tv_country = itemView.findViewById(R.id.country);
            img_thumbnail = itemView.findViewById(R.id.thumbnail);



        }
    }

}
