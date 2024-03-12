//3 - Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a2+b2

package pscexerciociosjava;
import java.util.Scanner;

public class Questao3 {
    
    public static void main (String[] args){
    
        double a, b, c;

        Scanner ler = new Scanner (System.in);
        
        System.out.print("Digite o valor de 'A': ");
            a = ler.nextDouble();
        
        System.out.print("Digite o valor de 'B': ");
            b = ler.nextDouble();
            
          c = (a*a + b*b);    
          
        System.out.printf("O resultado da equação será: %.2f", Math.sqrt(c));
    }
}
