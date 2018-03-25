package com.android.itfs.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.itfs.myapplication.R;
import com.android.itfs.myapplication.model.Ristorante;
import com.squareup.picasso.Picasso;

import java.util.List;


public class RistAdapter extends RecyclerView.Adapter<RistAdapter.ViewHolder> {




    private List<Ristorante> lista;


    static class ViewHolder extends RecyclerView.ViewHolder {

        public Context c;
        public TextView nometxt;
        public TextView prezzotxt;
        public TextView categtxt;
        public ImageView img;

        public ViewHolder(View v) {
            super(v);
            nometxt = (TextView) v.findViewById(R.id.nometxt);
            categtxt = (TextView) v.findViewById(R.id.cattxt);
            prezzotxt = (TextView) v.findViewById(R.id.prezzotxt);
            img = (ImageView) v.findViewById(R.id.foto);

            c=v.getContext();
        }
    }

    public RistAdapter(List<Ristorante> dataset) {
        lista = dataset;
    }

    @Override
    public RistAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nometxt.setText(lista.get(position).getNome());
        holder.prezzotxt.setText(String.valueOf(lista.get(position).getPrz()));
        holder.categtxt.setText(lista.get(position).getCategoria());
        Picasso.with(holder.c).load(lista.get(position).getFoto1()).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
