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
public class Tarefa {

private int tarefa_id;
private char tarefa_status;
private Usuario tarefa_usuario;
private String tarefa_titulo;
private String tarefa_descricao;

    public int getTarefa_id() {
        return tarefa_id;
    }

    public void setTarefa_id(int tarefa_id) {
        this.tarefa_id = tarefa_id;
    }

    public char getTarefa_status() {
        return tarefa_status;
    }

    public void setTarefa_status(char tarefa_status) {
        this.tarefa_status = tarefa_status;
    }

    public Usuario getTarefa_usuario() {
        return tarefa_usuario;
    }

    public void setTarefa_usuario(Usuario tarefa_usuario) {
        this.tarefa_usuario = tarefa_usuario;
    }

    public String getTarefa_titulo() {
        return tarefa_titulo;
    }

    public void setTarefa_titulo(String tarefa_titulo) {
        this.tarefa_titulo = tarefa_titulo;
    }

    public String getTarefa_descricao() {
        return tarefa_descricao;
    }

    public void setTarefa_descricao(String tarefa_descricao) {
        this.tarefa_descricao = tarefa_descricao;
    }

    
}
