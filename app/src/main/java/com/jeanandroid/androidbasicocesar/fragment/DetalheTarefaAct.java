package com.jeanandroid.androidbasicocesar.fragment;

import android.app.Activity;
import android.os.Bundle;

import com.jeanandroid.androidbasicocesar.R;

public class DetalheTarefaAct extends Activity {

    public static final String EXTRA_ID_TAREFA = "id";
    public static final String EXTRA_TIPO_TAREFA = "tarefa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_tarefa);

        DetalheTarefaFragment detalhe = (DetalheTarefaFragment) getFragmentManager().findFragmentById(R.id.detalhe_tarefa);
        detalhe.setPosicao((int) getIntent().getExtras().get(EXTRA_ID_TAREFA));
        detalhe.settipoTarefa(getIntent().getExtras().getString(EXTRA_TIPO_TAREFA));

    }
}
