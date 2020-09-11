/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulojr.aulabancodados;


/**
 *
 * @author Saulo Jr
 */
public class Usuario {

    private int usu_id;
    private String usu_nome;
    private String usu_email;
    private String usu_cargo;

    public Usuario(int i, String nome, String mail, String cargo){
        this.usu_nome = nome;
        this.usu_email = mail;
        this.usu_cargo = cargo;
        this.usu_id = i;
    }
    
    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public String getUsu_nome() {
        return usu_nome;
    }

    public void setUsu_nome(String usu_nome) {
        this.usu_nome = usu_nome;
    }

    public String getUsu_email() {
        return usu_email;
    }

    public void setUsu_email(String usu_email) {
        this.usu_email = usu_email;
    }

    public String getUsu_cargo() {
        return usu_cargo;
    }

    public void setUsu_cargo(String usu_cargo) {
        this.usu_cargo = usu_cargo;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.usu_nome + " | Email: " + this.usu_email + " | cargo: " + this.usu_cargo;
    }
}
