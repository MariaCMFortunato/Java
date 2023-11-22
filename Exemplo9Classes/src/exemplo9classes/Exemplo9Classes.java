/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo9classes;

import Entidades.ClientePremium;
import Entidades.Cidadao;
import Entidades.Cliente;

/**
 *
 * @author Maria11
 */
public class Exemplo9Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Humano alfredo;
        alfredo =  new Humano(190, 200, "Joaquim");
        System.out.println(alfredo.ObterNome());
        System.out.println(alfredo.ObterAltura());
        System.out.println(alfredo.getPeso()+"\n");
        
        alfredo.DefinirNome("Alfredo");
        System.out.println(alfredo.ObterNome());
        alfredo.Cumprimenta();
        System.out.println("\n");

        Cidadao c1 = new Cidadao("CC 123", "Joaquinzinho", 210, 220);
        c1.DefinirNome(("Alfredozinho"));
        c1.setPeso(100);
        c1.DefinirAltura(200);
        c1.setIdent("Passaporte 1345ZA");     
        String texto = c1.ObterNome();
        System.out.println("Nome mais pessoal da c1: " + texto );
        int p = c1.getPeso();
        System.out.println("Peso da c1: " + p );
        int f = c1.ObterAltura();
        System.out.println("Altura da c1: " + f );
        String i = c1.getIdent();
        System.out.println("Identificacao da c1: " + i );
        c1.Cumprimenta();
        System.out.println("\n");
       
        Cliente cliente1 = new Cliente();
        cliente1.DefinirNome("Joana Araujo");
        cliente1.DefinirAltura(160);
        cliente1.setPeso(60);
        cliente1.setIdent("CC 100300400");
        cliente1.setNif(200312456);
       
        System.out.println("Nome mais pessoal da cliente1: "+ cliente1.ObterNome());
        System.out.println("Peso da cliente1: " + cliente1.getPeso());
        System.out.println("Altura da cliente1: " + cliente1.ObterAltura());
        System.out.println("Identificação da cliente1: " + cliente1.getIdent());
        System.out.println("NIF da cliente1: " + cliente1.getNif());
        cliente1.Cumprimenta();
        System.out.println("\n");
        
        ClienteHabitual cliente2 = new ClienteHabitual();
        cliente2.DefinirNome("Sofia Silva");
        cliente2.DefinirAltura(170);
        cliente2.setPeso(55);
        cliente2.setIdent("CC 300200500");
        cliente2.setNif(199999999);
        cliente2.setCtFidelidade(123456789);
       
        System.out.println("(Nome mais pessoal da cliente2: "+ cliente2.ObterNome());
        System.out.println("Peso da cliente2: " + cliente2.getPeso());
        System.out.println("Altura da cliente2: " + cliente2.ObterAltura());
        System.out.println("Identificação da cliente2: " + cliente2.getIdent());
        System.out.println("NIF da cliente2: " + cliente2.getNif());
        System.out.println("Cartao de Fuidelidade da cliente2: " + cliente2.getCtFidelidade());
        cliente2.Cumprimenta();
        System.out.println("\n");
        
        ClientePremium cliente3 = new ClientePremium();
        cliente3.DefinirNome("Marcio Antunes");
        cliente3.DefinirAltura(180);
        cliente3.setPeso(80);
        cliente3.setIdent("CC 400100600");
        cliente3.setNif(300124589);
        cliente3.setCtFidelidade(987654321);
        cliente3.setEstrelas(5);

        System.out.println("(Nome mias pessoal da cliente3: "+ cliente3.ObterNome());
        System.out.println("Peso da cliente3: " + cliente3.getPeso());
        System.out.println("Altura da cliente3: " + cliente3.ObterAltura());
        System.out.println("Identificação da cliente3: " + cliente3.getIdent());
        System.out.println("NIF da cliente: " + cliente3.getNif());
        System.out.println("Cartao de fidelidade da cliente3: " + cliente3.getCtFidelidade());
        System.out.println("Numero de estrelas: " + cliente3.getEstrelas());
        cliente3.Cumprimenta();
        System.out.println("\n");
        
        float x = 9.0f;
        float y = 43.2f;
        float z = x * y;
        float w = (float)Math.PI;
        System.out.println(z);
        System.out.println(w);
        
        
    }
    
}
