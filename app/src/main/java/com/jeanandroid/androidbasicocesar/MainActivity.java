package com.jeanandroid.androidbasicocesar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ImgTrab;
    private ImageView ImsCasa;
    private ImageView ImgConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //resgato o ID das views
        resgataIDViews();

        //inicializa a escuta das imagens
        inicializaEsculta();
    }

    private void resgataIDViews() {
        ImgTrab = (ImageView) findViewById(R.id.ImgTrab);
        ImsCasa = (ImageView) findViewById(R.id.ImgCasa);
        ImgConfig = (ImageView) findViewById(R.id.ImgConfig);
    }

    private void inicializaEsculta() {
        ImgTrab.setOnClickListener(this);
        ImsCasa.setOnClickListener(this);
        ImgConfig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.ImgTrab:
                Intent intentTrabalho = new Intent(this, listTarefasTrabalho.class);
                startActivity(intentTrabalho);
                break;
            case R.id.ImgCasa:
                Intent intentcasa = new Intent(this, listTarefasCasa.class);
                startActivity(intentcasa);
                break;
            case R.id.ImgConfig:
//                Intent CategoriasPesquisaProdutos = new Intent(getApplicationContext(), telaPesquisaCategoriasProduto.class);
//                startActivity(CategoriasPesquisaProdutos);
                break;
        }
    }

}
