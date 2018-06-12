package com.jeanandroid.androidbasicocesar.tarefas;

import com.jeanandroid.androidbasicocesar.R;

public class TarefasCasa {

    private String nome;
    private String descricao;
    private int imagemId;

    public static final TarefasCasa[] tarefas = {
            new TarefasCasa("Arrumar o Quarto", "Varrer o chão, limpar a mesa e organizar livros", R.drawable.quarto),
            new TarefasCasa("Fazer Comida", "Fazer a comida e congelar o que sobrar", R.drawable.comida),
            new TarefasCasa("Lavar a Roupa", "Lavar todas as roupas sujas", R.drawable.roupa)
    };

    private TarefasCasa(String nome, String descricao, int imagemId) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagemId = imagemId;
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
}
