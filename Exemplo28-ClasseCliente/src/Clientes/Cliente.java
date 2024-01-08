/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.util.ArrayList;

/**
 *
 * @author Maria11
 */
public class Cliente extends Parceiro{
    private int NIF;
    
    public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int n) {
        NIF = n;
    }
    
    public Cliente (int nif, String n){
        NIF = nif;
        Nome = n;
    }
    
}
