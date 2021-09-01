package br.com.zup;

import java.util.Scanner;

public class ExercicioLevelUp {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variaveis
        int valorInicial;
        int valorFinal;
        int contador;
        int somaNumerosImpares = 0;

        //Recebendo dados usuario
        System.out.println("Olá, por favor digite o valor inicial :");
        valorInicial = leitor.nextInt();
        System.out.println("Por favor digite o valor final :");
        valorFinal = leitor.nextInt();

        //inicializando valor do contador
        contador = valorInicial;

        //Verificar se o valor digitado é valido - Estrutura de Decisão

        if (valorFinal > valorInicial) {

            //Estrutura de Repetição
            while (contador <= valorFinal) {

                if (contador % 2 != 0) {

                    somaNumerosImpares += contador;

                    System.out.println(somaNumerosImpares);

                }

                contador++;

            }

            System.out.println("A soma de todos os números ímpares dentro do intervalor é de " + somaNumerosImpares);

        } else {

            System.out.println("Intervalo de valores inválido");

        }

    }

}
