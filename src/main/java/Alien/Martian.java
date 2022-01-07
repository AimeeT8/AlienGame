/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alien;


import java.awt.Color;




/**
 *
 * @author A Temple
 * @2021-11-06
 * @Martian class that descends from Alien
 */
public class Martian extends Alien {
    
   
    
    /*
     * Constructor that sets the Alien data field with values.
     */
    
    public Martian()
    {
            
            super(14, 1, 2);
    }
    
     /*
        Draw method for Martian that accepts a graphics object. This draws
        the alien using lines, arcs, and ovals. drawString() method 
        includes the Martian name.
        */
    
    
    public void drawMartian(Graphics2D gr) {
      
        gr.drawOval(50, 50, 100, 100);
        gr.setColor(Color.BLACK);
        gr.fillOval(80,75,10,10);
        gr.fillOval(80,75,10,10);
        gr.fillOval(105, 75, 10, 10);
        gr.drawArc(75, 75, 50, 50, 200, 140);
        gr.drawLine(70, 60, 20, 10);
        gr.drawLine(130, 60, 180, 10);
        gr.fillOval(90, 150, 20, 300);
        gr.drawLine(40, 200, 160, 200);
        gr.drawString("A Martian", 70, 480);
        
        
        
    }
    
  
    
}
