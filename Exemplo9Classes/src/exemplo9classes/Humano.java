/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo9classes;

/**
 * @author Maria11
 */
public class Humano {
    protected String nome;
    protected int altura;
    protected int peso; 
    
public Humano(){
    altura = 173;
    peso = 90;
    nome = "Soldado Desconhecido";
}
public Humano (int a, int p, String n){
    altura = a;
    peso = p;
    nome = n;
}
public void Cumprimenta(){
    System.out.println("Bonga !!!!!!!");
}

 public String ObterNome(){
     return nome;
 }
 public void DefinirNome(String n){
     nome = n;
 }
 public int ObterAltura(){
     return altura;
 }
 
 public void DefinirAltura(int a){
     altura = a; 
 }
 
//  public int ObterPeso(){
//     return peso;
// }
//  
// public void DefiniPeso(int n){
//     altura = n; 
//} pode ser feito automaticamente

    public int getPeso() {
        return peso;
    }

    public void setPeso(int p) {
        peso = p;
    }
 
}
