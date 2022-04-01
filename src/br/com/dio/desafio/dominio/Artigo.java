package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Artigo {
    private String titulo;
    private String conteudo;
    private final LocalDate dataInicial = LocalDate.now();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    @Override
    public String toString() {
        return "Artigo{" +
                "titulo='" + titulo + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", dataInicial=" + dataInicial +
                '}';
    }
}
