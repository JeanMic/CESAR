package com.jeanandroid.androidbasicocesar.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jeanandroid.androidbasicocesar.R;

public class DetalheTarefaAct extends AppCompatActivity {

    public static final String EXTRA_ID_TAREFA = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_tarefa);

        DetalheTarefaFragment detalhe = (Fragment) getFragmentManager().findFragmentById(R.id.detalhe_tarefa);
        int IdTarefa = (int) getIntent().getExtras().get(EXTRA_ID_TAREFA);
        detalhe.setIdTarefa(IdTarefa);
    }
}
