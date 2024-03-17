/* 7 - Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido e o valor total a ser pago.*/


package com.mycompany.psc.exercicio02;
import java.util.*;

public class Questao7 {
    public static void main(String [] args){
        
        Scanner ler = new Scanner (System.in);
        
        double largura, comprimento, revestimentoNecessario, tamanhoPiso, totalPiso, valorPiso, valorTotalPiso;
        
        System.out.print("Informe a área do local:\n"
                + " LARGURA: ");
                    largura = ler.nextDouble();
                System.out.print(" COMPRIMENTO: "); 
                    comprimento = ler.nextDouble();
         
        System.out.print("\nQual o tamanho da cerâmica escolhida, informe: ");
                    tamanhoPiso = ler.nextDouble();
                System.out.print("Informe o valor por m² da cerâmica escolhida: ");
                    valorPiso = ler.nextDouble();
                
              revestimentoNecessario = (largura * comprimento) * 1.10;
              totalPiso = revestimentoNecessario / tamanhoPiso;
              valorTotalPiso = (totalPiso * tamanhoPiso) * valorPiso;
             
              
        System.out.printf("\n\nA quantidade nescessária de revestimento será: %.2f",revestimentoNecessario);
        System.out.print("m²");
        System.out.printf("\nSerá nescessário um total de: %.0f",totalPiso);
        System.out.printf(" PISO(S)\n O valor total ficará em: R$%.2f", valorTotalPiso);         
        
        
    }
    
}