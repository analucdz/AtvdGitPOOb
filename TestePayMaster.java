package sistemaPagamento;

import java.util.Scanner;

public class TestePayMaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados para o funcionário horista
        System.out.println("--- Cadastro Funcionário Horista ---");
        System.out.print("Nome: ");
        String nomeHorista = scanner.nextLine();

        System.out.print("Horas trabalhadas: ");
        double horas = scanner.nextDouble();

        System.out.print("Valor por hora: R$ ");
        double valorHora = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer

        // Entrada de dados para o funcionário mensalista
        System.out.println("\n--- Cadastro Funcionário Mensalista ---");
        System.out.print("Nome: ");
        String nomeMensalista = scanner.nextLine();

        System.out.print("Salário mensal: R$ ");
        double salario = scanner.nextDouble();

        // Criar funcionários com os dados informados
        Funcionario horista = new FuncionarioHorista(nomeHorista, horas, valorHora);
        Funcionario mensalista = new FuncionarioMensalista(nomeMensalista, salario);

        // Exibir pagamentos
        System.out.println("\n--- PAGAMENTOS ---");
        horista.mostrarPagamento();
        mensalista.mostrarPagamento();

        scanner.close();
    }
}