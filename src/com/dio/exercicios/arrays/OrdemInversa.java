package com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 */

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {2, 4, -3, 12, 8, 9};

        System.out.print("Elementos do vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nElementos do vetor na ordem inversa: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
