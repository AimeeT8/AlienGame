/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alien;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;




/**
 *
 * @author A Temple
 */

public class JDemoAliens  extends JComponent{
    
    private int width;
    private int height; 
    private Martian m1;
    private Jupiterian j1;
    
    /*
    Creates a new Martian & Jupiterian 
    */
    
    public JDemoAliens(int x, int y)  {
        width = x;
        height = y;
        m1 = new Martian();
        j1 = new Jupiterian();
        
    }
    
    /*
    Paint method draws each type of alien
    */
    
    protected void paintComponent(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gr.setRenderingHints(rh);
        m1.drawMartian(gr);
        j1.drawJupiterian(gr);
        
        
    
        }
    }
            
    
    

