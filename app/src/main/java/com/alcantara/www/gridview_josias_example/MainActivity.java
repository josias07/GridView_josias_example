package com.alcantara.www.gridview_josias_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
   GridView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (GridView) findViewById(R.id.gridView);

        String[] datos={"Arroz con Pollo","Juane","Cebiche","Inchicapi","Guiso de Pollo","Tallarin Saltado"
                        ,"Milanesa","Tilapia Frita","Aji de Gallina","Granadilla","Escabeche de pollo"
                        ,"Seco de Res","Caldo de Gallina","Chaufa","Pollo a la Plancha","Tacacho"};
        ArrayAdapter lista_comidas = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_activated_1, datos);

        lista.setAdapter(lista_comidas);
    }
}
