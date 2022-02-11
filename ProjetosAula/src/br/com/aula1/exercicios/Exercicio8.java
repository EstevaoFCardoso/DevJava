package br.com.aula1.exercicios;

import java.util.Scanner;

public class Exercicio8 {
    /*
    * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
      Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
      ordem crescente ou decrescente.
    *
    * */
    public static void main(String[] args) {
        //STEPS
        // Criar as variaveis
        // Ler variaveis
        // Verificar multiplos
        // dizer se é multiplo ou não

        int a,b;
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        a = sc.nextInt();
        System.out.println("Digite o segundo numero");
        b = sc.nextInt();

        if((a%b == 0) || (b%a ==0)){
        System.out.println("MULTIPLOS");
        }else {
            System.out.println("NÃO SAO MULTIPLOS");
        }

    }

}
