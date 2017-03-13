/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6.serpent.fenetre;

import javax.swing.JFrame;
import s6.serpent.mapping.Serpent;

/**
 *
 * @author Lai Christophe
 */
class RunnableSerpent implements Runnable {

    private Thread t;
    private String threadName = "test";
    public Serpent serpent;
    public PanneauJeux panneauJeux;
    public Jeux jeux;
    private boolean mande = true;

    public boolean isMande() {
        return mande;
    }

    public void setMande(boolean mande) {
        this.mande = mande;
    }

    RunnableSerpent(Serpent s, PanneauJeux p, Jeux j, Boolean b) {
        serpent = s;
        panneauJeux = p;
        jeux = j;
        mande = b;
//        System.out.println("Serpent PosX " + serpent.getPosX());
//        System.out.println("Serpent PosY " + serpent.getPosY());
    }

    public void run() {
//        System.out.println("Running " + threadName);
        try {
            int i = 0;
            while (mande) {
                panneauJeux.repaint();
               
                if (jeux.getDirection() == jeux.getGAUCHE()) {
                    serpent.setPosX(serpent.getPosX() - 10);
                }
                if (jeux.getDirection() == jeux.getDROITE()) {
                    serpent.setPosX(serpent.getPosX() + 10);
                }
                if (jeux.getDirection() == jeux.getHAUT()) {
                    serpent.setPosY(serpent.getPosY() - 10);
                }
                if (jeux.getDirection() == jeux.getBAS()) {
                    serpent.setPosY(serpent.getPosY() + 10);
                }
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }

        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + serpent.getPosX());
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();

        }
    }

    public void interupt() {
        mande = false;
    }
}

public class ThreadDirection {

//    public static void main(String args[]) {
//        Serpent s = new Serpent();
//
//        PanneauJeux p = new PanneauJeux(new Jeux());
//        RunnableSerpent R1 = new RunnableSerpent(s, p, new Jeux(), false);
//        R1.start();
//
////      RunnableSerpent R2 = new RunnableSerpent( "Thread-2");
////      R2.start();
//    }
}
