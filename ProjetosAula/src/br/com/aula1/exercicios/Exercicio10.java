package br.com.aula1.exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        //STEPS
        // CRIAR VARIAVEIS
        // LER
        // CALCULAR
        // DIZER VALOR NA TELA

        Scanner sc = new Scanner(System.in);

        double total;
        int quantidade;
        int codigoProduto;

        System.out.println("1- Cachorro Quente \t\t R$4.00\n" +
                "2- X-SALADA \t\t\t R$4.50\n" +
                "3- X-BACON \t\t\t\t R$5.00\n" +
                "4- Torada Simples \t\t R$2.00\n" +
                "5- Refrigerante \t\t R$1.50");
        System.out.println("Escolha um produto:");
        codigoProduto = sc.nextInt();
        System.out.println("Digite a quantidade :");
        quantidade = sc.nextInt();

        if(codigoProduto == 1){
            total = quantidade * 4.0;
        }else if(codigoProduto == 2){
            total = quantidade * 4.5;
        }else if(codigoProduto == 3){
            total = quantidade * 5.0;
        }else if(codigoProduto == 4){
            total = quantidade * 2.0;
        }else{
            total = quantidade * 1.5;
        }

        System.out.println("Total a pagar = R$ " + total);

    }
}
