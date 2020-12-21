package e.hp.mascotas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    ArrayList<Mascotas> Mimascotas;
    private RecyclerView listaMascotas;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        iniciarlistado();
        iniciarAdaptador();

    }

    public void llamarfavorito(View v){
        Intent intent = new Intent(v.getContext(),LosFavoritos.class);
        startActivity(intent);
    }
    public void iniciarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(Mimascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void iniciarlistado(){
        Mimascotas = new ArrayList<Mascotas>();
        Mimascotas.add(new Mascotas(R.drawable.perro_1,"Negro","3"));
        Mimascotas.add(new Mascotas(R.drawable.perro_2,"Linda","4"));
        Mimascotas.add(new Mascotas(R.drawable.perro_3,"Dogui","6"));
        Mimascotas.add(new Mascotas(R.drawable.perro_4,"Princesa","2"));
        Mimascotas.add(new Mascotas(R.drawable.perro_5,"Rambo","5"));

    }
    private void setSupportActionBar(Toolbar miActionBar) {
    }





}