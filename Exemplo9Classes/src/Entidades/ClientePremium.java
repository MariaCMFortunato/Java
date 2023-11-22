/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import exemplo9classes.ClienteHabitual;

/**
 *
 * @author Maria11
 */
public class ClientePremium extends ClienteHabitual{
    private int estrelas;
    
    public ClientePremium(String i, String n, int a, int p, int ni, int cf, int e){
        estrelas = e;
        cartaoFidelidade = cf;
        nif = ni;
        ident=i;
        nome = n;
        altura = a;
        peso = p;
    }
    
    public void Cumprimenta(){
        System.out.println("Olá Joinhas!!!!");
    }
    public ClientePremium(){
        
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int e) {
        estrelas = estrelas;
    }
    
    
    
}
