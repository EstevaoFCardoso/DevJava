package br.com.aula1.exercicios;


import java.util.Scanner;

public class Exercicio1 {
/*
* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
  mensagem explicativa.
  *
*
* */


    public static void main(String[] args) {
    // Steps :
        //Criar 2 valores - OK
        //Ler os 2 valores - OK
        //calculo-ok
        //imprimir a soma deles -ok

        int valor1, valor2;
        int resultado;
        Scanner sc  = new Scanner(System.in); // objeto usado pra leitura de valor do console

        System.out.println("Digite o primeiro número:");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        valor2 = sc.nextInt();

        resultado = soma(valor1,valor2);

        System.out.println("SOMA = " + resultado);

    }

    private static int soma(int a, int b) {
        return a+b;
    }

}
