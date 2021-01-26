package com.example.gadsleadersboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class GadsAdapter extends RecyclerView.Adapter<GadsAdapter.GadsHolder> {
    private List<GadsModel> list;
    public GadsAdapter() {
    }

    @NonNull
    @Override
    public GadsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GadsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_details, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GadsHolder holder, int position) {
        holder.name.setText(list.get(position).getName());
        holder.score.setText(list.get(position).getScore());
        holder.country.setText(list.get(position).getCountry());
        Picasso.get().load(list.get(position).getBadgeUrl()).into(holder.myImage);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class GadsHolder extends RecyclerView.ViewHolder{
        CircleImageView myImage;
        TextView name, score, country;
        public GadsHolder(@NonNull View itemView) {
            super(itemView);

            this.myImage = itemView.findViewById(R.id.imageView);
            this.name = itemView.findViewById(R.id.textViewName);
            this.score = itemView.findViewById(R.id.textViewScore);
            this.country = itemView.findViewById(R.id.textViewCountry);
        }
    }
}
