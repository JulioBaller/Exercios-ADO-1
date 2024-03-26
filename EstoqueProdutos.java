package estoque;

import java.util.List;
import java.util.ArrayList;
import produto.Produto;
import produto.ItemPedido;

public class EstoqueProdutos implements Estoque{

private List<EstoqueProdutos> estoqueProdutos;
private ItemPedido itemPedido;


public EstoqueProdutos(ItemPedido itemPedido){
this.itemPedido = itemPedido;
}

public EstoqueProdutos(){
this.estoqueProdutos = new ArrayList<>();
}

public ItemPedido getItemPedido(){
return itemPedido;    
}

public void carregarProdutos(){
estoqueProdutos.add(new EstoqueProdutos(new ItemPedido(new Produto(122345, 15.00, "Alimento"), 10)));
estoqueProdutos.add(new EstoqueProdutos(new ItemPedido(new Produto(125678, 16.50, "Alimento"), 10)));
estoqueProdutos.add(new EstoqueProdutos(new ItemPedido(new Produto(129874, 23.75, "Alimento"), 10)));
estoqueProdutos.add(new EstoqueProdutos(new ItemPedido(new Produto(123983, 11.00, "Alimento"), 10)));
estoqueProdutos.add(new EstoqueProdutos(new ItemPedido(new Produto(126789, 18.00, "Alimento"), 10)));
estoqueProdutos.add(new EstoqueProdutos(new ItemPedido(new Produto(126788, 10.00, "Limpeza"), 10)));
estoqueProdutos.add(new EstoqueProdutos(new ItemPedido(new Produto(120666, 25.00, "Limpeza"), 10)));
estoqueProdutos.add(new EstoqueProdutos(new ItemPedido(new Produto(126969, 3000.00, "Eletrônico"), 10)));
estoqueProdutos.add(new EstoqueProdutos(new ItemPedido(new Produto(121234, 5000.00, "Eletrônico"), 10)));

} 

public boolean remover(int id, int quantidade){

for(EstoqueProdutos item : estoqueProdutos){

if(item.getItemPedido().getProduto().getCodigo() == id){

    if(item.getItemPedido().getQuantidade() <= quantidade){

      item.getItemPedido().setQuantidade(0);
      return true;  

    }
    else{

    item.getItemPedido().setQuantidade(item.getItemPedido().getQuantidade() - quantidade);
    return true;

    }
  }  
}

return false;
}

public List<EstoqueProdutos> verEstoque(){ 
    return estoqueProdutos;
}
    
}