/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo26_bolinhas;
import javax.swing.JFrame;
/**
 *
 * @author Maria11
 */
public class Exemplo26_Bolinhas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Olha a bolinha");// a string aparece como título da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new JPanelBolinhas());
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
