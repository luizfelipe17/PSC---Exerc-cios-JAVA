/* 14- Escreva um algoritmo que recebe dois pontos no plano cartesiano, P1=(x1,y1) e P2=(x2,y2)e calcula a distância entre eles, dada por d(P1,P2)=(x1-x2)2+(y1-y2)2 . */

package com.mycompany.psc.exercicio02;
import java.util.Scanner;

public class Questao14 {
    public static void main (String[] args){
    
        Scanner ler = new Scanner (System.in);
        
        int x1, y1, x2, y2;
        double distancia;
        
        System.out.print("Digite os valores do primeiro plano cartesiano (P1): \n x1: ");
                x1 = ler.nextInt();
                    System.out.print(" y1: ");
                y1 = ler.nextInt();
        
        System.out.print("Digite os valores do segundo plano cartesiano (P2): \n x2: ");
                x2 = ler.nextInt();
                    System.out.print(" y2: ");
                y2 = ler.nextInt();        
                
                
                distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
                
          System.out.printf("O distância entre os planos cartesianos será de: %.2f",distancia);      
    }
}
