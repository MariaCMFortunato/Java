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
public class Classe_Bola {
    protected float ballX;
    public float ballSpeedX;
    public float Radius;
    protected float ballY;
    public float ballSpeedY;
    
    
    Classe_Bola(){
        ballX = 150;
        int randomNum = ThreadLocalRandom.current().nextInt(-5, 5);
        ballSpeedX = randomNum;
        
        ballY = 400;
        int randomNum2 = ThreadLocalRandom.current().nextInt(-5, 5);
        ballSpeedY = randomNum2;
        
        Radius = 20;
    }

    public float getBallSpeedX() {
        return ballSpeedX;
    }

    public void setBallSpeedX(float s) {
        ballSpeedX = s;
    }

    public float getBallX() {
        return ballX;
    }

    public void setBallX(float b) {
        ballX = b;
    }

    public float getBallY() {
        return ballY;
    }

    public void setBallY(float b) {
        ballY = b;
    }

    public float getBallSpeedY() {
        return ballSpeedY;
    }

    public void setBallSpeedY(float s) {
        ballSpeedY = s;
    }
    
}
