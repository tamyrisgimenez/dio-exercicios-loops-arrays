package com.dio.exercicios.loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e
continue pedindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;

        System.out.println("----- Nota -----");
        System.out.println("Insira uma nota entre zero e dez: ");
        nota = scan.nextDouble();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota inválida. Insira uma nota entre zero e dez: ");
            nota = scan.nextDouble();
        }
    }
}
