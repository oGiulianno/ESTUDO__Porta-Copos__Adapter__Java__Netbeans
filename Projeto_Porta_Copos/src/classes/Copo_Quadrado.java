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
public class Copo_Quadrado {
    
    private double largura;

    public Copo_Quadrado(double largura) {
        this.largura = largura;
    }
    
    public double getLargura() {
        return largura;
    }

    public double getCopoQuadrado() {
        double resultado;
        resultado = Math.pow(this.largura, 2);
        // largura ^ 2 ou base*altura
        return resultado;
    }
    
}
