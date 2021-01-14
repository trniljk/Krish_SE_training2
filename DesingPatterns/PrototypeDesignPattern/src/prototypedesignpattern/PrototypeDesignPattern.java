/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prototypedesignpattern;



/**
 *
 * @author Night_King
 */
public class PrototypeDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        RoomCategory roomCategory = new RoomCategory();
        
        DoubleBedRoom booking1 = (DoubleBedRoom)roomCategory.getHotelRoom(RoomType.DOUBLE);
        
        TripleBedRoom booking2 = (TripleBedRoom)roomCategory.getHotelRoom(RoomType.TRIPLE);
        System.out.println(booking1);
        System.out.println(booking2);
    }
}
