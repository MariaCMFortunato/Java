/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarefa01classecilindro;

/**
 *
 * @author Maria11
 */
public class Tarefa01ClasseCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cilindro c1 = new Cilindro();
        System.out.println("Altura do cilindro c1: " + c1.obterAltura());
        System.out.println("Raio do cilindro c1: " + c1.obterRaio());
        System.out.println("Volume do cilindro c1: " + c1.obterVolume() );
        c1.definirAltura(3);
        c1.definirRaio(6);
        System.out.println("\nNova altura do cilindro c1: " + c1.obterAltura());
        System.out.println("Novo raio do cilindro c1: " + c1.obterRaio());
        System.out.println("Novo volume do cilindro c1: " + c1.obterVolume());
        c1.reduzRaio();
        System.out.println("\nReduzir o raio do cilindro c1: ");
        System.out.println("Nova altura do cilindro c1: " + c1.obterAltura());
        System.out.println("Novo raio do cilindro c1: " + c1.obterRaio());
        System.out.println("Novo volume do cilindro c1: " + c1.obterVolume());
        System.out.println("\n");
        
        
        
        Cilindro c2 = new Cilindro(15, 10);
        System.out.println("Altura do cilindro c2: " + c2.obterAltura());
        System.out.println("Raio do cilindro c2: " + c2.obterRaio());
        System.out.println("Volume do cilindro c2: " + c2.obterVolume() );
        c2.definirAltura(5);
        c2.definirRaio(6);
        System.out.println("\nNova altura do cilindro c2: " + c2.obterAltura());
        System.out.println("Novo raio do cilindro c2: " + c2.obterRaio());
        System.out.println("Novo volume do cilindro c2: " + c2.obterVolume());
        c2.reduzRaio();
        System.out.println("\nReduzir o raio do cilindro c2: ");
        System.out.println("Nova altura do cilindro c2: " + c2.obterAltura());
        System.out.println("Novo raio do cilindro c2: " + c2.obterRaio());
        System.out.println("Novo volume do cilindro c21: " + c2.obterVolume());
        System.out.println("\n");    
    }
    
}
