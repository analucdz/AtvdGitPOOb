public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String placa, String marca, int ano, int cilindradas) {
        super(placa, marca, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Tipo: Moto");
        System.out.println("----------------------");
    }

}
