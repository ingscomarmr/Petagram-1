package com.malko7.petagram;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_favoritos) {
            Intent intent = new Intent(MainActivity.this, Favoritos.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.tbMain);
        setSupportActionBar(toolbar);

        List<Mascota> mascotas = Arrays.asList(
                new Mascota(R.drawable.pet_1, "Rocky", 10),
                new Mascota(R.drawable.pet_2, "Pelusa", 7),
                new Mascota(R.drawable.pet_3, "Zeus", 12),
                new Mascota(R.drawable.pet_4, "Pequeña", 5),
                new Mascota(R.drawable.pet_5, "Sansón", 15),
                new Mascota(R.drawable.pet_1, "Riko", 1),
                new Mascota(R.drawable.pet_2, "Osa", 3),
                new Mascota(R.drawable.pet_3, "Blanca", 5),
                new Mascota(R.drawable.pet_4, "Chikis", 15),
                new Mascota(R.drawable.pet_5, "Rambo", 11)
        );

        recyclerView = (RecyclerView) findViewById(R.id.rvMain);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new MascotaAdapter(mascotas);
        recyclerView.setAdapter(adapter);

        FloatingActionButton fabSubir = (FloatingActionButton) findViewById(R.id.fabSubir);
        fabSubir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.floating_action_button_message), Snackbar.LENGTH_LONG)
                        .setAction(getResources().getString(R.string.snackbar_message), new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.i("SNACKBAR", "Acción del SnackBar.");
                            }
                        })
                        .show();
            }
        });
    }
}
