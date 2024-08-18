package unidade1.src.gabarito_aula5;

import java.util.Scanner;

import unidade1.src.gabarito_aula4.Aluno;

public class TestaAlunoScanner {

    public static void main(String[]args) {
        Aluno umAluno = new Aluno();
        Scanner teclado = new Scanner(System.in);
        System.out.println();

        System.out.println("Digite o nome do aluno:");
        String nomeDoAluno = teclado.nextLine();
        System.out.println("Digite a nota 1:");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = teclado.nextDouble();
        System.out.println("Digite a nota 3:");
        double nota3 = teclado.nextDouble();
        System.out.println("Digite o nome da mãe:");
        String nomeDaMae = teclado.next();

        DateTimeFormater padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Digite a data de nascimento(formato dd/MM/yyyy):");
        String dataNascimentoString = teclado.next();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString,  )





        umAluno.setNome(nomeDoAluno);
        umAluno.setNota1(nota1);
        umAluno.setNota2(nota2);
        umAluno.setNota3(nota3);
        umAluno.setNomeDaMae(nomeDaMae);

        System.out.println(umAluno);
        teclado.close();
    }

}
