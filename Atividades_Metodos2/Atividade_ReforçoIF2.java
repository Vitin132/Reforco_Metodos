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
public class Atividade_ReforçoIF2 {
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome = tc.nextLine();
        
        System.out.println("Digite o turno em que você estuda/trabalha:");
        String turno = tc.nextLine();
        
        verificarNomeTurno(nome, turno);
        
        System.out.println(verificarNomeTurno(nome, turno));
        
        
        
        
    }

    public static String verificarNomeTurno(String nome, String turno) {
        
        if(turno.equalsIgnoreCase("Manha")){
            
            return "Olá "+nome+". Espero que voçê tenha uma ótima manhã!";
            
        }else if(turno.equalsIgnoreCase("Tarde")){
            return "Olá "+nome+". Espero que voçê tenha uma ótima tarde!";
            
        }else if(turno.equalsIgnoreCase("Noite")){
            
            return "Olá "+nome+". Espero que voçê tenha uma ótima noite!";
        }else{
            return "Turno inválido!";
        }
        
        
        
        
    }
    
    
    
    
}
