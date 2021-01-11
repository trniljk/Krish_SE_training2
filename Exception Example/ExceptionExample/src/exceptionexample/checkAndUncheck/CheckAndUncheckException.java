/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionexample.checkAndUncheck;
import java.io.*;
/**
 *
 * @author Night_King
 */
public class CheckAndUncheckException {
    public void checkException() throws FileNotFoundException{
        try {
           FileInputStream fill = null;
            fill= new FileInputStream("E:/myfile.txt");  
        } catch (FileNotFoundException e) {
            System.out.println("Check Exception" + e);
        }
            
    }
    public void uncheckException(){
            System.out.println("Creating ArithmeticException: / by zero Unckecked exception");
            int number = 10;
            int devider = 0;
            int result = number/devider;
        
    }
    
}
