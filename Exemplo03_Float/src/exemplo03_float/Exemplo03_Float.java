/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo03_float;

/**
 *
 * @author Maria11
 */
public class Exemplo03_Float {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float Y = 3.4e38f; // equivale a X 10^= 3.4X10^38
        System.out.println(Y);
        
        int Z = (int)Y;
        System.out.println(Z);
        double c;
        c = 1.79e308; //1.78
                //1.79769931348623157
        System.out.println(c);
        
        int a = 3;
        int b = 2;
        float quociente = (float)a / (float) b;
        System.out.println("Quociente:" + quociente );
                
    }
    
}
