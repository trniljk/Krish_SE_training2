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
public class FactoryMethodDesingPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IceCream icecream = IceCreamFactory.createIceCream(IceCreamType.VANILA);
        System.out.println(icecream);
        
        IceCream icecream2 = IceCreamFactory.createIceCream(IceCreamType.PANIKAJU);
        System.out.println(icecream2);
    }
    
}
