/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Abstracts.OperadorMatematico;

/**
 *
 * @author UCA
 */
public class Restador extends OperadorMatematico{
    private int minuendo, sustraendo;
    
    public float getOperacion(int n1, int n2){
        return n1 - n2;
    }
    
    
}
