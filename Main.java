package main;

import produto.Produto;
import produto.Pedido;
import produto.ItemPedido;
import estoque.EstoqueProdutos;

public class Main {
    
    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.carregarProdutos();
        
Produto p1 = new Produto(0, 0, "aaaaa");
Produto p2 = new Produto(120666, 25.00, "Limpeza");
Produto p3 = new Produto(126969, 3000.00, "Eletrônico");

Pedido pedido = new Pedido();
ItemPedido item1 = new ItemPedido(p1, 1);
ItemPedido item2 = new ItemPedido(p2, 3);
ItemPedido item3 = new ItemPedido(p3, 1);

pedido.adicionarItem(item1);
pedido.adicionarItem(item2);
pedido.adicionarItem(item3);

pedido.cupomFiscal();
    }
}
