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
public class Atividade_ReforçoIF1 {
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite o seu nome:");
        String nome = tc.nextLine();
        
        //String resultado = verificarNome(nome);
        
        
        //System.out.println(resultado);
        
       verificarNome(nome);
        
    }

    public static void verificarNome(String nome) {
        
        
        
            
            if(nome.length() >= 5){
                System.out.println("O nome contém 5 ou mais caracteres.");
                
            }else{
                System.out.println("O nome não contém 5 ou mais caraceres.");
            }
            
            
            
        
            
        
        
        
        
    }
    
    
    
    
    
}
