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
public class Questao4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("informe um numero maior que zero: ");
        n = scanner.nextInt();
        if (n >= 0) {
            int nd = contd(n);
            System.out.println("numero de digitos: " + nd);

        } else {
            System.out.println("numero ");
        }

    }

    public static int contd(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}

