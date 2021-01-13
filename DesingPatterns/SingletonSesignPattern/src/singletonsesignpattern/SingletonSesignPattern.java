/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singletonsesignpattern;

/**
 *
 * @author Night_King
 */
public class SingletonSesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AudioSystemSettings audioSystemSettings = AudioSystemSettings.getSystemSetting();      
        System.out.println(audioSystemSettings.displaySettings());
        
        AudioSystemSettings audioSystemSettings2 = AudioSystemSettings.getSystemSetting();
        audioSystemSettings2.setVolume(20);
        audioSystemSettings2.setBass(30);
        
        System.out.println(audioSystemSettings.displaySettings()); 
    }
    
}
