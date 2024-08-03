package unidade1.src.gabarito_aula3;

public class Aluno {
    String nomeDoAluno;
    Integer nota1;
    Integer nota2;
    Integer nota3;

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public Integer getNota1() {
        return nota1;
    }

    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }

    public Integer getNota2() {
        return nota2;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }

    public Integer getNota3() {
        return nota3;
    }

    public void setNota3(Integer nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean aprovadoPorMedia() {
        if (getMedia() >= 7)
            return true;

        return false;
    }

    @Override
    public String toString() {
        return "Aluno [nomeDoAluno=" + nomeDoAluno + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + "]";
    }

}
