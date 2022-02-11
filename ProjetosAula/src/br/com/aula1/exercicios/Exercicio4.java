package br.com.aula1.exercicios;

import java.util.Scanner;

public class Exercicio4 {
/*
* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
  hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
  decimais.
*
* */
    public static void main(String[] args) {
        //STEPS:
        //Declarar as variaveis numFuncionar, horasTrabalhadas, valorDaHora
        //ler os valores
        //calcular os valores horasTrabalhadas*valorDaHora
        // mostrar o valor

        double horasTrabalhadas,valorDaHora,salario;
        int numFuncionar;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do funcionario:");
        numFuncionar =  sc.nextInt();
        System.out.println("Digite as horas trabalhadas:");
        horasTrabalhadas =  sc.nextDouble();
        System.out.println("Digite o valor da hora:");
        valorDaHora =  sc.nextDouble();

        salario = horasTrabalhadas*valorDaHora;

        System.out.println("Number : " + numFuncionar);
        System.out.println("SALARY : U$ "+ salario);
    }
}
