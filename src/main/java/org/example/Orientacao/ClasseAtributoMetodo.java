package org.example.Orientacao;

public class ClasseAtributoMetodo {
    static class Bolo {

        int quantidadeDeAcucar = 0;
        int quantidadeLeite = 0;
        boolean estaAssado;
        String cobertura = "morango";

        void assar(){
            if (quantidadeDeAcucar > 0 && quantidadeLeite > 0) {
                System.out.println("Assando o bolo... 🎂🔥");
                estaAssado = true; // Atualiza o estado do bolo
                System.out.println("Bolo pronto! Delícia! 😋");
            } else {
                System.out.println("Erro: Faltam ingredientes para assar o bolo! ❌");
            }
        }

        void decorar() {
            if (estaAssado) {
                System.out.println("Decorando com cobertura de " + cobertura + " 🍫");
            } else {
                System.out.println("Erro: Assar o bolo primeiro!");
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
            boloDeLeite.decorar();  // metodo para decorar (if bolo estiver assado)

        }

        /*NESSE CODIGO, SE FALTAR PREENCHER ALGUM ATRIBUTo exigido dentro do algoritmo do metodo assar, ele vai implicar em
        * responder que esta faltando algum ingrediente, por exemplo se o bolo de chocolate nao tiver o atributo leite,
        * vai constar que faltam ingredietnes para que possa ser feito*/

        /*JA o metodo decorar, exite dentro do seu algoritmo que o bolo esteja passado pelo processo de assar (metodo assar)*/

    }
}
