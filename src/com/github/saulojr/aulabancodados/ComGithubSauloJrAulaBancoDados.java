/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulojr.aulabancodados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Saulo Jr
 */
public class ComGithubSauloJrAulaBancoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        int i, u = 1, t, contU = 0, contT = 0;
        LinkedList<Usuario> usuarios = new LinkedList<>();
        LinkedList<Tarefa> tarefas = new LinkedList<>();
        do {
            System.out.println("O que deseja fazer? ");
            System.out.println("[1] - CRUD Usuario");
            System.out.println("[2] - CRUD Tarefa");

            i = input.nextInt();
            switch (i) {
                case 1:
                    do {
                        System.out.println("[1] - Inserir Usuario");
                        System.out.println("[2] - Editar Usuario");
                        System.out.println("[3] - Listar Usuarios");
                        System.out.println("[4] - Excluir Usuario");
                        System.out.println("[0] - Voltar para tele inicial");

                        u = input.nextInt();
                        switch (u) {
                            case 1:
                                System.out.println("Insira seu nome, email, e cargo, respectivamente");
                                String nome,
                                 email,
                                 cargo;
                                nome = input2.readLine();
                                email = input.next();
                                cargo = input2.readLine();
                                usuarios.add(new Usuario(contU++, nome, email, cargo));
                                System.out.println(usuarios.getLast());
                                break;
                            case 2:
                                System.out.println("Insira o nome de quem gostaria de editar");
                                for (Usuario cada : usuarios) {
                                    if (cada.getUsu_nome().equals(input.next())) {
                                        System.out.println("Insira seu nome, email, e cargo, respectivamente para alterar " + cada.getUsu_nome());
                                        nome = input2.readLine();
                                        email = input.next();
                                        cargo = input2.readLine();
                                        usuarios.set(cada.getUsu_id(), new Usuario(cada.getUsu_id(), nome, email, cargo));
                                        System.out.println(usuarios.get(cada.getUsu_id()));
                                    }
                                }
                                break;
                            case 3:
                                for (Usuario cada : usuarios) {
                                    System.out.println(cada.toString());
                                }
                                break;
                            case 4:
                                System.out.println("Insira o nome do usuario a ser deletado");
                                String excluir = input.next();
                                boolean existe = false;
                                for (Usuario cada : usuarios) {
                                    if (cada.getUsu_nome().equals(excluir)) {
                                        System.out.println("Usuario com " + usuarios.remove(cada.getUsu_id()) + " foi REMOVIDO");
                                        break;
                                    } else {
                                        existe = true;
                                    }
                                }
                                if (existe) {
                                    System.out.println("Usuario nao encontrado!");
                                }
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Insira uma opcao valida!");
                                break;
                        }
                    } while (u != 0);
                    break;
                case 2:
                    if (usuarios.isEmpty()) {
                        System.out.println("Eh necessario criar um usuario primeiro !");
                        break;
                    } else {
                        do {
                            System.out.println("[1] - Inserir Tarefa");
                            System.out.println("[2] - Editar Tarefa");
                            System.out.println("[3] - Listar Tarefas");
                            System.out.println("[4] - Concluir Tarefa");
                            System.out.println("[5] - Excluir Tarefa");
                            System.out.println("[0] - Voltar para tele inicial");

                            t = input.nextInt();
                            switch (t) {
                                case 1:
                                    System.out.println("Primeiro, qual usuario essa tarefa esta relacionada?");
                                    for (Usuario cada : usuarios) {
                                        System.out.println(cada.toString());
                                    }
                                    System.out.println("Insira o nome do usuario que deseja relacionar!");
                                    String usu = input.next();
                                    boolean existe = false;
                                    for (Usuario cada : usuarios) {
                                        if (cada.getUsu_nome().equals(usu)) {

                                            String titulo, descri;
                                            System.out.println("Usuario encontrado!\nSegundo, insira o titulo e descricao da tarefa!");
                                            titulo = input2.readLine();
                                            descri = input2.readLine();
                                            tarefas.add(new Tarefa(contT++, titulo, descri, cada));
                                            System.out.println(tarefas.getLast());
                                            break;
                                        } else {
                                            existe = true;
                                        }
                                    }
                                    if (existe) {
                                        System.out.println("Usuario nao encontrado!");
                                    }
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    for (Tarefa tarefa : tarefas) {
                                        System.out.println(tarefa.toString());
                                    }
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Insira uma opcao valida!");
                                    break;
                            }
                        } while (t != 0);
                        break;
                    }
                default:
                    System.out.println("Insira uma opcao valida!");
            }

        } while (true);

    }
}
