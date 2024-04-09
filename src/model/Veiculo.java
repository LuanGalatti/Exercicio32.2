package model;

import javax.swing.JOptionPane;

public class Veiculo {

    private int peso;
    private int velocMax;
    private double preco;

    public Veiculo() {
        this(0, 0, 0);
    }

    public Veiculo(int peso, int velocMax, double preco) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void leitura() {
        setPeso(Integer.parseInt(JOptionPane.showInputDialog("qual o peso do veiculo")));
        setVelocMax(Integer.parseInt(JOptionPane.showInputDialog("qual a velocidade maxima do veiculo")));
        setPreco(Double.parseDouble(JOptionPane.showInputDialog("qual o preco do veiculo")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, getPeso());
        JOptionPane.showMessageDialog(null, getVelocMax());
        JOptionPane.showMessageDialog(null, getPreco());
    }
}
