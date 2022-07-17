package com.dio.exercicios.loops;

/*
Faça um programa que peça N números inteiros, calcule e mostre
a quantidade de números pares e a quantidade de números ímpares.
 */

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtnumeros;
        int numero;
        int qtPares = 0;
        int qtImpares = 0;
        int count = 0;

        System.out.println("----- Par e Ímpar -----");
        System.out.println("Quantidade de números: ");
        qtnumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) qtPares++;
            else qtImpares++;
            count++;
        } while (count < qtnumeros);

        System.out.println("Total de números pares: " + qtPares);
        System.out.println("Total de números ímpares: " + qtImpares);
    }
}
