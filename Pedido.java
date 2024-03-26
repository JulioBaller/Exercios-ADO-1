package produto;

import java.util.ArrayList;
import java.util.List;
import estoque.EstoqueProdutos;

public class Pedido{

private double valorTotal = 0;
private List<EstoqueProdutos> itemPedido = new ArrayList<>();

public void adicionarItem(ItemPedido item){
EstoqueProdutos estoque = new EstoqueProdutos(); 
estoque.carregarProdutos();
List<EstoqueProdutos> listaEstoque = estoque.verEstoque();   

for(EstoqueProdutos lista : listaEstoque){

  if(item.getProduto().getCodigo() == lista.getItemPedido().getProduto().getCodigo() &&
     item.getProduto().getPreco() == lista.getItemPedido().getProduto().getPreco() &&
     item.getProduto().getCategoria() == lista.getItemPedido().getProduto().getCategoria()){

  itemPedido.add(new EstoqueProdutos(item));
  }

}
}

public double calcularTotal(){
for(EstoqueProdutos item : itemPedido){
valorTotal = valorTotal + (item.getItemPedido().getProduto().getPreco() * item.getItemPedido().getQuantidade()) ;
}    
return valorTotal;
}

public void cupomFiscal(){
for (EstoqueProdutos item : itemPedido) {
    System.out.println("Produto: codigo = "+item.getItemPedido().getProduto().getCodigo()+
    ", preco = "+item.getItemPedido().getProduto().getPreco()+
    ", categoria = "+item.getItemPedido().getProduto().getCategoria()+
    ", quantidade = "+item.getItemPedido().getQuantidade());     
}
System.out.println("Total do pedido = " + calcularTotal());
}
}


