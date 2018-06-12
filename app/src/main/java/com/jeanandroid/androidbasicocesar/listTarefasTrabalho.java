package com.jeanandroid.androidbasicocesar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

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

