/* 12 - Pesquise o valor aproximado de dias por mês e ajuste o programa anterior para exibir o custo mensal em energia elétrica com o equipamento inserido.*/

package com.mycompany.psc.exercicio02;
import java.util.*;

public class Questao12 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        int horas;
        double w, valorKWh, consumo, valortotal;
        
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
                
                consumo = ((w * horas) / 1000) * 30;
                valortotal = consumo * valorKWh;
                
        System.out.printf("\n\nO consumo mensal em KWh do equipamento informado foi de aproximadamente "+consumo+"KWh\n\nTotalizando um valor de R$%.2f",valortotal);
                    
    }    
}
