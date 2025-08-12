package org.example.Orientacao;

public class PooComConstrutorParametros {


    static class Funcionario {
        String nome;
        String cargo;
        int idade;
        void executandoTrabalho() {
            if ("Dev".equals(cargo)){
                System.out.println("esta trabalhando como um programador");
            }
            else if ("vendedora".equalsIgnoreCase(cargo)){  // ignorar case do nome
                System.out.println(" esta trabalhando informalmente");
            }else {
                System.out.println(nome + " está trabalhando em outro tipo de emprego");
            }
        }

        // construtor dos dados de funcionarios para que seja permitido passar os dados dentro
//        dos parametros durante a instancinacao de funcionario
        Funcionario(String nome, String cargo, int idade){
            this.nome = nome;
            this.cargo = cargo;
            this.idade = idade;
        }
        Funcionario(){} // aplicando sobrecarga de construtor para que  eu possa instanciar tudo manualmente  sem usar construtor tambem

        public static void main(String[] args) {

            //instanciando via contrutor
            Funcionario funcionario = new Funcionario("joao", "Dev", 30);
            Funcionario funcionario1 = new Funcionario("Aninha", "vendedora", 22);
            Funcionario funcionario2 = new Funcionario("marco", "motoboy", 22);

            //INSTANCIANDO MANUALMENTE  (pra isso foi necessario um constutor vazio na linha 28)
            Funcionario funcionario4 = new Funcionario();
            funcionario4.cargo = "Trabalhador rural";
            funcionario4.idade = 44;
            funcionario4.nome = "zezin";

            // executando metodo trabalhando com cada funcionario
            funcionario1.executandoTrabalho();
            funcionario.executandoTrabalho();
            funcionario2.executandoTrabalho();
            funcionario4.executandoTrabalho();



        }
    }

}
