/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionexample.OnlineOderSystem;

import exceptionexample.Exceptions.*;

/**
 *
 * @author Night_King
 */
public class Store {
    
    void checkAvailableQty() throws Exception{
        try {
            throw new QtyExceed("Requsted Qty not available");
        } catch (Exception e) {
            throw new Exception( "Couse by checkAvailableQty",e); 
        }
        
    }  
}
