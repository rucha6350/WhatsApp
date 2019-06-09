package com.rucha.whatsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context mContext;
    List<Chat> mData;

    public RecyclerViewAdapter(Context mContext, List<Chat> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.chat_layout, parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.img_pp.setImageResource(mData.get(position).getPhoto3());
        holder.tv_username.setText(mData.get(position).getUser_Name());
        holder.tv_timex.setText(mData.get(position).getTime());
        holder.img_ticks.setImageResource(mData.get(position).getPhoto1());
        holder.tv_message.setText(mData.get(position).getMessage());
        holder.img_notifier.setImageResource(mData.get(position).getPhoto2());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView img_pp;
        private TextView tv_username;
        private TextView tv_timex;
        private ImageView img_ticks;
        private TextView tv_message;
        private ImageView img_notifier;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img_pp = (ImageView) itemView.findViewById(R.id.profilepic);
            tv_username = (TextView) itemView.findViewById(R.id.user_name);
            tv_timex = (TextView) itemView.findViewById(R.id.timex);
            img_ticks = (ImageView) itemView.findViewById(R.id.seenticks);
            tv_message = (TextView) itemView.findViewById(R.id.message_send);
            img_notifier = (ImageView) itemView.findViewById(R.id.messnotifier);
        }
    }
}
