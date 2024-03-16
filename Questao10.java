/* 10 - A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso. 
Crie um algoritmo que recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros.*/

package com.mycompany.psc.exercicio02;
import java.util.Scanner;

public class Questao10 {
    public static void main (String [] args){
        
        Scanner ler = new Scanner (System.in);
        
        double peso, qtsAguaRecomendada;
        
      System.out.print("Por gentileza, infome o seu peso: ");
            peso = ler.nextDouble();
            
            qtsAguaRecomendada = 35 * peso / 1000;
            
      System.out.print("\nA quantidade recomendada de água nescessária por dia são de: "+qtsAguaRecomendada+"L");      
        
    }
}
