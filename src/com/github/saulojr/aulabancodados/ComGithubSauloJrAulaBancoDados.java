/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulojr.aulabancodados;

import java.util.Scanner;

/**
 *
 * @author Saulo Jr
 */
public class ComGithubSauloJrAulaBancoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i ;
        System.out.println("O que deseja fazer? ");
        System.out.println("[1] - CRUD Usuario");
        System.out.println("[2] - CRUD Tarefa");
        i = input.nextInt();
  
           switch (i){
               case 1:
                   System.out.println("[1] - Inserir Usuario");
                   System.out.println("[2] - Editar Usuario");
                   System.out.println("[3] - Listar Usuarios");
                   System.out.println("[4] - Excluir Usuario");
                   break;
               case 2:
                   System.out.println("[1] - Inserir Tarefa");
                   System.out.println("[2] - Editar Tarefa");
                   System.out.println("[3] - Listar Tarefas");
                   System.out.println("[4] - Concluir Tarefa");
                   System.out.println("[5] - Excluir Tarefa");
                   break;
               default :
                   System.out.println("Insira uma opcao valida!");
           }
        }    
}
