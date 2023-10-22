package moviecrud.moviecrud.model;

public class Filme {
    private String nome;
    private String ano;
    public Filme(){}

    public String getNome() {
        return nome;
    }

    public Filme(String nome, String ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
