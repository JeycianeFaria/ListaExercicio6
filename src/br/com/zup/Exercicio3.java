package br.com.zup;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variaveis
        int contador = 1;
        int qtdNumeros = 10;
        double numeroDigitado = 0;
        double menorNumero = 0;
        double maiorNumero = 0;

        System.out.println("Olá. Por favor digite 10 números");

        while(contador <= qtdNumeros){
            System.out.println("Digite o numero " + contador + " :");
            numeroDigitado = leitor.nextDouble();

            if (contador == 1){
                menorNumero = numeroDigitado;
                maiorNumero = numeroDigitado;
            }else {
                if (numeroDigitado < menorNumero){
                    menorNumero = numeroDigitado;
                }
                if(numeroDigitado > maiorNumero){
                    maiorNumero = numeroDigitado;
                }
            }

            contador++;

        }

        System.out.println("O menor número digitado foi o " + menorNumero);
        System.out.println("O maior número digitado foi o " + maiorNumero);

    }

}
