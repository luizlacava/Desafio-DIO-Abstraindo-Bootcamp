package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //      estatico constante tipo
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    //não consegue instanciar o conteudo - abstract - para implementar os atributos e o metodo nas classes filhas - herança
    public abstract double calcularXp();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
