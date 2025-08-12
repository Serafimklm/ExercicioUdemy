package org.example.Orientacao;

/**
 * Construtor que inicializa um Funcionário com nome, cargo e idade.
 * @param nome Nome do funcionário
 * @param cargo Cargo do funcionário
 * @param idade Idade do funcionário
 *
 * metodo que executa cada trabalho de acorcom com o emprego de cada pessoa/funcionario.
 */

import java.sql.SQLOutput;


public class OrientacaoObjetos {

    static class Funcionario{
        String nome;
        String cargo;
        int idade;
        boolean trabalhando;
        void executandoTrabalho() {
            if ("Dev".equals(cargo)){
                System.out.println("esta trabalhando como um programador");
        }
            else if ("PJ".equals(cargo)){
                System.out.println(" esta trabalhando informalmente");
            }

        }

        public static void main(String[] args) {

            Funcionario funcionario = new Funcionario(); // objeto
            Funcionario funcionario1 = new Funcionario(); //objeto 1

            //                atributos do funcinario
            funcionario.cargo = "Dev";
            funcionario.nome = "joao";
            funcionario.idade = 30;

            // atributos funcionario1
            funcionario1.cargo = "PJ";
            funcionario1.nome = "marizinha";
            funcionario1.idade = 32;

            System.out.println("============DADOS FUNCIONARIO=======================");
            System.out.println("NOME " + funcionario.nome );
            System.out.println("cargo " + funcionario.cargo);
            System.out.println("idade " + funcionario.idade + "\n\n");

            System.out.println("===========dados funcionario 1 =======================");
            System.out.println("NOME " + funcionario1.nome );
            System.out.println("cargo " + funcionario1.cargo);
            System.out.println("idade " + funcionario1.idade + "\n\n");

         /*   funcionario1.executandoTrabalho();
            funcionario.executandoTrabalho();*/
            System.out.println("================funcionarios trabalhando================");
            System.out.println("o funcionaro  trabalha como "); funcionario.executandoTrabalho();
            System.out.println("o funcionaro1   trabalha como "); funcionario1.executandoTrabalho();

        }
    }

}
