package atividade.apagao;

import estruturas.encadeada.MySimpleLinked;
import java.util.Scanner;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class Main {

    public static Turma getTurma(int codigo, MySimpleLinked<Turma> turmas) {
        for (Turma turma : turmas) {
            if (codigo == turma.getCodigoTurma()) {
                return turma;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        MySimpleLinked<Turma> listaTurma = new MySimpleLinked<>();
        MySimpleLinked<Aluno> listaAlunos = new MySimpleLinked<>();

        int op = 3;

        switch (op) {
            case 1://cadastrar turma
                System.out.println("Codigo da Turma:");
                int codigo = ler.nextInt();
                System.out.println("Maximo de Alunos:");
                int maximo = ler.nextInt();
                listaTurma.adicionar(new Turma(codigo, maximo));
                break;
            case 2: //cadastrar alunos
                System.out.println("Nome do Aluno:");
                String nome = ler.next();
                System.out.println("RG do Aluno:");
                String RG = ler.next();
                listaAlunos.adicionar(new Aluno(nome, RG));
                break;
            case 3://matricular alunos
                System.out.println("Codigo da turma:");
                int codigoTurma = ler.nextInt();
                System.out.println("RG do Aluno:");
                String RGAluno = ler.next();
                Turma turmaMatricula = getTurma(codigoTurma, listaTurma);
                if (turmaMatricula != null) {
                    int situacao = turmaMatricula.addAluno(RGAluno, listaAlunos);
                    switch (situacao) {
                        case 0:
                            System.out.println("Aluno não encontrado!");
                            break;
                        case 1:
                            System.out.println("Aluno matriculado!");
                            break;
                        default:
                            System.out.println("Turma está lotada! \nAluno adicionado a lista de espera na " + (situacao - 1000) + "ª posição");
                            break;
                    }
                } else {
                    System.out.println("Turma não encontrada");
                }
//matriculas.adicionar(new Matricula());
                break;
            case 4://cancelar matricula
                System.out.println("Codigo da turma:");
                int codigoTurmaCancelar = ler.nextInt();
                System.out.println("RG do Aluno:");
                String RGAlunoCancelar = ler.next();

                Turma turmaCancelamento = getTurma(codigoTurmaCancelar, listaTurma);
                if (turmaCancelamento != null) {
                    int situacao = turmaCancelamento.remover(RGAlunoCancelar);
                    switch (situacao) {
                        case 0:
                            System.out.println("Aluno não faz parte desta turma!");
                            break;
                        case 1:
                            System.out.println("Matricula cancelada!");
                            break;
                        case 2:
                            System.out.println("Aluno retirado da lista de espera!");
                            break;
                    }
                } else {
                    System.out.println("Turma não encontrada");
                }
                break;
            case 5://cancelar turma
                System.out.println("Codigo da turma:");
                int codigoTurmaCancelamento = ler.nextInt();
                Turma turmaCancelar = getTurma(codigoTurmaCancelamento, listaTurma);
                if (turmaCancelar != null) {
                    listaTurma.remover(turmaCancelar);
                } else {
                    System.out.println("Turma não encontrada");
                }
            case 6://listar aluno
                System.out.println("Codigo da turma:");
                int codigoTurmaListagem = ler.nextInt();
                Turma turmaListagem = getTurma(codigoTurmaListagem, listaTurma);
                if (turmaListagem != null) {
                    if (turmaListagem.getAlunos().tamanho() != 0) {
                        System.out.println("LISTA DE ALUNOS");
                        for (Aluno aluno : turmaListagem.getAlunos()) {
                            System.out.println("-Nome:" + aluno.Nome);
                        }
                    } else {
                        System.out.println("TURMA VAZIA!");
                    }
                } else {
                    System.out.println("Turma não encontrada");
                }
                break;
            case 7://listar turmas
                if (listaTurma.tamanho() != 0) {
                    System.out.println("LISTA DE TURMAS");
                    for (Turma turma : listaTurma) {
                        System.out.println("COD:" + turma.getCodigoTurma() + "\n"
                                + "VAGAS:" + turma.getVagas() + " \n"
                                + "ALUNOS:" + turma.getAlunos().tamanho() + "  \n"
                                + "NA FILA  DE ESPERA:" + turma.getListaEspera().tamanho());
                    }
                }

                break;

        }
    }
}
