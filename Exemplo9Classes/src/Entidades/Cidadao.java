/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import exemplo9classes.Humano;

/**
 *
 * @author Maria11
 */
public class Cidadao extends Humano {
    protected String ident;
    
    public Cidadao(String i, String n, int a, int p){
        ident=i;
        nome = n;
        altura = a;
        peso = p;
    }
    public Cidadao(){
        
    }

    @Override
    public void Cumprimenta(){
        System.out.println("Olá Cidadão!!");
    }
    
    public String getIdent() {
        return ident;
    }

    public void setIdent(String i) {
        int b = altura;
        ident = i;
    }
    
    
    
}
