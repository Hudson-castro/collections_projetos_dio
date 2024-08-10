package main;

public class Item extends CarrinhoDeCompras {



    private String produto;
    private double preco;
    private int quantidade ;


    public Item(String produto, double preco, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }


    @Override
    public String toString() {
        return produto + " - " + quantidade + " unidades - R$ " + preco;
    }
}
