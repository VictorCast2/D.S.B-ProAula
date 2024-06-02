package View.Main;

import Controller.JavaSwingController;
import javax.swing.ImageIcon;

public class DSBView extends javax.swing.JFrame {

    public DSBView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(" D.S.B ");
        this.setIconImage(new ImageIcon(getClass().getResource("/Icons/LogoIcons.png")).getImage());
        // JavaSwingController.Metodo(Imagen, ("/Image/DSB.jpeg"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}