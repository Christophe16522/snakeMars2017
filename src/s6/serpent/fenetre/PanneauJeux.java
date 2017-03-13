/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6.serpent.fenetre;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JOptionPane;
import s6.serpent.listener.Keylistener;
import s6.serpent.mapping.Proie;
import s6.serpent.mapping.Serpent;

/**
 *
 * @author Lai Christophe
 */
@SuppressWarnings("serial")

public class PanneauJeux extends javax.swing.JPanel {

    /**
     * Creates new form PanneauJeux
     */
    //Serpent perso
    public Serpent teteSerpent = new Serpent();
    //Serpent Ennemie
    public Serpent sE = new Serpent();

    public Proie pr = new Proie((int) (Math.random() * (590 - 1 + 1)) + 1, (int) (Math.random() * (440 - 1 + 1)) + 1);

    private static Rectangle rectserpent;
    private static Rectangle rectserpentEnemie;

    private static Rectangle rectprois;
    public Jeux jeux;

    public PanneauJeux(Jeux j) {
        jeux = j;
        this.setLayout(null);
        this.addKeyListener(new Keylistener(jeux));
    }
    public static final Color GREEN = new Color(1666073);

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //Couleur de fond
        g.setColor(GREEN);
        g.fillRect(0, 0, 600, 450);

        //Serpent
        g.setColor(Color.BLACK);
        g.fillRect(teteSerpent.getPosX(), teteSerpent.getPosY(), 10, 10);
        Rectangle rectserpent = new Rectangle(teteSerpent.getPosX(), teteSerpent.getPosY(), 10, 10);

        //Rambo Serpent
        g.setColor(Color.darkGray);
        for (Serpent serp : jeux.ramboserpent) {
            g.fillOval(serp.getPosX(), serp.getPosY(), 10, 10);
            Rectangle vatany = new Rectangle(serp.getPosX(), serp.getPosY(), 10, 10);
        }

        jeux.ramboserpent.add(new Serpent(teteSerpent.getPosX(), teteSerpent.getPosY()));
        if (jeux.ramboserpent.size() > jeux.isanrambony) {
            jeux.ramboserpent.remove(0);
        }

        //Serpent Ennemie 
//        g.setColor(Color.WHITE);
//        g.fillRect(sE.getPosX(), sE.getPosY(), 10, 10);
//        Rectangle rectserpentEnemie = new Rectangle(sE.getPosX(), sE.getPosY(), 10, 10);
//        
        //Proie a voir le 13 mars 2016 inteligence artificiel
        g.setColor(Color.PINK);
        g.fillOval(pr.getPosX(), pr.getPosY(), 10, 10);
        Rectangle rectprois = new Rectangle(pr.getPosX(), pr.getPosY(), 10, 10);

        //Collision tete serpent et proi
        if (rectserpent.intersects(rectprois)) {
            int scr = jeux.getScore() + 1;
            jeux.isanrambony++;
            int niv = jeux.getNiveau();
            if (jeux.getScore() % 2 == 0) {
                jeux.setNiveau(niv + 1);
            }
            jeux.setScore(scr);
            jeux.getLabelscore().setText("Score : " + jeux.getScore());
            jeux.getLabelniveau().setText("Niveau : " + jeux.getNiveau());
            pr.setPosX((int) (Math.random() * (590 - 1 + 1)) + 1);
            pr.setPosY((int) (Math.random() * (440 - 1 + 1)) + 1);
            System.out.println("Proie au X :" + pr.getPosX() + " Y :" + pr.getPosY());
        }
        //Collision serpent et bordure terrain
        if (teteSerpent.getPosX() > 590 || teteSerpent.getPosX() < 0 || teteSerpent.getPosY() > 440 || teteSerpent.getPosY() < 0) {
            System.err.println("collision");
            jeux.getR1().interupt();
            JOptionPane jop = new JOptionPane();

            int option = jop.showConfirmDialog(null, "Voulez-vous Recommencer ?", "Perdu", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (option == JOptionPane.YES_OPTION) {
                jeux.dispose();
                new Jeux().setVisible(true);
            } else if (option == JOptionPane.NO_OPTION) {
                jeux.dispose();
                new Menu().setVisible(true);
            }
        }
//        for (Serpent serp : jeux.ramboserpent) {
//            if (s.equals(new Serpent(s.getPosX(), s.getPosY()))) {
//                //atao true ra tsy asina colision am vatany
//                jeux.getR1().interupt();
//            }
//        }
//        if(jeux.rambo(s.getPosX(), s.getPosY())){
//            jeux.getR1().interupt();
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
