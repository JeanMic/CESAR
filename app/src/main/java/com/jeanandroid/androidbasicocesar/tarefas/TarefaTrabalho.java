package com.jeanandroid.androidbasicocesar.tarefas;

import com.jeanandroid.androidbasicocesar.R;

public class TarefaTrabalho {

    private String nome;
    private String descricao;
    private int imagemId;
    private int imagemIdGrande;

    public static final TarefaTrabalho[] trabalhos = {
            new TarefaTrabalho("Enviar Email", "Responder emails atrasados", R.drawable.email, R.drawable.emailgrande),
            new TarefaTrabalho("Corrigir bugs", "Corrigir bugs relatados pelo cliente", R.drawable.bug, R.drawable.buggrande),
            new TarefaTrabalho("Reunião", "Realizar reunião de passagem de bola", R.drawable.reuniao, R.drawable.reuniaogrande)
    };

    private TarefaTrabalho(String nome, String descricao, int imagemId, int imagemIdGrande) {
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
    public int getimagemIdGrande() {
        return imagemIdGrande;
    }
}
