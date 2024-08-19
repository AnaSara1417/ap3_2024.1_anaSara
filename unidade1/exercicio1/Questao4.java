/**
 * Codigo Secreto = 1961762906
 * Explicação do código
 * O código cria três instâncias da classe Contato com informações sobre pintores e exibe essas informações usando o método toString().
 *
 * @author Ana Sara 
 * @since 18/08/2024
 *
 */ 

public class Questao4 {
        public static void main(String[] args) {
            Contato pintor1 = new Contato("Donatello", "1234-5678");
            Contato pintor2 = new Contato("Rafael Sanzio", "2345-6789");
            Contato pintor3 = new Contato("Sandro Botticelli", "3456-7890");
    
            System.out.println(pintor1.toString());
            System.out.println(pintor2.toString());
            System.out.println(pintor3.toString());
        }
    }
