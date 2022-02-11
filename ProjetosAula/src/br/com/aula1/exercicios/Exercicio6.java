package br.com.aula1.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    /*
    * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
    * */
    public static void main(String[] args) {
        //STEPS:
        //Criar variaveis
        //Ler variaveis
        //Dizer se é negativo ou não
            // if/else se num >=0 else negativo
        //Mostrar na tela

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu valor:");
        numero = sc.nextInt();

        if(numero >= 0){
            System.out.println("POSITIVO");
        }else {
            System.out.println("NEGATIVO");
        }

    }
}
