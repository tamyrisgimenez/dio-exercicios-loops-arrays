package com.dio.exercicios.loops;

/* Faça um programa que leia 5 números
e informe o maior número e a soma desses números.
 */

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero;
        double maior = 0;
        double soma = 0;
        int count = 0;

        System.out.println("----- Maior e média -----");
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;
            count++;
        } while (count < 5);

        System.out.println("O maior número é " + maior + ", a soma dos números é " + soma + " e a média é " + (soma / 5) + ".");
    }
}
