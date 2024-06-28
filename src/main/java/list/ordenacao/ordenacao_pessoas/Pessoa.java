package list.ordenacao.ordenacao_pessoas;

public class Pessoa implements Comparable<Pessoa> { // para ordenar, precisamos implementar a interface na classe
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override // utilizamos o método compareTo do comparable
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
}
