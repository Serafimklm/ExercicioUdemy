package org.example.Orientacao;

import org.example.Orientacao.PooComConstrutorParametros.Funcionario;  // aqui estou importando a classe para usar os metodotodos parametros, reutilizar codigo etc..

public class UsandoClasseDeOutroPacote {

    public class FolhaDePagamento{

        public static void main(String[] args) {

            Funcionario funcionario = new Funcionario("Maria", "vendedora", 23);
        }
    }
}
