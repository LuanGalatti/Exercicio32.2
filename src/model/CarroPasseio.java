package model;

import javax.swing.JOptionPane;

public class CarroPasseio extends Veiculo {

    private String cor;
    private String modelo;

    public CarroPasseio() {
        this("", "", 0, 0, 0);
    }

    public CarroPasseio(String cor, String modelo, int peso, int velocMax, double preco) {
        super(peso, velocMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void leitura() {
        super.leitura();
        setCor(JOptionPane.showInputDialog("qual a cor do veiculo de passeio"));
        setModelo(JOptionPane.showInputDialog("qual o modelo do veiculo de passeio"));
    }

    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, getCor());
        JOptionPane.showMessageDialog(null, getModelo());
    }
}
