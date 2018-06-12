package com.jeanandroid.androidbasicocesar;

public class TarefaTrabalho {

    private String nome;
    private String descricao;
    private int imagemId;

    public static final TarefaTrabalho[] trabalhos = {
            new TarefaTrabalho("Enviar Email", "Responder emails atrasados", R.drawable.email),
            new TarefaTrabalho("Corrigir bugs", "Corrigir bugs relatados pelo cliente", R.drawable.bug),
            new TarefaTrabalho("Reunião", "Realizar reunião de passagem de bola", R.drawable.reuniao)
    };

    private TarefaTrabalho(String nome, String descricao, int imagemId) {
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
