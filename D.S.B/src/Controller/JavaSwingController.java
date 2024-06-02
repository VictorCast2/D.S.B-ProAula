package Controller;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class JavaSwingController{
    public static void Metodo(JLabel JLabel, String RutaImagen){
        ImageIcon image = new ImageIcon(RutaImagen);
        Icon IconLibrery = new ImageIcon(
                image.getImage().getScaledInstance(JLabel.getWidth(), JLabel.getHeight(), Image.SCALE_DEFAULT)
        );
        JLabel.setIcon(IconLibrery);
    }
}