/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Maria11
 */
public class Pessoa {
    protected String Nome;
    protected String Morada;

    public String getNome() {
        return Nome;
    }

    public void setNome(String n) {
        Nome = n;
    }

    public String getMorada() {
        return Morada;
    }

    public void setMorada(String m) {
        Morada = m;
    }

    public Pessoa() {
        Nome = "";
        Morada = "";
    }

    public Pessoa(String n, String m) {
        Nome = n;
        Morada = m;
    }
    
    
    
    
            
}
