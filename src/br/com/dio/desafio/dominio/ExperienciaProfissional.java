package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExperienciaProfissional {
    private String empresa;
    private String cargo;
    private String descricao;
    private boolean empregoAtual = false;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/yyyy");

    public ExperienciaProfissional() {

    }

    @Override
    public String toString() {
        String complemento = "";
        if (dataFinal != null) {
            complemento = ", dataFinal=" + dataFinal.format(dtf);
        } else complemento = ", Emprego atual";
        return "ExperienciaProfissional{" +
                "empresa='" + empresa + '\'' +
                ", cargo='" + cargo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicial=" + dataInicial.format(dtf) +
                complemento +
                '}';
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public ExperienciaProfissional(String empresa, String cargo, String descricao, LocalDate dataInicial, LocalDate dataFinal) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.descricao = descricao;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }

    public ExperienciaProfissional(String empresa, String cargo, String descricao, LocalDate dataInicial) {
        this(empresa, cargo, descricao, dataInicial, null);
        empregoAtual = true;
    }
}
