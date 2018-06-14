package com.jeanandroid.androidbasicocesar.listas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jeanandroid.androidbasicocesar.R;
import com.jeanandroid.androidbasicocesar.adapters.adapterTarefaCasa;
import com.jeanandroid.androidbasicocesar.fragment.DetalheTarefaAct;
import com.jeanandroid.androidbasicocesar.tarefas.TarefasCasa;

import java.util.Arrays;
import java.util.List;

public class listTarefasCasa extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tarefas_casa);

        // recuperando a lista
        List<TarefasCasa> tarefas = Arrays.asList(TarefasCasa.tarefas);

        ListView lista = (ListView) findViewById(R.id.lista);
        adapterTarefaCasa adapter = new adapterTarefaCasa(tarefas, this);

        lista.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                    Intent intent = new Intent(listTarefasCasa.this, DetalheTarefaAct.class);
                    intent.putExtra(DetalheTarefaAct.EXTRA_ID_TAREFA, position);
                    intent.putExtra(DetalheTarefaAct.EXTRA_TIPO_TAREFA, "casa");
                    startActivity(intent);
            }
        };
        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.lista);
        listView.setOnItemClickListener(itemClickListener);
    }

}
