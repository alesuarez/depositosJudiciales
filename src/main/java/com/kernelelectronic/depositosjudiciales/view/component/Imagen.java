package com.kernelelectronic.depositosjudiciales.view.component;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Imagen extends javax.swing.JPanel {
    private int x, y;
    private String path = null;

    public Imagen(JPanel jPanel1, String path) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
        this.path = path;
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(path);
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }   
}
