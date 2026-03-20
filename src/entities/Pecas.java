package entities;

public class Pecas {

    private int IdPeca;
    private String nomePeca;
    public String descricao;

    public void setID(int ID) {
        this.IdPeca = ID;
    }

    public int getID() {
        return IdPeca;
    }

    public void setNome(String nome) {
        this.nomePeca = nome;
    }

    public String getNome() {
        return nomePeca;
    }

    public String toString() {
        return " Nome da peça: "
                + getNome()
                + " Descrição: "
                + descricao;
    }


}
