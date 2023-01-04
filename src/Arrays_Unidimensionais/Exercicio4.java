/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_Unidimensionais;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Exercicio4 {
     public static void main(String[] args)
    {
        /*
            Crie um vetor para receber o cálculo de A + B
        */
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        
       for(int i = 0; i < vetorA.length; i++)
       {
           System.out.println("Digite um valor para o vetor A: ");
           vetorA[i] = scan.nextInt();
       }
       for(int i = 0; i < vetorA.length; i++)
       {
           System.out.println("Digite um valor para o vetor B: ");
           vetorB[i] = scan.nextInt();
       }
       for(int i = 0; i < vetorC.length; i++)
       {
           vetorC[i] = vetorA[i] + vetorB[i];
           System.out.println("A soma é igual a: " + vetorC[i]);
           
       }
    }
}
