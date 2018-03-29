package atividade.apagao;

import estruturas.encadeada.MySimpleLinked;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class Turma {

    private int codigoTurma;
    private int maxAlunos;
    private MySimpleLinked<Aluno> alunos;
    private MySimpleLinked<Aluno> listaEspera;

    public Turma(int codigoTurma, int maxAlunos) {
        this.codigoTurma = codigoTurma;
        this.maxAlunos = maxAlunos;
        this.alunos = new MySimpleLinked<>();
        this.listaEspera = new MySimpleLinked<>();
    }

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public int getMaxAlunos() {
        return maxAlunos;
    }

    public int getVagas() {
        return this.maxAlunos - this.alunos.tamanho();
    }

    public MySimpleLinked<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(MySimpleLinked<Aluno> alunos) {
        this.alunos = alunos;
    }

    public MySimpleLinked<Aluno> getListaEspera() {
        return listaEspera;
    }

    public void setListaEspera(MySimpleLinked<Aluno> listaEspera) {
        this.listaEspera = listaEspera;
    }

    public int addAluno(String rgAluno, MySimpleLinked<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            if (aluno.getRG().equals(rgAluno)) {
                if (alunos.tamanho() != this.getMaxAlunos()) {
                    this.listaEspera.adicionar(aluno);
                    return 1000 + this.listaEspera.tamanho();//lista espera
                } else {
                    this.alunos.adicionar(aluno);
                    return 1; // Cadastrado
                }
            }
        }
        return 0;//aluno não encontrado
    }

    public int remover(String rgAluno) {
        for (Aluno aluno : this.alunos) {
            if (aluno.getRG().equals(rgAluno)) {
                this.alunos.remover(aluno);
                return 1;
            }
        }
        for (Aluno aluno : this.listaEspera) {
            if (aluno.getRG().equals(rgAluno)) {
                this.listaEspera.remover(aluno);
                return 2;
            }
        }
        return 0;
    }

}
