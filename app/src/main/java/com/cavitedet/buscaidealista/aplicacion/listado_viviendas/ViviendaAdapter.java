package com.cavitedet.buscaidealista.aplicacion.listado_viviendas;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cavitedet.buscaidealista.R;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.Vivienda;

import java.util.List;

public class ViviendaAdapter extends RecyclerView.Adapter<ViviendaAdapter.ViewHolder> {

    private List<Vivienda> viviendaList;
    private Context context;

    public ViviendaAdapter(Context context, List<Vivienda> viviendaList) {
        this.viviendaList = viviendaList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.vivienda_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.asignarVivienda(context,viviendaList.get(position));
    }

    @Override
    public int getItemCount() {
        return viviendaList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imageView;
        private TextView direccionTextView;
        private TextView espacioTextView;
        private TextView precioTextView;
        private TextView longitudTextView;
        private TextView latitudTextView;
        private Vivienda vivienda;
        private Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            CardView cardView = itemView.findViewById(R.id.card);
            cardView.setOnClickListener(this);
            imageView = itemView.findViewById(R.id.miniatura_imagen);
            direccionTextView = itemView.findViewById(R.id.direccion);
            espacioTextView = itemView.findViewById(R.id.espacio);
            precioTextView = itemView.findViewById(R.id.precio);
            longitudTextView = itemView.findViewById(R.id.longitud);
            latitudTextView = itemView.findViewById(R.id.latitud);
        }

        public void asignarVivienda(Context context, Vivienda vivienda){
            this.vivienda = vivienda;
            this.context = context;
            direccionTextView.setText(context.getString(R.string.direccion,vivienda.getAddress()));
            espacioTextView.setText(context.getString(R.string.espacio,String.valueOf(vivienda.getSize())));
            precioTextView.setText(context.getString(R.string.precio,String.valueOf(vivienda.getPrice())));
            longitudTextView.setText(context.getString(R.string.longitud,String.valueOf(vivienda.getLongitude())));
            latitudTextView.setText(context.getString(R.string.latitud,String.valueOf(vivienda.getLatitude())));
            imageView.setImageBitmap(vivienda.getThumbnailBitmap());
        }

        @Override
        public void onClick(View v) {
            Intent paginaWebIntent = new Intent(Intent.ACTION_VIEW);
            paginaWebIntent.setData(Uri.parse(vivienda.getUrl()));
            context.startActivity(paginaWebIntent);
        }
    }
}
