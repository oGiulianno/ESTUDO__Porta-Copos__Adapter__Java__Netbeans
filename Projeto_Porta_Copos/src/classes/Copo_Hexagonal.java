/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Giu
 */
public class Copo_Hexagonal {
    
    private double largura;

    public Copo_Hexagonal(double largura) {
        this.largura = largura;
    }
    
    public double getLargura() {
        return largura;
    }

    public double getCopoHexagonal() {
        double resultado;
        resultado = ((6 * Math.pow(this.largura, 2) * Math.sqrt(3)) / 4);
        //6*tamanho*tamanho*1.73/4;
        return resultado;
    }
    
}
