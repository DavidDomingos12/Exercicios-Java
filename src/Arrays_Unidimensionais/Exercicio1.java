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
public class Exercicio1 {
    public static void main(String[] args)
    {
        /*
            Criar um vetor A e B com a mesma quantidade de elementos e os mesmos valores.
            B[i] = A[i]
        */
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[4];
        int[] vetorB = new int[vetorA.length];
        
       for(int i = 0; i < vetorA.length; i++)
       {
           System.out.println("Digite um valor para o vetor A: ");
           vetorA[i] = scan.nextInt();
           vetorB[i] = vetorA[i];
       }
       for(int i = 0; i < vetorA.length; i++)
       {
           System.out.println(" -- Valores -- ");
           System.out.println("Valore do vetor A: " + vetorA[i]);
           System.out.println("Valore do vetor B: " + vetorB[i]);

       }
    }
}
