/* 6- Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra. 
A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica escolhida. 
Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.
 */

package com.mycompany.psc.exercicio02;
import java.util.*;

public class Questao6 {
    public static void main(String [] args){
        
        Scanner ler = new Scanner (System.in);
        
        double largura, comprimento, revestimentoNecessario, tamanhoPiso, totalPiso;
        
        System.out.print("Informe a área do local:\n"
                + " LARGURA: ");
                    largura = ler.nextDouble();
                System.out.print(" COMPRIMENTO: "); 
                    comprimento = ler.nextDouble();
         
        System.out.print("\nQual o tamanho da cerâmica escolhida, informe: ");
                tamanhoPiso = ler.nextDouble();
                
              revestimentoNecessario = (largura * comprimento) * 1.10;
              totalPiso = revestimentoNecessario / tamanhoPiso;
              
        System.out.printf("\n\nA quantidade nescessária de revestimento será: %.2f",revestimentoNecessario);
        System.out.print("m²");
        System.out.printf("\nSerá nescessário um total de: %.0f",totalPiso);
        System.out.print(" PISO(S)");         
        
    }
    
}
