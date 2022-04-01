package br.com.dio.desafio.dominio;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormacaoAcademica {
    private String instituicao;
    private String formacao;
    private String curso;
    private  LocalDate dataInicial;
    private LocalDate dataFinal;

    public FormacaoAcademica(String instituicao, String formacao, String curso, LocalDate dataInicial, LocalDate dataFinal) {
        this.instituicao = instituicao;
        this.formacao = formacao;
        this.curso = curso;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;

    }

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/yyyy");

    public FormacaoAcademica() {

    }

    @Override
    public String toString() {
        return "FormacaoAcademica{" +
                "instituicao='" + instituicao + '\'' +
                ", formacao='" + formacao + '\'' +
                ", curso='" + curso + '\'' +
                ", dataInicial=" + dataInicial.format(dtf) +
                ", dataFinal=" + dataFinal.format(dtf) +
                '}';
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }
}
