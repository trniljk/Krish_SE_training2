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
public class Brands {
    
    public void checkAvailableBrand() throws Exception{
        try {
            ItemColors itemColor = new ItemColors();
            itemColor.checkRequstedColor();
        } catch (Exception e) {
            throw new Exception("Couse by checkAvailableBrand" , e); 
        }

    } 
}
