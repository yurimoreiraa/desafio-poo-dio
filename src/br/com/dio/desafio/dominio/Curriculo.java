package br.com.dio.desafio.dominio;

public class Curriculo {

    private String nomeCompleto;
    private String contato;
    private String email;
    private double pretencaoSalarial;

    public Curriculo(String nomeCompleto, String contato, String email, double pretencaoSalarial) {
        this.nomeCompleto = nomeCompleto;
        this.contato = contato;
        this.email = email;
        this.pretencaoSalarial = pretencaoSalarial;
    }

    public Curriculo() {

    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", contato='" + contato + '\'' +
                ", email='" + email + '\'' +
                ", pretencaoSalarial=" + pretencaoSalarial +
                '}';
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPretencaoSalarial() {
        return pretencaoSalarial;
    }

    public void setPretencaoSalarial(double pretencaoSalarial) {
        this.pretencaoSalarial = pretencaoSalarial;
    }
}
