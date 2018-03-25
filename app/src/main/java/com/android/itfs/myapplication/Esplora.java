package com.android.itfs.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.android.itfs.myapplication.adapter.RistAdapter;
import com.android.itfs.myapplication.model.Ristorante;

import java.util.ArrayList;
import java.util.List;

public class Esplora extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esplora);

        adapter = new RistAdapter(insRist());


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private List insRist(){

       List rists = new ArrayList<Ristorante>();

        Ristorante r1 = new Ristorante();
        r1.setNome("CIAO");
        r1.setPrz(19.99f);
        r1.setCategoria("Sushi");
        r1.setFoto1("https://www.wien.info/media/images/41993-das-loft-sofitel-19to1.jpeg");


        Ristorante r2 = new Ristorante();
        r2.setNome("SEMFKME");
        r2.setPrz(19.99f);
        r2.setCategoria("Sushi");
        r2.setFoto1("https://www.wien.info/media/images/41993-das-loft-sofitel-19to1.jpeg");


        Ristorante r3 = new Ristorante();
        r3.setNome("ERJNOWR");
        r3.setPrz(19.99f);
        r3.setCategoria("Sushi");
        r3.setFoto1("https://www.wien.info/media/images/41993-das-loft-sofitel-19to1.jpeg");


        rists.add(r1);
        rists.add(r2);
        rists.add(r3);
        return rists;
    }
}
