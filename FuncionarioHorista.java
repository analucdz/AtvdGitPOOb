package sistemaPagamento;

// FuncionarioHorista.java
public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, double horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }
}