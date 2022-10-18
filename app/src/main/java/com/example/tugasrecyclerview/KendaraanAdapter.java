package com.example.tugasrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KendaraanAdapter extends RecyclerView.Adapter<KendaraanAdapter.ViewHolder> {

    Context context;
    String rNama[];
    String rDesc[];
    int rImage[];

    public KendaraanAdapter(Context context, String[] rNama, String[] rDesc, int[] rImage) {
        this.context = context;
        this.rNama = rNama;
        this.rDesc = rDesc;
        this.rImage = rImage;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(rImage[position]);
        holder.txtNama.setText(rNama[position]);
        holder.txtDesc.setText(rDesc[position]);
    }

    @Override
    public int getItemCount() {
        return rNama.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView txtNama, txtDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.image_view);
            txtNama = itemView.findViewById(R.id.txt_nama);
            txtDesc = itemView.findViewById(R.id.txt_desc);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("NAMA", rNama[getAdapterPosition()]);
                    intent.putExtra("DESC", rDesc[getAdapterPosition()]);
                    intent.putExtra("IMG", rImage[getAdapterPosition()]);

                    context.startActivity(intent);
                }
            });
        }
    }
}
