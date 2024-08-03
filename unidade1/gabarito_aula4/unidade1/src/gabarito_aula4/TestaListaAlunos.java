package unidade1.src.gabarito_aula4;

import java.util.LinkedList;

public class TesteListaAlunos {

    public static void main(String[] args){
        LinkedList<Aluno> osQueridos = new LinkedList<Aluno>();
    
        for (int i = 1; i < 89765; i++){
            Aluno aluno = new Aluno();
            aluno.setNota1(5);
            osAlunos.add(aluno);
            System.out.println("Aluno" + i + ":" + aluno);

        }
    }

}
