package com.jeanandroid.androidbasicocesar.listas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jeanandroid.androidbasicocesar.R;
import com.jeanandroid.androidbasicocesar.adapters.adapterTarefa;
import com.jeanandroid.androidbasicocesar.fragment.DetalheTarefaAct;
import com.jeanandroid.androidbasicocesar.tarefas.TarefaTrabalho;

import java.util.Arrays;
import java.util.List;

public class listTarefasTrabalho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listatarefastrabalho);

        // recuperando a lista
        List<TarefaTrabalho> tarefas = Arrays.asList(TarefaTrabalho.trabalhos);

        ListView listaDeCursos = (ListView) findViewById(R.id.lista);
        adapterTarefa adapter = new adapterTarefa(tarefas, this);

        listaDeCursos.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                Intent intent = new Intent(listTarefasTrabalho.this, DetalheTarefaAct.class);
                intent.putExtra(DetalheTarefaAct.EXTRA_ID_TAREFA, position);
                intent.putExtra(DetalheTarefaAct.EXTRA_TIPO_TAREFA, "trabalho");
                startActivity(intent);
            }
        };
        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.lista);
        listView.setOnItemClickListener(itemClickListener);
    }

}

