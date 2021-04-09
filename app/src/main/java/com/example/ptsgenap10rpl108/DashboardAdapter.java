package com.example.ptsgenap10rpl108;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder>{



    Context context;
    ArrayList<DashboardModel> models;
    public DashboardAdapter(Context context, ArrayList<DashboardModel> models) {
        this.context = context;
        this.models = models;
    }
    @NonNull
    @Override
    public DashboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dashboard_menu_list, parent, false);
        return new DashboardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardViewHolder holder, int position) {
        holder.txtMenu.setText(models.get(position).getMenu());
        holder.txtDeskripsi.setText(models.get(position).getDeskripsi());
        holder.image.setImageResource(models.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class DashboardViewHolder extends RecyclerView.ViewHolder{

        ImageView image;

        TextView txtDeskripsi, txtMenu;


        public DashboardViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMenu = (TextView) itemView.findViewById(R.id.menu);
            txtDeskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
            image = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
