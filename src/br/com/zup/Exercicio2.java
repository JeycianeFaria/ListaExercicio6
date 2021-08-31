package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variáveis
        int qtdNumeros;
        int contador;
        int numero;
        double soma = 0;
        double media = 0;

        System.out.println("Por favor qual a quantidade de números inteiros que você irá digitar");
        qtdNumeros = leitor.nextInt();

        for (contador = 1; contador <= qtdNumeros; contador++ ){
            System.out.println("Por favor digite o numero  " + contador + " :");
            numero = leitor.nextInt();

            soma += numero;
        }

        media = soma / qtdNumeros;

        System.out.println("A média aritmética de todos os numeros inteiros digitados é " + media);


    }

}
