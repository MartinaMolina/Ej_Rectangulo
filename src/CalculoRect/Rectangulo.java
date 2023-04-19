
package CalculoRect;

import java.util.Scanner;

public class Rectangulo {
   
    // ATRIBUTOS
    
    private double base, altura, sup, per;

    // CONSTRUCTOR
    
    public Rectangulo() {
    }

    // SETTERS & GETTERS
    
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    // METODOS
    
    public void crearRectangulo () {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        System.out.println("Bienvenido/a, por favor ingrese la base y la altura para crear el rectangulo: ");
        System.out.println("Base: ");
        setBase(leer.nextDouble());
        System.out.println("Altura: ");
        setAltura(leer.nextDouble());
    }
    
    public void superficieRectangulo () {
        sup = base * altura;
        System.out.println("La superficie del rectangulo es de " + sup);
    }
    
    public void perimetroRectangulo () {
        per = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es de " + per);
    }
    
    public void construccionRectangulo () {
        
        System.out.println("");
        
        // Linea superior
        for(int columna = 1; columna <= base; columna++) {
            System.out.print(" * ");
        }
        System.out.println("");
           
        // Centro de la forma
        for(int fila = 2; fila < altura; fila++) {
            System.out.print(" * ");
        for(int columna = 2; columna < base; columna++) {
            System.out.print("   ");
        }
            System.out.println(" * ");
        }
           
        // Linea inferior
        for(int columna = 1; columna <= base; columna++) {
            System.out.print(" * ");
        }
        
        System.out.println("");
    }
}
