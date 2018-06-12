package com.jeanandroid.androidbasicocesar.adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jeanandroid.androidbasicocesar.R;
import com.jeanandroid.androidbasicocesar.tarefas.TarefasCasa;

import java.util.List;

public class adapterTarefaCasa extends BaseAdapter {

    private final List<TarefasCasa> tarefas;
    private final Activity acttivity;

    public adapterTarefaCasa(List<TarefasCasa> tarefas, Activity act) {
        this.tarefas = tarefas;
        this.acttivity = act;
    }

    @Override
    public int getCount() {
        return tarefas.size();
    }

    @Override
    public Object getItem(int position) {
        return tarefas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = acttivity.getLayoutInflater()
                .inflate(R.layout.adapterlayout, parent, false);
        TarefasCasa tarefas = this.tarefas.get(position);

        ((ImageView) view.findViewById(R.id.imagem_lista)).setImageResource(tarefas.getImagemId());
        ((TextView) view.findViewById(R.id.titulo_lista)).setText(tarefas.getNome());
        return view;
    }
}
