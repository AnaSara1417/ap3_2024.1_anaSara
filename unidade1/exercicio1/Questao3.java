/**
 * Codigo Secreto = 1961762906
 * Explicação do código
 * O código solicita ao usuário a quantidade desejada de latão e calcula e exibe a quantidade de cobre e zinco necessárias para obter essa quantidade de latão, assumindo que o latão é composto por 70% de cobre e 30% de zinco. 
 *
 * @author Ana Sara 
 * @since 13/08/2024
 *
 */ 

 import java.util.Scanner;
 public class Questao3 {
 
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
 
         System.out.print("Informe quantidade de latão que você precisa (em quilos): ");
         double totalLatao = teclado.nextDouble();
 
         double quantidadeCobre = totalLatao * 0.70;
         double quantidadeZinco = totalLatao * 0.30;
 
         System.out.println("Para obter " + totalLatao + " quilos de Latão, você vai precisar de:");
         System.out.println(quantidadeCobre + " kg de Cobre");
         System.out.println(quantidadeZinco + " kg de Zinco");
 
    }
}