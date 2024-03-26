package produto;

public class ItemPedido{

public ItemPedido(Produto produto, int quantidade){
this.produto = produto;
this.quantidade = quantidade;
}

private int quantidade;
private Produto produto;


public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}
public int getQuantidade() {
    return quantidade;
}
public Produto getProduto() {
    return produto;
}

}
