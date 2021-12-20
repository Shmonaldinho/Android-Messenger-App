package com.example.androidmessengerapp;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter(Context context, ArrayList<User> userList) extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{
    private TextView textName;
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) extends UserViewHolder{
        View view = LayoutInflater.from(context).inflate(R.layout.user_layout, parent, false);
        return UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class UserViewHolder(View itemView) extends RecyclerView.ViewHolder(itemView){
        textName = (TextView) textName.findViewById(R.id.txt_name);
    }

}
