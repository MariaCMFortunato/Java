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
public class Colaborador extends Parceiro{
    private int CC;
    
    public static ArrayList<Colaborador> listaColaborador = new ArrayList<Colaborador>();

    public int getCC() {
        return CC;
    }

    public void setCC(int C) {
        CC = C;
    }

    public Colaborador(int C, String n) {
       CC = C;
       Nome = n;
    }
    
    
    
}

