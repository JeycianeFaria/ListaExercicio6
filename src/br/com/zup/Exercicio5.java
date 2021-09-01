package br.com.zup;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variaveis
        int numeroInteiro = 0;
        int contador;



        //Estrutura de Repetição
        for (contador = 0; contador <= 100; contador++){

            System.out.println(numeroInteiro);

            numeroInteiro += 1000;

        }

    }

}
