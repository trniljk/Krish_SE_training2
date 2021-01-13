/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethoddesingpattern;

/**
 *
 * @author Night_King
 */
public class IceCreamFactory {
    public static IceCream createIceCream(IceCreamType iceCreamtype){
        switch (iceCreamtype){
        
        case VANILA:
            return new VanilaIceCream();
        case CHOCOLATE:
            return new ChocolateIceCream();
        case PANIKAJU:
            return new PaniKajuIceCream();    
        default:
            return null;
        }
    } 
    
}
