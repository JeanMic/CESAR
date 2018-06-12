package com.jeanandroid.androidbasicocesar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapterTarefa extends BaseAdapter {

    private final List<TarefaTrabalho> tarefas;
    private final Activity acttivity;

    public adapterTarefa(List<TarefaTrabalho> tarefas, Activity act) {
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
        TarefaTrabalho tarefas = this.tarefas.get(position);

        ((ImageView) view.findViewById(R.id.imagem_lista)).setImageResource(tarefas.getImagemId());
        ((TextView) view.findViewById(R.id.titulo_lista)).setText(tarefas.getNome());
        return view;
    }
}
