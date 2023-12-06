/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo18_combobox;

/**
 *
 * @author Maria11
 */
public class Exemplo18_ComboBox {
    static Classe_Janela2 c1 = new Classe_Janela2();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        c1.setVisible(true);
        c1.setLocation(500, 200);
        
        Classe_Janela f1;//instancia a classe janela
        f1 = new Classe_Janela();// metodo construtior
        f1.setVisible(true);
        f1.setLocation(500, 50);
    }
    
}
