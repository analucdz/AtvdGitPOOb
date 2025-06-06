package sistemaPagamento;

public abstract class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularPagamento();

    public void mostrarPagamento() {
        System.out.printf("%s: R$ %.2f%n", nome, calcularPagamento());
    }
}
