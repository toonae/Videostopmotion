package com.example.computer.videostopmotion;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter1 extends RecyclerView.Adapter<Adapter1.myViewHolder> {

    Context mContext1;
    List<item> mData1;


    public  Adapter1(Context mContext, List<item>mData){
        this.mContext1=mContext;
        this.mData1=mData;
    }

    @Override
    public  myViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        LayoutInflater inflater = LayoutInflater.from(mContext1);
        View v = inflater.inflate(R.layout.sweetfood1,parent,false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position){
        holder.background_img.setImageResource(mData1.get(position).getBackground());
        holder.profile_photo.setImageResource(mData1.get(position).getProfilePhoto());
        holder.tv_title.setText(mData1.get(position).getProfileName());

    }

    @Override
    public int getItemCount(){
        return mData1.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{


        ImageView profile_photo,background_img;
        TextView tv_title;

        public myViewHolder(View itemView){
            super(itemView);
            profile_photo = itemView.findViewById(R.id.pro1);
            background_img = itemView.findViewById(R.id.card_bg1);
            tv_title = itemView.findViewById(R.id.card_title1);
        }
    }
}