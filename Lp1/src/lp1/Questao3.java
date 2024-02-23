/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp1;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in = new Scanner (System.in);
     System.out.println("Insira o primeiro intervalo de tempo:");
        System.out.print("Horas: ");
        int h1 = in.nextInt();
        System.out.print("Minutos: ");
        int min1 = in.nextInt();
        System.out.print("Segundos: ");
        int seg1 = in.nextInt();
        
        System.out.println("\nDigite o segundo intervalo de tempo:");
        System.out.print("Horas: ");
        int h2 = in.nextInt();
        System.out.print("Minutos: ");
        int min2 = in.nextInt();
        System.out.print("Segundos: ");
        int seg2 = in.nextInt();
        
        int somaH = h1 + h2;
        int somaMin = min1 + min2;
        int somaSeg = seg1 + seg2;
        
        if(somaSeg >= 60){
           somaSeg -= 60;
           somaMin++;
        }
        if(somaMin >= 60){
            somaMin-=60;
            somaH++;
        }
        int difH = h1 - h2;
        int difMin = min1 - min2;
        int difSeg = seg1 - seg2;

        
        System.out.println("\nSoma dos intervalos:");
        System.out.println("Horas: " + somaH);
        System.out.println("Minutos: " + somaMin);
        System.out.println("Segundos: " + somaSeg);

        System.out.println("\nDiferença dos intervalos:");
        System.out.println("Horas: " + difH);
        System.out.println("Minutos: " + difMin);
        System.out.println("Segundos: " + difSeg);

        
        
        
        
    }
}
