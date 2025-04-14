package model;

import javax.swing.JOptionPane;

public class Circulo extends FiguraGeometrica {

    private Double raio;

    public Circulo() {
    }

    public Circulo(String cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
    @Override
    public void leitura(){
        super.leitura();
        setRaio(Double.valueOf(JOptionPane.showInputDialog("Informe o raio: ")));
        
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null,"O raio é: " + getRaio());
    }

    @Override
    public String toString() {
        return  (super.toString() + "/ Raio : " + getRaio());
    }
    
   
    public double getArea() {
return (Math.PI * getRaio() * getRaio());
}


}
