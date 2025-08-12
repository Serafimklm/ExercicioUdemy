package org.example.exerciciosLogica;

import java.util.Scanner;

public class UsandoFor {Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i < 11; i++) {

            System.out.println("O valor de atual e " +(i));
            soma += i;

        }
        System.out.println(soma);
    }
    static class Doeces{
        public static void main(String[] args) {

            int doces = 0;

            while (doces < 3) {
                System.out.println("-------------");
                System.out.println("pode comer doce ");
                doces++;
            }
            System.out.println("-------------");
            System.out.println("nao pode mais");
        }

    }

}
