package cliente;

import java.util.Arrays;
import java.util.Scanner;
import operacoes.Operacoes;

public class Cliente{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int[] v = {1,2,6,4,5,3,9,10,7,8};

    boolean valido;
    do{

    valido = true;
    System.out.println("Vetor: "+Arrays.toString(v));
    System.out.println("1.Insertion");
    System.out.println("2.Selection");
    System.out.println("3.Bubble");
    System.out.println("informe o algoritimo que deseja executar:");
    
    try{

    int opcao = input.nextInt();
    Operacoes.values()[opcao-1].escolha(v);

    }catch (Exception e) {

    System.out.println();
    System.out.println("escolha inválida");  
    System.out.println();
    valido = false;

    }
    
    }while(valido == false);

  } 
}