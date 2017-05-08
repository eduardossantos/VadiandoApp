package br.com.vadiando.vadiandoapp.models;

/**
 * Created by Icons4u TI on 08/05/2017.
 */

public class Rodas {

    private int foto;
    private String distancia;
    private String responsavel;
    private String endereco;
    private String dataHora;

    public Rodas(int foto, String distancia, String responsavel, String endereco, String dataHora){

        this.foto = foto;
        this.distancia = distancia;
        this.responsavel = responsavel;
        this.endereco = endereco;
        this.dataHora = dataHora;

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}
