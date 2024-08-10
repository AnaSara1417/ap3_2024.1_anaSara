package unidade1.src.gabarito_aula3;

public class TestaAlunoOO {
    public static void main(String[] args) {
        Aluno sara = new Aluno();

        sara.setNomeDoAluno("Sara");
        sara.setNota1(7);
        sara.setNota2(8);
        sara.setNota3(9);

        if (sara.aprovadoPorMedia()) {
            System.out.println("Aprovado por média!");
        } else {
            System.out.println("Reprovou!");
        }
    }

}
