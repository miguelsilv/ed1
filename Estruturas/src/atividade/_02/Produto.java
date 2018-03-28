/*
Crie uma classe Produto para armazenar as informações de um produto
comercializado pela empresa Atacadão Caju. A classe deverá ser conter os
seguintes campos:
 Código do produto
 Nome do produto
 Quantidade em estoque
 Custo unitário
 Uma lista encadeada para armazenar todas as compras feitas, onde cada
elemento dessa lista deverá ser do seguinte tipo Compra, onde uma
compra possui uma data de compra, quantidade comprada do produto e
valor da compra
 Uma lista para armazenar todas as vendas, onde cada elemento dessa
lista deverá ser do seguinte tipo Venda, onde cada venda possui a data da
venda, a quantidade vendida, o valor da venda e o custo unitário
 */
package atividade._02;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class Produto {

    private int codigo;
    private String produto;
    private int qntEstoque;
    private double valor;

    public Produto(int codigo, String produto, int qntEstoque, double valor) {
        this.codigo = codigo;
        this.produto = produto;
        this.qntEstoque = qntEstoque;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getProduto() {
        return produto;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public double getValor() {
        return valor;
    }
    
    

}
