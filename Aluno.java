// Aluno.java
public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    public Aluno(String nome, String cpf, String endereco, String matricula, String curso) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getters específicos de Aluno
    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    // Setters específicos de Aluno
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("--------------------");
    }
}