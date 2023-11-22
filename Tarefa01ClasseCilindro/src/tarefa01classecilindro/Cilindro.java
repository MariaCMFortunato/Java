/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefa01classecilindro;

import static java.lang.Math.pow;

/**
 *
 * @author Maria11
 */
public class Cilindro {
    
    private float raio;
    private float altura;

    public Cilindro (){
        altura = 2;
        raio = 1;
    }
    
    public Cilindro (float a, float r){
        altura = a;
        raio = r;
    }
    
    public float obterRaio() {
        return raio;
    }

    public void definirRaio(float r) {
        raio = r;
    }

    public float obterAltura() {
        return altura;
    }

    public void definirAltura(float a) {
        altura = a;
    }
    
    public double obterVolume(){
        double volume = (Math.PI * pow(raio,2)*altura);
        return volume;
    }
    
    public float reduzRaio(){
        return raio/=2;
    }
}
