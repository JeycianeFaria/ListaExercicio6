package br.com.zup;

public class Exercicio1 {

    public static void main(String[] args) {


        System.out.println("Contador utilizando o For");
        for (int contador = 1; contador <= 100; contador++){
            System.out.println(contador);
        }

        //variavel
        int contador = 0;

        System.out.println("Contador utilizando o While");

        while(contador <= 100){
            System.out.println(contador);

            contador++;
        }

    }

}
