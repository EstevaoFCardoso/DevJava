package br.com.aula1.exercicios;

import java.util.Scanner;

public class Exercicio7 {

    /*
    *Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
    * OPERADORES ARITIMETICOS
    *   +
    *   -
    *   +=
    *   -=
    *    /
    *   *
    *   %
    * */

    public static void main(String[] args) {
        //STEPS
        //Criar variaveis
        //ler variaveis
        //verificar se é par ou impar
        //mostrar resultado

        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor:");
        numero = sc.nextInt();

        if((numero % 2) == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }


    }

}
