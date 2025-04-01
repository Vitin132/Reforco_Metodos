/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades_Metodos2;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Atividade_ReforçoFOR {
    
    public static void main(String[] args) {
        
        Scanner tc =new Scanner(System.in);
        
        
        System.out.println("Digite um número inteiro:");
        int num = tc.nextInt();
        
        
        int resultado = tabuada(num);
        
        System.out.println(resultado);
        
        
        
    }

    public static int tabuada(int num) {
        int x = 0;
        
        for (int i = 0; i <= 10; i++) {
           
          x = num * i;
          System.out.println(num+ " x "+i+" = "+x);
            
            
        }
        
        
        
        return x;
    }
    
    
    
}
