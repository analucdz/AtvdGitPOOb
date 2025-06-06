import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Veiculo> sistemaTransporte = new ArrayList<>();

        sistemaTransporte.add(new Carro("MNX-1234", "Jepe", 2024, 4));
        sistemaTransporte.add(new Moto("XYZ-9546", "Harley-Davidson", 2022, 300));
        sistemaTransporte.add(new Carro("DEF-5678", "Chevrolet", 2020, 2));
        sistemaTransporte.add(new Moto("MNO-5432", "Yamaha", 2018, 500));

        exibirTodosDetalhes(sistemaTransporte);
    }

    public static void exibirTodosDetalhes(ArrayList<Veiculo> veiculos) {

        System.out.println("==='== DETALHES DA FROTA =====");

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
        }
    }

}
