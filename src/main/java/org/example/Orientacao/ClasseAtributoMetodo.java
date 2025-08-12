package org.example.Orientacao;

public class ClasseAtributoMetodo {
    static class Bolo {

        int quantidadeDeAcucar = 0;
        int quantidadeLeite = 0;
        boolean estaAssado;

        void assar(){
            if (quantidadeDeAcucar > 0 && quantidadeLeite > 0) {
                System.out.println("Assando o bolo... 🎂🔥");
                estaAssado = true; // Atualiza o estado do bolo
                System.out.println("Bolo pronto! Delícia! 😋");
            } else {
                System.out.println("Erro: Faltam ingredientes para assar o bolo! ❌");
            }
        }

        public static void main(String[] args) {


            Bolo boloDeLeite = new Bolo();     //OBJETO 1
            Bolo bolodeChocolate = new Bolo();  // OBJETO 2

            bolodeChocolate.quantidadeDeAcucar = 212;
            bolodeChocolate.quantidadeLeite = 12;


            boloDeLeite.quantidadeDeAcucar = 210; // ATRIBUTO 1
            boloDeLeite.quantidadeLeite = 111;  // ATRIBUTO 2


            System.out.println("QUANTIDADE DE LEITE " + boloDeLeite.quantidadeLeite);
            System.out.println("QUANTIDADE ACUDAR NO BOLO DE LEITE " + boloDeLeite.quantidadeDeAcucar);
            System.out.println("--------------------------------------");
            System.out.println("QUANTIDADE DE ACUCAR NO BOLO DE CHOCOLATE " + bolodeChocolate.quantidadeDeAcucar);


            bolodeChocolate.assar();  //METODO ASSAR
            boloDeLeite.assar(); // METODO ASSAR
        }

    }
}
