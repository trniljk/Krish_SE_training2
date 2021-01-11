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
public class Oders {
    
    public void getOder() throws Exception{
        try {
            Brands brand = new Brands();
            brand.checkAvailableBrand();
        } catch (Exception e) {
            throw new Exception("Couse by getOder" , e); 
        }
        
    }
    
}
