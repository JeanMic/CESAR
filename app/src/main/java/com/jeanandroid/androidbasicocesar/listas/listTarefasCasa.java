package com.jeanandroid.androidbasicocesar.listas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.jeanandroid.androidbasicocesar.R;
import com.jeanandroid.androidbasicocesar.tarefas.TarefasCasa;
import com.jeanandroid.androidbasicocesar.adapters.adapterTarefaCasa;

import java.util.Arrays;
import java.util.List;

public class listTarefasCasa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tarefas_casa);

        // recuperando a lista
        List<TarefasCasa> tarefas = Arrays.asList(TarefasCasa.tarefas);

        ListView lista = (ListView) findViewById(R.id.lista);
        adapterTarefaCasa adapter = new adapterTarefaCasa(tarefas, this);

        lista.setAdapter(adapter);
    }

//    @Override
//    public void onListItemClick(ListView listView,
//                                View itemView,
//                                int position,
//                                long id) {
//        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
//        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
//        startActivity(intent);
//    }
}
