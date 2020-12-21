package e.hp.mascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FavoritoAdaptador extends RecyclerView.Adapter<FavoritoAdaptador.MascotasViewHolder>{
    ArrayList<Mascotas> mascota;

    public FavoritoAdaptador(ArrayList<Mascotas> mascotas){
         this.mascota = mascotas;
    }

    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_favoritos,parent,false);
        return new MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotasViewHolder holder, int position) {
        Mascotas mascotas = mascota.get(position);
        holder.imgFoto.setImageResource(mascotas.getFoto());
        holder.tvNombre.setText(mascotas.getNombre());
        holder.tvEstrella.setText(mascotas.getEstrella());
    }

    @Override
    public int getItemCount() {
        return mascota.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFoto;
        private TextView tvNombre;
        private TextView tvEstrella;
        public MascotasViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.mifotocv);
            tvNombre = (TextView) itemView.findViewById(R.id.minombrecv);
            tvEstrella = (TextView) itemView.findViewById(R.id.mivotocv);





        }
    }
}
