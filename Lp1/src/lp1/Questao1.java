/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp1;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        // TODO code application logic here
        float n1, n2, n3;

        Scanner in = new Scanner(System.in);
        System.out.println("Nota 1:");
        n1 = in.nextFloat();

        System.out.println("Nota 2:");
        n2 = in.nextFloat();

        System.out.println("Nota 3:");
        n3 = in.nextFloat();

        float med = (n1 + n2 + n3) / 3;
        float rec;

        if (med >= 7) {
            System.out.println("MÉDIA" + med + "\nALUNO APROVADO");
        }
        if (med < 7) {
            System.out.println("MÉDIA" + med + "\nALUNO REPROVADO");

            System.out.println("Insira a nota da recuperção:");
            rec = in.nextFloat();

            float md = (med + rec) / 2;

            if (md >= 5) {
                System.out.println("APROVADO PELA RECPAR " + md);
            } else if (md < 5) {
                System.out.println("REPROVADO PELA RECPAR " + md);

            }

        }

    }
}
