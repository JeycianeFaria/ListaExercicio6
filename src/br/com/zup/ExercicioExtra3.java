package br.com.zup;

import java.util.Scanner;

public class ExercicioExtra3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variaveis
        int contador;
        int numeroDigitado;
        int numeroFatorial = 1;

        System.out.println("Digite um número para calcularmos o fatorial dele:");
        numeroDigitado = leitor.nextInt();

        for (contador = 1;contador <= numeroDigitado;contador++){

            numeroFatorial = numeroFatorial * contador;

        }

        System.out.println(numeroDigitado + "! = " + numeroFatorial);

    }

}
