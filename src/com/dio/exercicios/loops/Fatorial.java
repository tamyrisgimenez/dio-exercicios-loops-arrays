package com.dio.exercicios.loops;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int fatorial = 1;

        System.out.println("----- Fatorial ----- ");
        System.out.println("Digite um número inteiro: ");
        numero = scan.nextInt();

        for(int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
