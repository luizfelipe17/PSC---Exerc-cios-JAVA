/* 11 - Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. 
Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, e o valor do KW/h. 
O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. 
Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles. */


package com.mycompany.psc.exercicio02;
import java.util.*;

public class Questao11 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        int horas;
        double w, kWh, valorKWh, consumo, valortotal;
        
        System.out.print("Informe as informações: \n"
                + "\nQual a potencia em Watt(s) (W): ");
                    w = ler.nextDouble();
                    
                System.out.print("Informe quantas horas o equipamento foi utilizado: ");
                    horas = ler.nextInt();
                    
                System.out.print("\n\nRESIDENCIAL NORMAL:\n"
                        + "BANDEIRA VERDE - CONSUMO R$/KWH: 0,75"
                        + "\nBANDEIRA AMARELA - CONSUMO R$/KWH: 0,78"
                        + "\nBANDEIRA VERMELHA 1 - CONSUMO R$/KWH: 0,81"
                        + "\nBANDEIRA VERMELHA 2 - CONSUMO R$/KWH: 0,85"
                        + "\n\nConforme a bandeira, informe o valor do KH/h: ");
                    valorKWh = ler.nextDouble();    
                
                consumo = (w * horas) / 1000;
                valortotal = consumo * valorKWh;
                
        System.out.printf("\n\nO consumo em KWh do equipamento informado foi de "+consumo+"KWh\n\nTotalizando um valor de R$%.2f",valortotal);
                    
    }    
}
