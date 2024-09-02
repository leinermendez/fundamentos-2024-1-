/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.moveball.view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Aarón Galagarza
 */
public class PanelCanvas extends JPanel {

    private int x;
    private int y;
    private Color color;

    public PanelCanvas() {
        this.x = 20;
        this.y = 20;
        this.color=Color.ORANGE;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(this.color);
        g.fillOval(this.x, this.y, 20, 20); // Dibuja un rectángulo en las coordenadas (x, y)
    }
    
    public void moveLeft() {
        x -= 10; // Mueve la bolita 10 píxeles a la izquierda
        repaint();
    }

    public void moveRight() {
        x += 10; // Mueve la bolita 10 píxeles a la derecha
        repaint();
    }

    public void moveUp() {
        y -= 10; // Mueve la bolita 10 píxeles hacia arriba
        repaint();
    }

    public void moveDown() {
        y += 10; // Mueve la bolita 10 píxeles hacia abajo
        repaint();
    }

    public void changeColor(Color newColor) {
        this.color = newColor; // Cambia el color de la bolita
        repaint();
    }
}
