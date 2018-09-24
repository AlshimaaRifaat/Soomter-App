package com.example.shosho.soomterapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.shosho.soomterapp.Model.Organizer;
import com.example.shosho.soomterapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterOrganizer extends RecyclerView.Adapter<AdapterOrganizer.GridViewHolder> {

    Context context;
    ArrayList<Organizer> organizers;

    public AdapterOrganizer(Context context, ArrayList<Organizer> organizers) {
        this.context = context;
        this.organizers = organizers;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate( R.layout.row_item_organizer,parent,false );
        return new GridViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Picasso.with( context ).load( organizers.get( position ).getImage() )
                .placeholder(R.drawable.untitled_1 ).into( holder.imageOrganizer );
    }

    @Override
    public int getItemCount() {
        return organizers.size();
    }
    public class GridViewHolder extends RecyclerView.ViewHolder {
         ImageView imageOrganizer;
        public GridViewHolder(View itemView) {
            super( itemView );
            imageOrganizer=itemView.findViewById( R.id.image_oganizer );
        }
    }
}
