/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo08_strings;

/**
 *
 * @author Maria11
 */
public class Exemplo08_Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String metade1;
        String metade2;
        String total;
        
        metade1 = "corona";
        System.out.println(metade1);
        
        metade2 = "virus";
        System.out.println(metade2);
        
        total= metade1+metade2;
        System.out.println(total);
        
        int c = total.length();
        System.out.println(c);
        
        String pequenina = total.substring(3, 7);
        System.out.println(pequenina);
        
        String depois = total.replaceAll("ona","ina");
        System.out.println(depois);
        
        int igual = depois.compareToIgnoreCase("corinavirus");
        System.out.println(igual);
        
        int indice = depois.compareToIgnoreCase("corinavirus");
        System.out.println(indice);
        
        //depois = depois.toUpperCase();
        //System.out.println(depois);
        
        /*char primeiroCaracter = depois.charAt(0);
        String sPrimeiroCaracter = String.valueOf(primeiroCaracter);
        depois = depois.replaceFirst(sPrimeiroCaracter, sPrimeiroCaracter.toUpperCase());
        System.out.println(depois);*/
        
        depois = depois.substring(0,1).toUpperCase()+ depois.substring(1);
        System.out.println(depois);
        
    }
    
}
