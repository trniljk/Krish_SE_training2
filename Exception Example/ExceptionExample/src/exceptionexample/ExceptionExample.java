/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionexample;
import ExceptionWrapping.ExceptionWrapping;
import exceptionexample.OnlineOderSystem.*;
import exceptionexample.checkAndUncheck.*;

/**
 *
 * @author Night_King
 */
public class ExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        try {
            CheckAndUncheckException checkAndUncheckException  = new CheckAndUncheckException();
            checkAndUncheckException.checkException();
            checkAndUncheckException.uncheckException();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ExceptionWrapping wrapped= new ExceptionWrapping(); 
            wrapped.wrappingCheckException();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            Oders newOder = new Oders();
            newOder.getOder();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
        
      
    }

    
    
}
