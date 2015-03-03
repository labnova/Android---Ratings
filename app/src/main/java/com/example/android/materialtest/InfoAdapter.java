package com.example.android.materialtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;



public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.MyViewHolder> {

    private final LayoutInflater inflater;
    List<Information> data = Collections.emptyList();
    private Context contesto;

    public InfoAdapter(Context context, List<Information> data) {

        contesto=context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    public void delete(int position){
        data.remove(position);
        notifyItemRemoved(position);

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_row, parent, false);
        Log.d("Tag", "onCreateViewHolder chiamato");
        MyViewHolder holder= new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Information current = data.get(position);
        Log.d("Tag", "onBindViewHolder chiamato a"+position);
        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconId);
        /*holder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Item cliccato a " +position, Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {
        TextView title;
        ImageView icon;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.listText);
            icon = (ImageView) itemView.findViewById(R.id.imageText);
            icon.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            //Toast.makeText(contesto, "Item cliccato alla posizione " +getPosition(), Toast.LENGTH_SHORT).show();
            delete(getPosition());
        }
    }
}
