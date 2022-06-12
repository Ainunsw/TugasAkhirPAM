package com.example.keluhan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter extends FirebaseRecyclerAdapter<model,myadapter.myviewholder>
{
    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model)
    {
        holder.nama.setText(model.getNama());
        holder.nim.setText(model.getNim());
        holder.jurusan.setText(model.getJurusan());
        holder.keluhan.setText(model.getKeluhan());

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        TextView nama,nim,jurusan, keluhan;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            nama=(TextView)itemView.findViewById(R.id.nametext);
            nim=(TextView)itemView.findViewById(R.id.nimtext);
            jurusan=(TextView)itemView.findViewById(R.id.jurusantext);
            keluhan = (TextView) itemView.findViewById(R.id.keluhantext);
        }
    }
}
