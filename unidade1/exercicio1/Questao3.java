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