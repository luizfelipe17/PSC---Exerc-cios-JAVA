/* 8 - Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. 
Deve-se informar o tamanho do arquivo em MB, a velocidade do link em Mbps e, retornar o tempo total em minutos. */

package com.mycompany.psc.exercicio02;
import java.util.Scanner;

public class Questao8 {
    public static void main (String [] args){
     
        Scanner ler = new Scanner (System.in);
        
        double mb, mbps, minutos;

        
        System.out.print("Infome o tamanho do arquivo e a velocidade da sua rede: \n"
                + "Tamanho do arquivo (MB): ");
                mb = ler.nextDouble();
        System.out.print("Velocidade da rede (Mbps): ");
                mbps = ler.nextDouble();
                
                minutos = (mb / (mbps / 8)) / 60;
                
        System.out.printf("O tempo estimado para completar o download será de: %.2f",minutos); 
        System.out.print(" Minuto(s)");
    }
}
