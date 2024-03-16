/*9 - Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura, em centímetros, 
e exibir o peso ideal e o peso ideal ajustado. Dica: https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal 
Utilize este como referência para seus testes. Obs. O IMC é apenas uma referência, um médico deve ser consultado para entender as necessidades de cada indivíduo.
 */

package com.mycompany.psc.exercicio02;
import java.util.Scanner;

public class Questao9 {
    public static void main (String [] args){
        
        double peso, altura, pesoideal, pesoajustado;
        
            Scanner ler = new Scanner (System.in);
        
        System.out.print("Digite qual o seu peso(kg): ");
            peso = ler.nextDouble();
            
        System.out.print("Digite qual a sua altura(cm): ");
            altura = ler.nextDouble();
            
            pesoideal = 52 + (0.75 * (altura - 152.4));
            pesoajustado = ((peso - pesoideal) * 0.25) + pesoideal;
            
        System.out.printf("\nO cálculo do seu IMC será de: \n\nPESO IDEAL: %.2f",pesoideal);
        System.out.printf("      PESO IDEAL AJUSTADO: %.2f",pesoajustado);
        System.out.printf("\n\nOBS: O IMC é apenas uma referência, um médico deve ser consultado para entender as necessidades de cada indivíduo."  );
            
        
    }
}
