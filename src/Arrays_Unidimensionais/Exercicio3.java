/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_Unidimensionais;

/**
 *
 * @author David
 */
public class Exercicio3 {
    public static void main(String[] args)
    {
        /*
        Criar um vetor A e B com a mesma quantidade de elementos e os mesmos valores.
        Sendo que B devera ter o quadrado dos elementos de A, ou seja, B[i] = A[i] * A[i]
        */      
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        
        vetorA[0] = 5;
        vetorA[1] = 6;
        vetorA[2] = 7;
        vetorA[3] = 8;
        vetorB[0] = vetorA[0];
        vetorB[1] = vetorA[1];
        vetorB[2] = vetorA[2];
        vetorB[3] = vetorA[3];
        
        for(int i = 0; i < vetorA.length; i++)
        {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("Vetor B = " + vetorB[i]);
        }
        
    }
}
