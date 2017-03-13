/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6.serpent.listener;

import java.awt.event.KeyEvent;
import s6.serpent.fenetre.Jeux;

/**
 *
 * @author Lai Christophe
 */
public class Keylistener implements java.awt.event.KeyListener {

    public Jeux jeux;

    public Keylistener(Jeux j) {
        jeux = j;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int i = e.getKeyCode();

        if ((i == KeyEvent.VK_A || i == KeyEvent.VK_LEFT)) {
            System.out.println("Gauche");
            if (jeux.getDirection() != jeux.getDROITE()) {
                jeux.setDirection(jeux.getGAUCHE());
            }
        }

        if ((i == KeyEvent.VK_D || i == KeyEvent.VK_RIGHT)) {
            System.out.println("Droite");
            if (jeux.getDirection() != jeux.getGAUCHE()) {
                jeux.setDirection(jeux.getDROITE());
            }
        }

        if ((i == KeyEvent.VK_W || i == KeyEvent.VK_UP)) {
            System.out.println("Haut");
            if (jeux.getDirection() != jeux.getBAS()) {
                jeux.setDirection(jeux.getHAUT());
            }
        }

        if ((i == KeyEvent.VK_S || i == KeyEvent.VK_DOWN)) {
            System.out.println("Bas");
            if (jeux.getDirection() != jeux.getHAUT()) {
                jeux.setDirection(jeux.getBAS());
            }
        }
        if ((i == KeyEvent.VK_N)) {
            System.out.println("Nouvelle Prois");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
