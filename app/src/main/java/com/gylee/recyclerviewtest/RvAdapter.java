package com.gylee.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {

    private List<User> userList;
    private Context context;
    public RvAdapter(Context context) {
        userList = User.users;
        userList.add(new User("Job"));
        userList.add(new User("Mike"));
        userList.add(new User("Tom"));
        userList.add(new User("Jike"));
        userList.add(new User("Monika"));
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv_list,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(userList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name  = itemView.findViewById(R.id.name);
        }
    }
}
