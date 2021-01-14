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
public class FamilySuite extends HotelRoom{
    private String type;
    private int persons;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }
    
     
    
    @Override
    public String toString() {
        return "FamilySuite{" + "type=" + type + '}';
    }
    
    
}
