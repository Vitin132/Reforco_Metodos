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
public class Atividade_éParReforço {
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        
        System.out.println("Digite um número inteiro: ");
        int num = tc.nextInt();
        
        boolean resultado = par(num);
        
        System.out.println("O número é par?");
        System.out.println(resultado);
        
        
        
    }

    public static boolean par(int num) {
       
        
            
            if(num % 2 == 0){
                
                return true;
                
            }else{
                return false;
            }
            
        
       
        
        
    }
    
    
    
    
}
