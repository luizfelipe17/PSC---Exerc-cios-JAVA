/* 5 - Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. 
O resultado deve aparecer de maneira organizada e clara para a pessoa utilizadora. */

package com.mycompany.psc.exercicio02;
import java.util.Scanner;

public class Questao5 {
    public static void main (String[] args){
    
        Scanner ler = new Scanner (System.in);
        
        double baseB, alturaH, area, perimetro, diagonal;
        
        System.out.print("Digite os valores do retangulo: \n Base (b): ");
            baseB = ler.nextDouble();
        System.out.print(" Altura (h): ");
            alturaH = ler.nextDouble();
            
            area = baseB * alturaH;
            perimetro = 2 * (baseB + alturaH);
            diagonal = (alturaH * alturaH + baseB * baseB);
            
        System.out.print("Referente o retangulo os resultados serão: \n"
                + "Área: "+area+"\n"
                        + "Périmetro: "+perimetro+"\n"
                                + "Diagonal: "+Math.sqrt(diagonal));
                
    }
}
