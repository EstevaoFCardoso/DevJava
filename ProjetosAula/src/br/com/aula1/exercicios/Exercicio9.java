package br.com.aula1.exercicios;

import java.util.Scanner;

public class Exercicio9 {

    /*
    *Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
     começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
    *
    * melhor caso -> sempre o caso que funciona
    * pior caso  -> da pau / perfoma pior
    *
    * horaInc < horaFinal
    * */

    public static void main(String[] args) {
        // STEPS:
        // CRIAR VARIAVEIS
        //LER VARIAVEIS
        //VERIFICAR A RELACAO DAS HORAS COMEÇO < FIM
            //CALCULO DURAÇAO
        //PRINTAR

        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal,duracao = 0;

        System.out.println("Digite o horario incial:");
        horaInicial = sc.nextInt();
        System.out.println("Digite o horario final:");
        horaFinal = sc.nextInt();

        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }else{
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + "horas");

    }
}
