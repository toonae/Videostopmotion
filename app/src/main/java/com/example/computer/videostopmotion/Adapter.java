package com.example.computer.videostopmotion;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    Context mContext;
    List<item>mData;


    public  Adapter(Context mContext, List<item>mData){
        this.mContext=mContext;
        this.mData=mData;
    }

    @Override
    public  myViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.meatfood1,parent,false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position){
        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.profile_photo.setImageResource(mData.get(position).getProfilePhoto());
        holder.tv_title.setText(mData.get(position).getProfileName());

    }

    @Override
    public int getItemCount(){
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{


        ImageView profile_photo,background_img;
        TextView tv_title;

        public myViewHolder(View itemView){
            super(itemView);
            profile_photo = itemView.findViewById(R.id.pro);
            background_img = itemView.findViewById(R.id.card_bg);
            tv_title = itemView.findViewById(R.id.card_title);
        }
    }
}
