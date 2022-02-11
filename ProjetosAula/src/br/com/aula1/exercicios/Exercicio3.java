package br.com.aula1.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    /*
    * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
      de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
    *
    * */
    public static void main(String[] args) {

        //STEPS :
        // Criar valores A B C D
        //Ler os valores
        //Calcular (A*B - C*D)
        // mostrar a diferença

        float a,b,c,d, diferenca;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A :");
        a = sc.nextFloat();
        System.out.println("Digite o valor de B :");
        b = sc.nextFloat();
        System.out.println("Digite o valor de C :");
        c = sc.nextFloat();
        System.out.println("Digite o valor de D :");
        d = sc.nextFloat();

        diferenca = (a*b) - (c*d);

        System.out.println("Diferença : " + diferenca);


    }
}
