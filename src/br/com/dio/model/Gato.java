package br.com.dio.model;

public class Gato {

    private String nome;
    private String cor;
    private String idade;

    public Gato() {
    }

    public Gato(java.lang.String nome, java.lang.String cor, java.lang.String idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.String getCor() {
        return cor;
    }

    public void setCor(java.lang.String cor) {
        this.cor = cor;
    }

    public java.lang.String getIdade() {
        return idade;
    }

    public void setIdade(java.lang.String idade) {
        this.idade = idade;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Gato gato = (Gato) object;
        return java.util.Objects.equals(nome, gato.nome) && java.util.Objects.equals(cor, gato.cor) && java.util.Objects.equals(idade, gato.idade);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), nome, cor, idade);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Gato{" +
                "nome=" + nome +
                ", cor=" + cor +
                ", idade=" + idade +
                '}';
    }
}
