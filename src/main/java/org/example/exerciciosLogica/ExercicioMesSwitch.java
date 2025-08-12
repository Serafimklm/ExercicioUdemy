package org.example.exerciciosLogica;

import java.util.Scanner;

public class ExercicioMesSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MESES DO ANO\n digite o numero do mes: ");
        int mes = scanner.nextInt();

        switch(mes) {
            case 1:
            System.out.println("janeiro");  break;
            case 2:
                System.out.println("fevereiro"); break;
            case 3:
                System.out.println("marco"); break;
            case 4:
                System.out.println("abriu"); break;
            case 5:
                System.out.println("mai"); break;
            case 6:
                System.out.println("junho"); break;
            case 7:
                System.out.println("julho"); break;
            case 8:
                System.out.println("agosto"); break;
            case 9:
                System.out.println("setembro"); break;
            case 10:
                System.out.println("outubro"); break;
            case 11:
                System.out.println("novenbro"); break;
            case 12:
                System.out.println("dez"); break;
        }
    }
    }

