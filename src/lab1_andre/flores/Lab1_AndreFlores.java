package lab1_andre.flores;

import java.util.Scanner;

public class Lab1_AndreFlores {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("-- Bienvenido al sistema de calculo de promedio --");
        System.out.print("Ingrese su nombre: ");//se ingresa el nombre del usuario
        String nombre = entrada.nextLine();
        
        // aqui se ingresan las notas de 4 clases.
        System.out.print("ingrese la nota final de su primera clase: ");
        double primeraClase = entrada.nextDouble();
        
        System.out.print("ingrese la nota final de su segunda clase: ");
        double segundaClase = entrada.nextDouble();
        
        System.out.print("ingrese la nota final de su tercera clase: ");
        double terceraClase = entrada.nextDouble();
        
        System.out.print("ingrese la nota final de su cuarta clase: ");
        double cuartaClase = entrada.nextDouble();
        
        // calculamos el promedio
        
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaClase / 4;
        
        //se imprime el promedio
        System.out.println("----" + nombre + " el promedio total de sus cuatro clases es: " + promedio);
    }
    
}
