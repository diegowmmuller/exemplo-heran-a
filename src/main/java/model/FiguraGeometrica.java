package model;

import javax.swing.JOptionPane;

public abstract class FiguraGeometrica {

    private String cor;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void leitura() {
        setCor(JOptionPane.showInputDialog("Digite a cor: "));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "A cor é " + getCor());
    }

    @Override
    public String toString() {
        return "Cor: " + getCor();
    }

}
