package atividade.apagao;

import estruturas.encadeada.MySimpleLinked;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class Matricula {

    private Turma turma;
    private MySimpleLinked<Aluno> alunos;

    public Matricula(Turma turma) {
        this.turma = turma;
        this.alunos = new MySimpleLinked<>();
    }

    public Turma getTurma() {
        return turma;
    }

    public MySimpleLinked<Aluno> getAlunos() {
        return alunos;
    }

}
