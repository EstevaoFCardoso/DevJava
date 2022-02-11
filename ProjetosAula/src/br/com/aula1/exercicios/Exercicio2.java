package br.com.aula1.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

   /*
   * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
     casas decimais conforme exemplos
   *
   * */

    public static void main(String[] args) {

        // STEPS :
        // Criar 1 variavel -ok
        // ler essa variavel-ok
        // calculo-ok
        // mostrar na tela-ok
        double valorRaio, areaCirculo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio:");
        valorRaio =  sc.nextDouble();

        areaCirculo = 3.141259 * (valorRaio * valorRaio);

        System.out.printf("A = %.4f",areaCirculo);

    }

}
