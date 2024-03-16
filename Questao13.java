/* 13 -Escreva um programa que seja capaz de realizar a soma de duas frações, não é necessário simplificar. 
As entradas serão o numerador e, o denominador da primeira fração, seguidos do numerador e, o denominador da segunda fração. 
O resultado também deverá ser exibido em formato de fração. e.g: ⅗ */

package com.mycompany.psc.exercicio02;
import java.util.Scanner;

public class Questao13 {
    public static void main (String[] args){
    
        Scanner ler = new Scanner (System.in);
    
        int primeiroNumeroFracao1, segundoNumeroFracao1, primeiroNumeroFracao2, segundoNumeroFracao2, resultado1, resultado2;
    
        
        System.out.print("Favor informe os valores da primeira fração: \n ");
            primeiroNumeroFracao1 = ler.nextInt();
            System.out.print("----\n ");
            segundoNumeroFracao1  = ler.nextInt();      
    
        System.out.print("Favor informe os valores da segunda fração: \n ");
            primeiroNumeroFracao2 = ler.nextInt();
            System.out.print("----\n ");
            segundoNumeroFracao2  = ler.nextInt(); 
            
            resultado1 = (primeiroNumeroFracao1*segundoNumeroFracao2)+(primeiroNumeroFracao2*segundoNumeroFracao1);    
            resultado2 = segundoNumeroFracao1 * segundoNumeroFracao2;       
            
        System.out.println("O resultado da fração será: \n "+resultado1+"\n----\n "+resultado2);
    
    }
}
