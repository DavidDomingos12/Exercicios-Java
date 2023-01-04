/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_Multidimensionais;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Exercicio3 {
    public static void main(String[] args)
    {
           Random numeroRandom = new Random(); //função para números aleatorios
           int qtdP = 0, qtdI = 0;
           int[][] matriz = new int[3][3]; //30 L | 4 C
           Scanner scan = new Scanner(System.in);
           //inserindo números aleatorios
           for(int i = 0; i < matriz.length; i++)
           {
               for(int j = 0; j < matriz[i].length; j++)
               {
                  System.out.println("Digite valores: ");
                  matriz[i][j] = scan.nextInt();
                  
                  if(matriz[i][j] % 2 == 0)
                  {
                     qtdP++; 
                  }
                  else
                  {
                     qtdI++;
                  }
               }
           }
           
           //Imprimindo matriz
           for(int i = 0; i < matriz.length; i++)
           {
               for(int j = 0; j < matriz[i].length; j++)
               {
               System.out.print(matriz[i][j] + " ");
               }           
           }
           System.out.println("");
           System.out.println("Quantidade de Pares: " + qtdP);               
           System.out.println("Quantidade de Impares: " + qtdI);
           
         


           
    }
}
