/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethoddesingpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Night_King
 */
public abstract class IceCream {
    protected List<Ingredients> ingredients = new ArrayList<> ();
    public IceCream(){
        createIceCream();
    }    
    protected abstract void createIceCream();
    
    @Override
    public  String toString(){
        
        return getClass().getSimpleName()+" ( Ingrediant = " + ingredients+")";
    }
}
