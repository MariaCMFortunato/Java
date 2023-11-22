/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Maria11
 */
public class Cliente extends Cidadao{
    protected int nif;

    public Cliente (String i, String n, int a, int p, int ni){
     nif = ni;
     ident = i;
     nome = n;
     altura = a;
     peso = p;
    }
    
    @Override
    public void Cumprimenta(){
        System.out.println("Olá , Boa tarde!!");
    }
    public Cliente(){
        
    }
    
    public int getNif() {
        return nif;
    }

    public void setNif(int n) {
        nif = n;
    }
}
