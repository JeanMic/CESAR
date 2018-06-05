package com.jeanandroid.androidbasicocesar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ImgTrab;
    private ImageView ImsCasa;
    private ImageView ImgConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toast.makeText(this, "teste", Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "teste Kaspersky", Toast.LENGTH_SHORT).show();

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
//                Intent CategoriasProdutos = new Intent(getApplicationContext(), telaProdutoServico.class);
//                startActivity(CategoriasProdutos);
                break;
            case R.id.ImgCasa:
//                Intent CategoriasPesquisaProdutos = new Intent(getApplicationContext(), telaPesquisaCategoriasProduto.class);
//                startActivity(CategoriasPesquisaProdutos);
                break;
            case R.id.ImgConfig:
//                Intent CategoriasPesquisaProdutos = new Intent(getApplicationContext(), telaPesquisaCategoriasProduto.class);
//                startActivity(CategoriasPesquisaProdutos);
                break;
        }
    }

}
