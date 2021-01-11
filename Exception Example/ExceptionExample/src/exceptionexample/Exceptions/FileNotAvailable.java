/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionexample.Exceptions;

import java.io.FileNotFoundException;

/**
 *
 * @author Night_King
 */
public class FileNotAvailable  extends FileNotFoundException{

    public FileNotAvailable() {
        super("Fille cannot Found");
    }  
}
