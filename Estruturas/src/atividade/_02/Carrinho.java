package atividade._02;

import estruturas.encadeada.MySimpleLinked;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class Carrinho {
    
    String data;
    MySimpleLinked<Produto> produtos;
    int qntProdudo;
    
    public Carrinho() {
        this.produtos = new MySimpleLinked<>();
    }
    
    void adicionar(Produto produto) {
        this.produtos.adicionar(produto);
    }
    
    public MySimpleLinked<Produto> getProdutos() {
        return produtos;
    }
    
    void remover(int codigo) {
        for (Produto prod : this.produtos) {
            if (prod.getCodigo() == codigo) {
                this.produtos.remover(prod);
                break;
            }
        }
    }
    
    void remover(Produto produto) {
        if (this.produtos.contem(produto) != -1) {
            for (Produto prod : this.produtos) {
                if (prod.equals(produto)) {
                    this.produtos.remover(prod);
                }
                break;
            }
        }
    }
    
}
