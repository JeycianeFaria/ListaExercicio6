package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Variáveis
        int qtdDeNumeros;
        int contador = 1;
        int numerosInteirosPositivo;
        int soma = 0;

        //Recebendo dados usuário
        System.out.println("Olá, quantos números inteiros positivos você irá digitar?");
        qtdDeNumeros = leitor.nextInt();

        //Estrutura Repetição
        while (contador <= qtdDeNumeros) {

            //recebendo os numeros
            System.out.println("Por favor digite o numero " + contador + " :");
            numerosInteirosPositivo = leitor.nextInt();

            //verificando se é positivo ou não - Estrutura de Decisão
            if (numerosInteirosPositivo > 0) {

                soma += numerosInteirosPositivo;

                contador++;
            } else {
                System.out.println("Você digitou um valor inválido, digite novamente");
            }

        }

        System.out.println("A soma de todos os números inteiros positivos digitados é " + soma);

    }

}
