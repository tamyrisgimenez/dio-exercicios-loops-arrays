package com.dio.exercicios.loops;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada
de qualquer número inteiro entre 1 a 10. O usuário deve
informar de qual número ele deseja ver a tabuada. A saída
deve ser conforme o exemplo abaixo:

Tabuada de 5
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("----- Tabuada ----- ");
        System.out.println("Digite um número inteiro entre 1 e 10: ");
        numero = scan.nextInt();

        System.out.println("Tabuada de " + numero);
        for(int i = 1; i <= 10; ++i) {
            System.out.printf("%d x %d = %d \n", numero, i, numero * i);
        }
    }
}

