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
public class Porta_Copo_Redondo {
    
    private double raio_do_porta_copo;

    public Porta_Copo_Redondo(double raio_do_porta_copo) {
        this.raio_do_porta_copo = raio_do_porta_copo;
    }

    // SETS
    public void setRaio(double raio_do_porta_copo) {
        this.raio_do_porta_copo = raio_do_porta_copo;
    }
    
    // GETS
    public double getRaio() {
        return raio_do_porta_copo;
    }

    // METODOS
    public boolean encaixaQ(Copo_Cilindrico copo) {
        boolean resultado;
        resultado = (this.getRaio() >= copo.getRaioQ());
        return resultado;
    }
    
    public boolean encaixaH(Copo_Cilindrico copo) {
        boolean resultado;
        resultado = (this.getRaio() >= copo.getRaioH());
        return resultado;
    }

    
    
}
