package br.com.ap3.distancia;


/**
 * Codigo Secreto = 1961762906
 * Explicação do código
 * O que a classe faz 
 *
 * @author Ana Sara 
 * @since 13/08/2024
 *
 */ 
import java.util.Scanner;

public class Questao1 {

  public static double getDistancia() {
    Scanner teclado = new Scanner(System.in);

    double x1, y1, x2, y2, distancia;

    System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
    x1 = teclado.nextDouble();
    y1 = teclado.nextDouble();
    x2 = teclado.nextDouble();
    y2 = teclado.nextDouble();

    distancia = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

    System.out.println("A distância é: " + distancia);
    return distancia;
  }

 

  public static double getAmplitude() {
    Scanner teclado = new Scanner(System.in);
     
    double val1, val2, val3, amplitude;
    
    System.out.println("Adicione os valores para calcular a amplitude:");
    val1 = teclado.nextDouble();
    val2 = teclado.nextDouble();
    val3 = teclado.nextDouble();

    amplitude = Math.max(val1, Math.max(val2, val3)) - Math.min(val1, Math.min(val2, val3));

    return amplitude;
  }

  public static void main(String[] args) {
    System.out.println(getDistancia());
    System.out.println(getAmplitude());
  }
}
