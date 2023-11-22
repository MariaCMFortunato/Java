/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo9classes;

import Entidades.Cliente;

/**
 *
 * @author Maria11
 */
public class ClienteHabitual extends Cliente
{
    protected int cartaoFidelidade;
    
    public ClienteHabitual(String i, String n, int a, int p, int ni, int cf){
        cartaoFidelidade = cf;
        nif = ni;
        ident=i;
        nome = n;
        altura = a;
        peso = p;
    }
    public ClienteHabitual(){
        
    }
    
    @Override
    public void Cumprimenta(){
        System.out.println("Olá Malta!!!");
    }

    public int getCtFidelidade() {
        return cartaoFidelidade;
    }

    public void setCtFidelidade(int cf) {
        cartaoFidelidade = cf;
    }
    
}

