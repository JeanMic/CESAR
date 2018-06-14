package com.jeanandroid.androidbasicocesar.tarefas;

import com.jeanandroid.androidbasicocesar.R;

public class TarefasCasa {

    private String nome;
    private String descricao;
    private int imagemId;
    private int imagemIdGrande;

    public static final TarefasCasa[] tarefas = {
            new TarefasCasa("Arrumar o Quarto", "Varrer o chão, limpar a mesa e organizar livros", R.drawable.quarto, R.drawable.quartogrande),
            new TarefasCasa("Fazer Comida", "Fazer a comida e congelar o que sobrar", R.drawable.comida, R.drawable.comidagrande),
            new TarefasCasa("Lavar a Roupa", "Lavar todas as roupas sujas", R.drawable.roupa, R.drawable.roupagrande)
    };

    private TarefasCasa(String nome, String descricao, int imagemId, int imagemIdGrande) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagemId = imagemId;
        this.imagemIdGrande = imagemIdGrande;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return this.nome;
    }

    public int getImagemId() {
        return imagemId;
    }

    public int getImagemIdGrande() {
        return imagemIdGrande;
    }
}
