package com.jeanandroid.androidbasicocesar.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jeanandroid.androidbasicocesar.R;
import com.jeanandroid.androidbasicocesar.tarefas.TarefaTrabalho;
import com.jeanandroid.androidbasicocesar.tarefas.TarefasCasa;

public class DetalheTarefaFragment extends android.app.Fragment {
    private int Posicao;
    private String tipoTarefa = "casa";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detalhe_tarefa, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            if (tipoTarefa.equals("casa")) {
                ((TextView) view.findViewById(R.id.titulo_detalhe)).setText(TarefasCasa.tarefas[Posicao].getNome());
                ((TextView) view.findViewById(R.id.descricao_detalhe)).setText(TarefasCasa.tarefas[Posicao].getDescricao());
                ((ImageView) view.findViewById(R.id.imagem_grande)).setImageResource(TarefasCasa.tarefas[Posicao].getImagemIdGrande());
            } else {
                ((TextView) view.findViewById(R.id.titulo_detalhe)).setText(TarefaTrabalho.trabalhos[Posicao].getNome());
                ((TextView) view.findViewById(R.id.descricao_detalhe)).setText(TarefaTrabalho.trabalhos[Posicao].getDescricao());
                ((ImageView) view.findViewById(R.id.imagem_grande)).setImageResource(TarefaTrabalho.trabalhos[Posicao].getimagemIdGrande());
            }

        }
    }

    public void setPosicao(int id) {
        this.Posicao = id;
    }

    public void settipoTarefa(String id) {
        this.tipoTarefa = id;
    }
}
