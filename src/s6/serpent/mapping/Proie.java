/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6.serpent.mapping;

/**
 *
 * @author Lai Christophe
 */
public class Proie {
    private int posX;
    private int posY;

    public Proie(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Proie() {
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
}
