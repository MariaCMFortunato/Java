/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo17_bola;

/**
 *
 * @author Maria11
 */
public class Exemplo17_Bola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            Classe_Java f1;
            f1 = new Classe_Java();
            f1.setVisible(true);
            f1.setLocation(20, i*351);
        }
        
        
        
                 
        Classe_Config f2;
        f2 = new Classe_Config();
        f2.setVisible(true);
        f2.setLocation(400, 10);
    }
    
}
