/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6.serpent.fenetre;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import s6.serpent.listener.Keylistener;
import s6.serpent.mapping.Serpent;

/**
 *
 * @author Lai Christophe
 */
public class Jeux extends javax.swing.JFrame {

    /**
     * Creates new form Jeux
     */
    public PanneauJeux p = new PanneauJeux(this);
    public ArrayList<Serpent> ramboserpent = new ArrayList<>();
    public int isanrambony;
    private int score = -1;
    private int niveau = 0;
    private final int GAUCHE = 1;
    private final int DROITE = 2;
    private final int HAUT = 3;
    private final int BAS = 4;
    private int direction = DROITE;
    private boolean run = true;
    private RunnableSerpent R1 = new RunnableSerpent(p.teteSerpent, p, this, run);

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public RunnableSerpent getR1() {
        return R1;
    }

    public void setR1(RunnableSerpent R1) {
        this.R1 = R1;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public int getGAUCHE() {
        return GAUCHE;
    }

    public int getDROITE() {
        return DROITE;
    }

    public int getHAUT() {
        return HAUT;
    }

    public int getBAS() {
        return BAS;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public JLabel getLabelscore() {
        return labelscore;
    }

    public void setLabelscore(JLabel labelscore) {
        this.labelscore = labelscore;
    }

    public JLabel getLabelniveau() {
        return labelniveau;
    }

    public void setLabelniveau(JLabel labelniveau) {
        this.labelniveau = labelniveau;
    }

    public Jeux() {
        //this.run = true;
        this.setContentPane(p);
        this.setResizable(false);
        initComponents();
        this.setFocusable(true);
        this.addKeyListener(new Keylistener(this));
        ramboserpent.clear();
        isanrambony = 0;
        //Serpent s = new Serpent();
        R1.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        haut = new javax.swing.JButton();
        labelscore = new javax.swing.JLabel();
        labelniveau = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sakafo = new javax.swing.JButton();
        droite = new javax.swing.JButton();
        gauche = new javax.swing.JButton();
        bas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        haut.setBackground(new java.awt.Color(255, 255, 255));
        haut.setText("H");
        haut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hautActionPerformed(evt);
            }
        });

        labelscore.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelscore.setText("Score : ");

        labelniveau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelniveau.setText("Niveau :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Temps :");

        sakafo.setBackground(new java.awt.Color(255, 255, 255));
        sakafo.setText("P");
        sakafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sakafoActionPerformed(evt);
            }
        });

        droite.setBackground(new java.awt.Color(255, 255, 255));
        droite.setText("D");
        droite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                droiteActionPerformed(evt);
            }
        });

        gauche.setBackground(new java.awt.Color(255, 255, 255));
        gauche.setText("G");
        gauche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaucheActionPerformed(evt);
            }
        });

        bas.setBackground(new java.awt.Color(255, 255, 255));
        bas.setText("B");
        bas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Commandes : ");

        jLabel5.setText("- H : Haut                  (VK_UP)");

        jLabel6.setText("- B : Bas                    (VK_DOWN)");

        jLabel7.setText("- G : Gauche              (VK_LEFT)");

        jLabel8.setText("- D : Droite                (VK_RIGHT)");

        jLabel9.setText("- P : Nouvelle Prois    (N)");

        jButton3.setText("Rejouer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(607, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(labelniveau)
                            .addComponent(labelscore))
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gauche, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(sakafo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(haut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(droite, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelscore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelniveau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(haut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sakafo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(droite, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gauche, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int i = 0;
    private void hautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hautActionPerformed
        if (this.getDirection() != this.getBAS()) {
            this.setDirection(this.getHAUT());
        }

    }//GEN-LAST:event_hautActionPerformed

    private void sakafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sakafoActionPerformed
        p.pr.setPosX((int) (Math.random() * (590 - 1 + 1)) + 1);
        p.pr.setPosY((int) (Math.random() * (440 - 1 + 1)) + 1);
        R1.start();
    }//GEN-LAST:event_sakafoActionPerformed

    private void gaucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaucheActionPerformed
        if (this.getDirection() != this.getDROITE()) {
            this.setDirection(this.getGAUCHE());
        }

    }//GEN-LAST:event_gaucheActionPerformed

    private void droiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_droiteActionPerformed
        if (this.getDirection() != this.getGAUCHE()) {
            this.setDirection(this.getDROITE());
        }
    }//GEN-LAST:event_droiteActionPerformed

    private void basActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basActionPerformed
        if (this.getDirection() != this.getHAUT()) {
            this.setDirection(this.getBAS());
        }
    }//GEN-LAST:event_basActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane jop = new JOptionPane();

        int option = jop.showConfirmDialog(null, "Voulez-vous Recommencer ?", "Recommencer", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            this.dispose();
            new Jeux().setVisible(true);
        } else if (option == JOptionPane.NO_OPTION) {
            this.dispose();
            new Menu().setVisible(true);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jeux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jeux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jeux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jeux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jeux().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bas;
    private javax.swing.JButton droite;
    private javax.swing.JButton gauche;
    private javax.swing.JButton haut;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelniveau;
    private javax.swing.JLabel labelscore;
    private javax.swing.JButton sakafo;
    // End of variables declaration//GEN-END:variables
}
