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
public class DoubleBedRoom extends HotelRoom{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DoubleBedRoom{" + "type=" + type + '}';
    }
    
    
    
    
}
