package org.example.exerciciosLogica;

import java.util.Scanner;

public class TamanhoMesSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MESES DO ANO\n digite o numero do mes: ");

        int mes = scanner.nextInt();

        switch (mes) {
            case 1, 3, 7, 8, 10 :
                System.out.println("Ate dia 31");
                break;

            case 4, 6, 9, 11:
                System.out.println("ate 30");
                break;

            case 2:
                System.out.println("28 em bissexto");

            default:
                System.out.println("nao encontrado");
        }

        }



}
