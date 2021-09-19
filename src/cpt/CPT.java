/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/* Julia Rice & Rachel Joy Copreros
 * CPT.java
 * June 1, 2020
 * Generates new artists and music that users would enjoy based on their music preferences

 */
public class CPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
       public static void playMusic (String filepath){
          try {
    File file = new File(filepath); 
    AudioInputStream stream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(stream);
    clip.start();
    
    int input = JOptionPane.showOptionDialog(null,"Click OK to stop.","Great! Listen to More!",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null);
      if (input == JOptionPane.OK_OPTION){
          clip.stop();
      }
      
} catch (Exception e) {
} 
       }
       
                
}

        

            
       
                
  
