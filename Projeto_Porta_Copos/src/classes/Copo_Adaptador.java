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
public class Copo_Adaptador extends Copo_Cilindrico {
    
    private Copo_Quadrado encaixa_Q;
    private Copo_Hexagonal encaixa_H;

    public Copo_Adaptador(Copo_Quadrado encaixa_Q) {
        this.encaixa_Q = encaixa_Q;
    }
    
    public Copo_Adaptador(Copo_Hexagonal encaixa_H) {
        this.encaixa_H = encaixa_H;
    }

    @Override
    public double getRaioQ() {
        double resultado;
        // calculando a circunferencia minima
        resultado = (Math.sqrt(Math.pow((encaixa_Q.getLargura() / 2), 2) * 2));
        return resultado;
    }
    
    @Override
    public double getRaioH() {
        double resultado;
        // calculando a circunferencia minima
        resultado = (Math.sqrt(Math.pow((encaixa_H.getLargura() / 2), 2) * 2));
        return resultado;
    }
    
}
