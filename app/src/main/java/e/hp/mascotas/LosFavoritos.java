package e.hp.mascotas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class LosFavoritos extends AppCompatActivity {
    ArrayList<Mascotas> listamascotas;
    private RecyclerView listaMascotasrv;
    @SuppressLint("RestrictedApi")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_los_favoritos);


        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBarfavorito);
        setSupportActionBar(miActionBar);



        listaMascotasrv = (RecyclerView) findViewById(R.id.rvMascotasrv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotasrv.setLayoutManager(llm);
        iniciarlistado();
        iniciarAdaptador();
    }
    public void iniciarAdaptador(){
        FavoritoAdaptador adaptador = new FavoritoAdaptador(listamascotas);
        listaMascotasrv.setAdapter(adaptador);
    }

    public void iniciarlistado(){

        listamascotas = new ArrayList<Mascotas>();
        listamascotas.add(new Mascotas(R.drawable.perro_3,"Dogui","6"));
        listamascotas.add(new Mascotas(R.drawable.perro_5,"Rambo","5"));
        listamascotas.add(new Mascotas(R.drawable.perro_2,"Linda","4"));
        listamascotas.add(new Mascotas(R.drawable.perro_1,"Negro","3"));
        listamascotas.add(new Mascotas(R.drawable.perro_4,"Princesa","2"));

    }
    private void setSupportActionBar(Toolbar miActionBar) {
    }
}