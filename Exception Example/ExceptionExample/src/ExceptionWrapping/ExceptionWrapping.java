/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExceptionWrapping;
import exceptionexample.Exceptions.*;
/**
 *
 * @author Night_King
 */
public class ExceptionWrapping {
    public void wrappingCheckException(){
        try {
            throw new FileNotAvailable();
        } catch (FileNotAvailable e) {
            throw new RuntimeException(e);
        }
    
    }
}
