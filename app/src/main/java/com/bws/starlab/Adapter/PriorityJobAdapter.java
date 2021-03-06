package com.bws.starlab.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bws.starlab.Models.PriorityJobModel;
import com.bws.starlab.R;

import java.util.List;

public class PriorityJobAdapter extends RecyclerView.Adapter<PriorityJobAdapter.ViewHolder> {

    private List<PriorityJobModel> list;

    public PriorityJobAdapter(List<PriorityJobModel> list) {
        this.list = list;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemlist_job_priority, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PriorityJobAdapter.ViewHolder holder, int position) {
        PriorityJobModel myList = list.get(position);
        holder.textViewHead.setText(myList.getStringText());
        holder.textDate.setText(myList.getDate());
        holder.textTime.setText(myList.getTime());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewHead;
        public TextView textDate;
        public TextView textTime;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewHead = (TextView) itemView.findViewById(R.id.textHeader);
            textDate = (TextView) itemView.findViewById(R.id.textDate);
            textTime = (TextView) itemView.findViewById(R.id.textTime);
        }
    }

}