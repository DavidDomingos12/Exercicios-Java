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
public class Exercicio1 {
    public static void main(String[] args)
    {
           Random numeroRandom = new Random(); //função para números aleatorios
           int linha = 0, col = 0, maior = 0;
           int[][] matriz = new int[4][4]; //30 L | 4 C
           
           //inserindo números aleatorios
           for(int i = 0; i < matriz.length; i++)
           {
               for(int j = 0; j < matriz[i].length; j++)
               {
                   matriz[i][j] = numeroRandom.nextInt(100);
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
           
           for(int i = 0; i < matriz.length; i++)
           {
               for(int j = 0; j < matriz[i].length; j++)
               {
                   if(matriz[i][j] > maior)
                   {
                       maior = matriz[i][j];    
                       linha = i;
                       col = j;
                   }
               }
           }
           System.out.print("");
           System.out.println("Maior valor: " + maior);
           System.out.println("Maior coluna: " + col);
           System.out.println("Maior linha: " + linha);
           
    }
}
