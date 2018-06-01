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
public class Sumador extends OperadorMatematico{
    private int sumando, sumador;
    
    public float getOperacion(int n1, int n2){
        this.sumando = n1;
        this.sumador = n2;
        return this.sumando + this.sumador;
    }

    public Sumador(int sumando, int sumador) {
        this.sumando = sumando;
        this.sumador = sumador;
    }

    public Sumador() {
    }
    
    
}
