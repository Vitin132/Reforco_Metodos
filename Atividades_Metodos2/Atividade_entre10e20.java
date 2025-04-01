/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades_Metodos2;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Atividade_entre10e20 {
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        ArrayList<String> cores = adicionarCores(tc);
        
        verificarCores(tc,cores);
        
        
    }

    public static ArrayList<String> adicionarCores(Scanner tc) {
        
        ArrayList<String> cores = new ArrayList<>();
        
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a "+i+" cor:");
            
            String cor = tc.nextLine();
            cores.add(cor);
            
            
            
        }
        System.out.println(cores);
        
        return cores;
        
        
    }

    public static void verificarCores(Scanner tc, ArrayList<String> cores) {
            
        System.out.println("Digite uma cor para verificar se está na lista: ");
        String corParaVerificar = tc.nextLine();
        System.out.println("Contém "+corParaVerificar+ "? "+cores.contains(corParaVerificar));
        
        
    }
    
    
    
}
