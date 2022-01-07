/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Alien;

import javax.swing.JFrame;

/**
 *
 * @author A Temple
 * @2021-11-06
 * @CreateAlien class that includes the main method.
 */
public class CreateAlien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * Dynammic method binding used to instantiate one martian and 
           one jupiterian. 
         */
       Alien aMartian;
       Alien aJupiterian;
       aMartian = new Martian();
       aJupiterian = new Jupiterian();
       
        /*
         * The toString method displays the results  
         */
       
       System.out.println("Martian: " + aMartian.toString());
       System.out.println("Jupiterian: " + aJupiterian.toString()); 
       
       int x = 600;
       int y = 600;
       JFrame frame = new JFrame();
       JDemoAliens da = new JDemoAliens(x, y);
       frame.setSize(x,y);
       frame.setTitle("JDemoAliens");
       frame.add(da);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
     
       
    }
    
}
