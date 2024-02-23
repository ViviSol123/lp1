/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp1;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Questao2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int qtd;

        System.out.println("Informe a quantidade de livros a serem comprados:");
        qtd = in.nextInt();
        double a = (qtd * 0.25) + 7.50;
        double b = (qtd * 0.50) + 2.50;

        if (a < b) {
            System.out.println("  R$ 0,25 por livro + R$ 7,50 fixo é a melhor opção de desconto. Valor da compra: " + a);
        } else if (b < a) {
            System.out.println("R$ 0,50 por livro + R$ 2,50 fixo é a melhor opção de desconto. Valor da compra: " + b);
        }

    }
}
