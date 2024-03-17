/* 1 - Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se passaram desde o início do dia (00:00). */

package com.mycompany.psc.exercicio02;
import java.util.*;

public class Questao1 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
    
        int horas, minutos, qtsminutos;
        
        System.out.print("Digite o horário desejado: \n");
                System.out.print("Hora:");
                    horas = ler.nextInt();
                System.out.print("Minutos:");
                    minutos = ler.nextInt(); 
                    
            qtsminutos = horas * 60 + minutos;
            
        System.out.print("\nA hora informada foi "+horas+"h"+minutos);    
        System.out.print("\nDesde o início do dia já se passaram: "+qtsminutos+" Minuto(s)");
    }
}
