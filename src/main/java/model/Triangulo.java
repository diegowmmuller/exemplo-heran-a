package model;

import javax.swing.JOptionPane;

public class Triangulo extends FiguraGeometrica {

    private Double base;
    private Double altura;

    public Triangulo() {
    }

    public Triangulo(String cor, Double base, Double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public void leitura(){
        super.leitura();
        setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base: ")));
        setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: ")));
    }

    @Override
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null, "A base é: " + getBase());
        JOptionPane.showMessageDialog(null, "A Altura é: " + getAltura());
    }

    @Override
    public String toString() {
        return super.toString() + "| Base: " + getBase() + ", Altura: " + getAltura();
    }
    
    public double getArea(){
        return ((getBase() * getAltura())/2.0);
    }
    
    
    
}
