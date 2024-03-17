/* 4 - Crie um programa para calcular a regra de três. */

package com.mycompany.psc.exercicio02;
import java.util.*;

public class Questao4 {
    public static void main (String[] args){
    
        Scanner ler = new Scanner (System.in);
        
        int valor1, valor2, valor3, valorX;
        
        System.out.print("Informe os valores da operação: \n"
                + "Valor1: ");
                valor1 = ler.nextInt();
                
        System.out.print("Corresponde a: ");
                valor2 = ler.nextInt(); 
                
        System.out.print("Valor3: ");
                valor3 = ler.nextInt();
                
                
                valorX = valor2 * valor3 / valor1;
               
               
        System.out.print("O resultado da operação será:\n\n"
                + "Valor1: "+valor1+"      Valor2: "+valor2+"\n"
                + "Valor3: "+valor3+"       X: "+valorX);
         
                
    }
}
