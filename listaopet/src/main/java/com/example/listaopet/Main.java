package com.example.listaopet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {

    private List<Disciplina> disciplinas;
    private ListView listDisciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_lista);

        listDisciplinas = findViewById(R.id.listDisciplinas);
    }

    @Override
    protected void onStart(){
        super.onStart();
        disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplina("Algoritmos",8.5));
        disciplinas.add(new Disciplina("Banco De Dados",9.5));
        disciplinas.add(new Disciplina("Redes",3.5));

        ArrayAdapter adapter = new DisciplinaAdapter(getApplicationContext(), R.layout.lista_item,disciplinas);
        listDisciplinas.setAdapter(adapter);
    }
}
