/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alien;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author A Temple
 * @2021-11-06
 * @Jupiterian class that descends from the Alien class
 */
public class Jupiterian extends Alien{
    
    /*
     * Constructor that sets the alien data fields with values.
     */
    
        public Jupiterian()
        {
            super(7, 6, 2);
        }
        
        /*
        Draw method for Jupiterian that accepts a graphics object. This draws
        the alien using lines, rectangles and ovals. drawString() method 
        includes the Jupiterian name.
        */
    
        public void drawJupiterian(Graphics gr) {
            
            gr.drawRect(350, 60, 100, 100);
            gr.drawLine(365, 90, 380, 90);
            gr.drawLine(410, 90, 425, 90);
            gr.drawOval(385, 120, 20, 20);
            gr.drawOval(387, 122, 20, 20);
            gr.drawOval(389, 124, 20, 20);
            gr.drawLine(360, 160, 320, 300);
            gr.drawLine(370, 160, 330, 300);
            gr.drawLine(380, 160, 340, 300);
            gr.drawLine(420, 160, 460, 300);
            gr.drawLine(430, 160, 470, 300);
            gr.drawLine(440, 160, 480, 300);
            
            
            gr.drawString("A Jupiterian", 360, 350);
            
        }
}
