package br.com.zup;

public class ExercicioExtra2 {

    public static void main(String[] args) {

        //criando variaveis
        int contador;
        int somaNumerosImpares = 0;

        for (contador = 0; contador <= 50; contador++){

            if (contador % 2 != 0){

                somaNumerosImpares += contador;

            }
        }

        System.out.println("A soma de todos os números impares de 0  a 50 é " + somaNumerosImpares);

    }

}
