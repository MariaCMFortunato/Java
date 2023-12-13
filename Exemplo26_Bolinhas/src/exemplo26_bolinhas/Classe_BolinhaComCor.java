/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo26_bolinhas;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Maria11
 */
public class Classe_BolinhaComCor extends Classe_Bola
{
    
    private int r;
    private int g;
    private int b;
    
    
    Classe_BolinhaComCor()
    {
        //herda p método construtor da classe mãe
        r=ThreadLocalRandom.current().nextInt(0, 255);
        g=ThreadLocalRandom.current().nextInt(0, 255);
        b=ThreadLocalRandom.current().nextInt(0, 255);
        
    }

    public int getR() {
        return r;
    }

    public void setR(int red) {
        r = red;
    }

    public int getG() {
        return g;
    }

    public void setG(int green) {
        g = green;
    }

    public int getB() {
        return b;
    }

    public void setB(int blue) {
        b = blue;
    }
    
    
}
