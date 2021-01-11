/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionexample.OnlineOderSystem;

/**
 *
 * @author Night_King
 */
public class ItemColors {
    void checkRequstedColor() throws Exception{
        try {
            Store requstedQty = new Store();
            requstedQty.checkAvailableQty();            
        } catch (Exception e) {
            throw new Exception("Couse by checkRequstedColor" , e); 
        } 
    }
}
