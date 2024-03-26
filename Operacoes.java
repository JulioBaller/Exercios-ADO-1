package operacoes;

public enum Operacoes{


INSERTION{
public void escolha(int[] v){
Insertion i = new Insertion();
i.insertion(v);
  }
}, 

SELECTION{
public void escolha(int[] v){
Selection s = new Selection();
s.selection(v);
  } 
},
  
BUBBLE{
public void escolha(int[] v){
Bubble b = new Bubble();
b.bubble(v);
  }  
};

public abstract void escolha(int[] v);
  
}
