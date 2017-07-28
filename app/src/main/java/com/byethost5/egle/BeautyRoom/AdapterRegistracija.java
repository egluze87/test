package com.byethost5.egle.BeautyRoom;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Collections;
import java.util.List;

public class AdapterRegistracija extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    List<Registracija> data= Collections.emptyList();
    Registracija current;
    int currentPos=0;

    // create constructor to initialize context and data sent from MainActivity
    public AdapterRegistracija(Context context, List<Registracija> data){
        this.context=context;
        inflater= LayoutInflater.from(context);
        this.data=data;
    }

    // Inflate the layout when ViewHolder created
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.container_registracija, parent,false);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    // Bind data
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        // Get current position of item in RecyclerView to bind data and assign values from list
        MyHolder myHolder= (MyHolder) holder;
        Registracija current=data.get(position);
        myHolder.textProcedura.setText(current.getProcedura());
        myHolder.textVartotojas.setText("Vartotojas: " + current.getVartotojas());
        myHolder.textData.setText("Data: " + current.getData());
        myHolder.textLaikas.setText("Laikas: " + current.getLaikas());
    }

    // return total item from List
    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textProcedura;
        TextView textVartotojas;
        TextView textData;
        TextView textLaikas;

        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            textProcedura = (TextView) itemView.findViewById(R.id.textProcedura);
            textVartotojas = (TextView) itemView.findViewById(R.id.textVartotojas);
            textData = (TextView) itemView.findViewById(R.id.textData);
            textLaikas = (TextView) itemView.findViewById(R.id.textLaikas);
            itemView.setOnClickListener(this);

        }

        // Click event for all items
        @Override
        public void onClick(View v) {

            Toast.makeText(context, "You clicked an procedure", Toast.LENGTH_SHORT).show();

        }

    }

}
