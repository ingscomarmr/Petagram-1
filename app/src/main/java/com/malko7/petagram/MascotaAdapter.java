package com.malko7.petagram;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mjcruzs on 13/5/16.
 */
public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder> {

    public List<Mascota> mascotas;

    public MascotaAdapter(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mascota, parent, false);

        return new MascotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder holder, int position) {
        Mascota mascota = mascotas.get(position);
        holder.imgvPet.setImageResource(mascota.getFoto());
        holder.imgvLike.setImageResource(R.drawable.btn_like);
        holder.tvPetName.setText(mascota.getNombre());
        holder.tvLikes.setText(String.valueOf(mascota.getVotos()));
        holder.imgvLikes.setImageResource(R.drawable.btn_like_counter);
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgvLike;
        public TextView tvPetName;
        public TextView tvLikes;
        public ImageView imgvLikes;
        public ImageView imgvPet;

        public MascotaViewHolder(View itemView) {
            super(itemView);

            imgvLike = (ImageView) itemView.findViewById(R.id.imgvLike);
            tvPetName = (TextView) itemView.findViewById(R.id.tvPetName);
            tvLikes = (TextView) itemView.findViewById(R.id.tvLikes);
            imgvLikes = (ImageView) itemView.findViewById(R.id.imgvLikes);
            imgvPet = (ImageView) itemView.findViewById(R.id.imgvPet);
        }
    }

}
