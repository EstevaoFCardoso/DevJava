package br.com.aula1.exercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //criar variaveis
        // importar
        // input
        // output
        // logica
        // int float double boolean
        // condicionais if else switch
        // criar metodo
        // operadores logicos
        // criar variaveis

        double num1, num2;
        int esc;


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();

        System.out.println("Escolha um numero : 1 - adição , 2 - subtrção, 3 - multiplicação, 4 - divisão");
        esc = sc.nextInt();

        do{
            if(esc<1 || esc>4){
                System.out.println("Digite uma opção valida");
                System.out.println("Escolha um numero : 1 - adição , 2 - subtrção, 3 - multiplicação, 4 - divisão");
                esc = sc.nextInt();
            }else{
                switch (esc){
                    case 1:
                        System.out.println("Resultado: " + add(num1,num2));
                        break;
                    case 2:
                        System.out.println(sub(num1,num2));
                        break;
                    case 3:
                        System.out.println(mult(num1,num2));
                        break;
                    case 4:
                        System.out.println(div(num1,num2));
                        break;
                    default:
                        System.out.println("escolha um numero valido");
                }
            }

        }while(esc<1 || esc>4);

    }

    public static double add(double a, double b ){
        return a+b;
    }

    public static double sub(double a, double b ){
        return a-b;
    }

    public static double mult(double a, double b ){
        return a*b;
    }

    public static double div(double a, double b ){
        return a/b;
    }

}
