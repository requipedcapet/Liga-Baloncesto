/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liga_baloncesto;

/**
 *
 * @author sena
 */
public class Jugador {
    private String DNIJugador;
    private String nombre;
    private String contrato;
    private Contrato Contrato1;
    
    public void setContrato1 (Contrato Contrato1)
    {
        this.Contrato1=Contrato1;
    }
    public Contrato getContrato1()
    {
        return Contrato1;
    }
}
