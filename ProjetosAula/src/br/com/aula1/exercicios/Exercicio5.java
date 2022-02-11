package br.com.aula1.exercicios;

import java.util.Scanner;

public class Exercicio5 {

    /*
    *
    *Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
    mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B.
    *
    *
    *
    * Step1
    *    3 variaveis(A,B,C)
    *    double float
    *
    *Step 2
    *    a) a*c/2.0
    *    b) pi * c * c
    *    c) (a+b) / 2.0 * C
    *    d) b*b
    *    e) A*B
    *
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a,b,c;
        double areaTriangulo, areaCirculo, areaTrapezio,areaQuadrado,areaRetangulo;

        System.out.println("Digite o valor A");
        a = sc.nextDouble();
        System.out.println("Digite o valor B");
        b = sc.nextDouble();
        System.out.println("Digite o valor C"); //comentario de linha
        c = sc.nextDouble();

        areaTriangulo = ((a * c)/2.0);
        areaCirculo = 3.14159 * c * c;
        areaTrapezio = (a+b) / 2.0 * c;
        areaQuadrado = b * b ;
        areaRetangulo = a*b;

        System.out.printf("TRIANGULO : %.2f\n",areaTriangulo);
        System.out.printf("CIRCULO : %.2f\n" , areaCirculo);
        System.out.printf("TRAPEZIO : %.2f\n",areaTrapezio);
        System.out.printf("QUADRADO : %.2f\n",areaQuadrado);
        System.out.printf("RETANGULO : %.2f\n",areaRetangulo);

    }

}
