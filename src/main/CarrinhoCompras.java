package main;

import java.util.ArrayList;
import java.util.List;


class CarrinhoDeCompras  {

    private List<Item> comprasList;

    public CarrinhoDeCompras() {
        this.comprasList = new ArrayList<>();
    }

    public void adicionarItem(String produto, double preco , int quantidade) {
        comprasList.add(new Item (produto, preco , quantidade));


    }
    public void removerItem (String produto) {
        List<Item> comprasParaRemover = new ArrayList<>();
        for (Item item : comprasList){
            if (item.getProduto().equalsIgnoreCase((produto)))
                comprasParaRemover.add(item);
        }
        comprasList.removeAll(comprasParaRemover);

    }
    public double calcularValorTotal (){
        double total = 0 ;
        for (Item item : comprasList ){
            total += item.getPreco() * item.getQuantidade();

        }
          return total;

    }
    public void exibirItens(){
        for (Item item : comprasList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
       CarrinhoDeCompras compras = new CarrinhoDeCompras();

        System.out.println("O número total de alementos na lista é : " + compras.calcularValorTotal());

        compras.adicionarItem("Banana", 1.5, 3);
        compras.adicionarItem("Ovo", 0.3, 12);
        compras.adicionarItem("Arroz", 10.0, 2);
        System.out.println("O número total de alementos na lista é : " + compras.calcularValorTotal());

        compras.removerItem("banana");
        System.out.println("O número total de alementos na lista é : " + compras.calcularValorTotal());

      compras.exibirItens();
    }


}


