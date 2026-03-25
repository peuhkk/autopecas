package entities;

public class Pecas {

    private int IdPeca;
    private String nomePeca;
    private String descricao;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

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
        return "Nome da peça: "
                + getNome()
                + " Descrição: "
                + descricao;
    }


}
