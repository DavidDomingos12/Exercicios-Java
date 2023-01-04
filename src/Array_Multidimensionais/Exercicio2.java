/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_Multidimensionais;

import java.util.Random;

/**
 *
 * @author David
 */
public class Exercicio2 {
       public static void main(String[] args)
    {
           Random numeroRandom = new Random(); //função para números aleatorios
           int maiorL5 = 0, linha5 = 5, menorL5 = Integer.MAX_VALUE;
           int[][] matriz = new int[10][10]; //30 L | 4 C
           
           //inserindo números aleatorios
           for(int i = 0; i < matriz.length; i++)
           {
               for(int j = 0; j < matriz[i].length; j++)
               {
                   matriz[i][j] = numeroRandom.nextInt(10);
               }
           }
           
           //Imprimindo matriz
           for(int i = 0; i < matriz.length; i++)
           {
               for(int j = 0; j < matriz[i].length; j++)
               {
               System.out.print(matriz[i][j] + " ");
               }
               System.out.println("");
           }
           
           for(int j = 0; j < matriz[5].length; j++)
           {
               if(matriz[linha5][j] > maiorL5)
               {
                   maiorL5 = matriz[5][j];
               }
               if(matriz[linha5][j] < menorL5)
               {
                   menorL5 = matriz[linha5][j];
               }
           }
           System.out.print("");
           System.out.println("Maior valor da linha 5: " + maiorL5);
           System.out.println("Menor valor da linha 5: " + menorL5);   


           
    }
}
