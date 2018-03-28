package atividade._02;

import estruturas.encadeada.MySimpleLinked;
import java.util.Scanner;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class Atividade02 {

    public static void main(String[] args) {
        MySimpleLinked<Carrinho> vendas = new MySimpleLinked<>();
        MySimpleLinked<Produto> produtos = new MySimpleLinked<>();

        Scanner ler = new Scanner(System.in);

        int op = 0;
        String[] opcoesPrincipais = new String[]{"Menu Administrativo", "Menu de venda"};

        do {
            System.out.println("________MENU______");
            for (int i = 0; i < opcoesPrincipais.length; i++) {
                System.out.println(i + 1 + "- " + opcoesPrincipais[i]);
            }
            System.out.println("0- Sair");
            System.out.println("_____________");
            System.out.print("Informe a opção:");
            op = ler.nextInt();
            switch (op) {
                case 1: // menu administrativo
                    do {
                        String[] opcoesAdministrativa = new String[]{"Cadastrar Produto"};
                        System.out.println("________" + opcoesPrincipais[op] + "______");
                        for (int i = 0; i < opcoesAdministrativa.length; i++) {
                            System.out.println(i + 1 + "- " + opcoesAdministrativa[i]);
                        }
                        System.out.println("0- Voltar");
                        System.out.println("_____________");
                        System.out.print("Informe a opção:");
                        op = ler.nextInt();

                        switch (op) {
                            case 1: //Cadastrar produto
                                System.out.println("Codigo:");
                                int codigoProduto = ler.nextInt();
                                System.out.println("Nome:");
                                String nomeProduto = ler.next();
                                System.out.println("Quantidade em estoque:");
                                int qntdEstoque = ler.nextInt();
                                System.out.println("Valor da unidade:");
                                int valorUnitario = ler.nextInt();
                                produtos.adicionar(new Produto(codigoProduto, nomeProduto, qntdEstoque, valorUnitario));
                            case 0://voltar
                                break;
                            default:
                                System.out.println("OPÇÃO NÃO ENCONTRADA");
                        }
                    } while (op != 0);
                    op = 1;
                    break;

                case 2://venda
                    
                    do {
                        String[] opcoesVenda = new String[]{"Adicionar no Carrinho", "Listar produtodos do carrinho", "Vender"};
                        System.out.println("________" + opcoesPrincipais[op] + "______");
                        for (int i = 0; i < opcoesVenda.length; i++) {
                            System.out.println(i + 1 + "- " + opcoesVenda[i]);
                        }
                        System.out.println("0- Voltar");
                        System.out.println("_____________");
                        System.out.print("Informe a opção:");
                        op = ler.nextInt();

                        switch (op) {
                            case 1: //Adicionar no Carrinho

                                break;
                            case 0://voltar
                                break;
                            default:
                                System.out.println("OPÇÃO NÃO ENCONTRADA");
                        }
                    } while (op != 0);
                    op = 2;
                    break;
                case 0:
                    System.out.println("bye bye");
                    break;
                default:
                    System.out.println("OPÇÃO NÃO ENCONTRADA");
            }
        } while (op != 0);

    }
}
