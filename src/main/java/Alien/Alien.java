/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alien;

/**
 *
 * @author A Temple
 * @2021-11-06
 * @Abstract Alien class
 */
public abstract class Alien {
    
     /*
      * 2 protected & 1 private data members
      */
        private int height; 
        protected int numLegs;
        protected int numEyes; 
        
        /*
         *constructor that requires a value for each data field
         */
        
        public Alien(int ht, int legs, int eyes) {
            height = ht; 
            numLegs = legs; 
            numEyes = eyes; 
        }
        
        public int getHeight() {
                return height;
        }
        
        public void setHeight(int ht) {
                height = ht;
        }
        
        /* 
         *toString method that includes a description of the alien.
         */
@Override         
public String toString() {
    String message;
    message = "Alien height is " + height + " feet." + "\n It has " + numLegs + " leg(s) and " + numEyes + " eyes.";
    return message; 
}
        
    
}
