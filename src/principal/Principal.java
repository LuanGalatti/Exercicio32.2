package principal;

import model.CarroPasseio;
import model.Veiculo;

public class Principal {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        CarroPasseio carro = new CarroPasseio();
        veiculo.leitura();
        veiculo.imprimir();
        carro.leitura();
        carro.imprimir();
    }

}
