package com.example.listamatricula;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView lista;
    List<String> cursos;
    Button btnToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);
        btnToast.setOnClickListener(this);
        cursos = new ArrayList<>();
        cursos.add("Simulación de Sistemas");
        cursos.add("Sistemas de Información");
        cursos.add("Desarrollo de Aplicaciones para Móviles");
        cursos.add("Arquitectura de Computadoras");
        cursos.add("Sistemas Operativos");
        cursos.add("Analisis y diseño de sistemas");
        cursos.add("Big Data");

        ArrayAdapter adaptadorCursos = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,cursos
        );

        lista.setAdapter(adaptadorCursos);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonToast){
            Toast.makeText(this, "Matricula Completa", Toast.LENGTH_SHORT).show();
        }
    }

    }