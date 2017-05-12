package br.com.vadiando.vadiandoapp.models;

/**
 * Created by Icons4u TI on 08/05/2017.
 */

public class Rodas {

    private int imagem;
    private int favorito;
    private String km;
    private String responsavel;
    private String endereco;
    private String dataHora;
    private int confirmar;
    private int visualizar;

    public Rodas( String km, String responsavel, String endereco, String dataHora, int imagem,int favorito,int confirmar,int visualizar ){

        this.km = km;
        this.responsavel = responsavel;
        this.endereco = endereco;
        this.dataHora = dataHora;
        this.imagem = imagem;
        this.favorito = favorito;
        this.confirmar = confirmar;
        this.visualizar = visualizar;

    }

    public int getConfirmar() { return confirmar;  }

    public void setConfirmar(int confirmar) { this.confirmar = confirmar;  }

    public int getVisualizar() { return visualizar;  }

    public void setVisualizar(int visualizar) { this.visualizar = visualizar;  }

    public int getImagem() { return imagem; }

    public void setImagem(int imagem) { this.imagem = imagem;}

    public int getFavorito() { return favorito;  }

    public void setFavorito(int favorito) { this.favorito = favorito; }

    public String getKm() { return km; }

    public void setKm(String km) { this.km = km; }

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
