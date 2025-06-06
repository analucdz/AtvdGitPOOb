import java.util.ArrayList;
import java.util.List;

// GerenciamentoPessoas.java
public class Gerenciamento {
    private List<Pessoa> listaDePessoas;

    public Gerenciamento() {
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        this.listaDePessoas.add(pessoa);
        System.out.println(pessoa.getNome() + " adicionado(a) à lista.");
    }

    public void listarTodasPessoas() {
        if (listaDePessoas.isEmpty()) {
            System.out.println("A lista de pessoas está vazia.");
            return;
        }
        System.out.println("\n--- LISTA DE TODAS AS PESSOAS ---");
        for (Pessoa p : listaDePessoas) {
            p.exibirDados();
        }
    }

    public void listarAlunos() {
        System.out.println("\n--- LISTA DE ALUNOS ---");
        boolean encontrouAluno = false;
        for (Pessoa p : listaDePessoas) {
            if (p instanceof Aluno) {
                ((Aluno) p).exibirDados();
                encontrouAluno = true;
            }
        }
        if (!encontrouAluno) {
            System.out.println("Nenhum aluno encontrado na lista.");
        }
    }

    public void listarProfessores() {
        System.out.println("\n--- LISTA DE PROFESSORES ---");
        boolean encontrouProfessor = false;
        for (Pessoa p : listaDePessoas) {
            if (p instanceof Professor) {
                ((Professor) p).exibirDados();
                encontrouProfessor = true;
            }
        }
        if (!encontrouProfessor) {
            System.out.println("Nenhum professor encontrado na lista.");
        }
    }


    public static void main(String[] args) {
        Gerenciamento gerenciador = new Gerenciamento();

        // Cria alguns alunos
        Aluno aluno1 = new Aluno("Lucas Diniz", "012.363.465-87", "Rua Lady Gaga, 12", "2023002", "Engenharia de Software");
        Aluno aluno2 = new Aluno("Maria Eduarda", "547.787.412-78", "Rua Taylor Swift, 89", "20213221", "Ciência da Computação");

        // Cria alguns professores
        Professor prof1 = new Professor("Samara", "777.854.963-97", "Rua Pernambuco, 16", "456132", "POO");
        Professor prof2 = new Professor("Onildo", "654.212.786-30", "Rua Floriano Peixoto, 999", "67890", "Estatistica");

        // Adiciona todos à lista
        gerenciador.adicionarPessoa(aluno1);
        gerenciador.adicionarPessoa(prof1);
        gerenciador.adicionarPessoa(aluno2);
        gerenciador.adicionarPessoa(prof2);

        // Testa os métodos de listagem
        gerenciador.listarTodasPessoas();
        gerenciador.listarAlunos();
        gerenciador.listarProfessores();
    }
}