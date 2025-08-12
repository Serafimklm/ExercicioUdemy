package org.example.exerciciosLogica;

import java.util.Scanner;

public class algoritmoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        int nota = 0; int nota1 = 0;

        while (cont < 2) {
            System.out.println("DIGITE nota primeira unidade");
            nota += scanner.nextInt();
            System.out.println("digite a nota da segunda undiade");
            nota1 += scanner.nextInt();
            cont++;
        }
        System.out.println(" a media das notas foi\n" +
                "nota1 = " + nota + " \n nota2 " + nota1);

        if (nota < 6 || nota1 < 6) {
            System.out.println("a soma das notas de uma da unidades divido por 2 é inferior a media");

        } else  { System.out.println("o aluno atingiu a media"); }

    }
}
