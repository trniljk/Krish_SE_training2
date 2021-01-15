/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builderpattern;

/**
 *
 * @author Night_King
 */
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       BookingPackege.Builder builder= new BookingPackege.Builder("Half Board");
   
       BookingPackege booking =  builder.breakfastMenuType("Italian").dinnerMenuType("Sri lankan").mealType("Vegan").cosmetics("Herbal").build();
     
       System.out.println(booking);
       
    }
    
}
