// Professor.java
public class Professor extends Pessoa {
    private String siape;
    private String disciplina;

    public Professor(String nome, String cpf, String endereco, String siape, String disciplina) {
        super(nome, cpf, endereco);
        this.siape = siape;
        this.disciplina = disciplina;
    }

    public String getSiape() {
        return siape;
    }

    public String getDisciplina() {
        return disciplina;
    }

    // Setters específicos de Professor
    public void setSiape(String siape) {
        this.siape = siape;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("SIAPE: " + siape);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("--------------------");
    }
}