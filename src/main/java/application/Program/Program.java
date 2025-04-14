package application.Program;

import model.Circulo;
import model.Triangulo;

public class Program {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo();
        triangulo.leitura();
        System.out.println("area do triângulo:" + triangulo.getArea());
        Circulo circulo = new Circulo("Branco", 3.0);
        System.out.println(circulo.toString());
        System.out.println("area do círculo:" + circulo.getArea());

    }
}
