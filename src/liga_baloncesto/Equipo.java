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
public class Equipo {
    
    private String nombre;
    private String ciudad;
    private Pabellon Pabellon1;
    private PabellonAlternativo pabellonAlternativo;
    private Partido Partido1;
    
    public void setPABELLON1 (Pabellon PABELLON1)
    {
        this.Pabellon1=PABELLON1;
        
    }
    public Pabellon getPABELLON1()
    {
        return this.Pabellon1;
    }
    
    
    public void setPABELLON_ALTERNATIVO(PabellonAlternativo PABELLON_ALTERNATIVO1)
    {
        this.pabellonAlternativo=PABELLON_ALTERNATIVO1;    
      
     }
public PabellonAlternativo getPABELLON_ALTERNATIVO1()
{

return this.pabellonAlternativo;
}

public void setPARTIDO1 (Partido PARTIDO1)
{
    this.Partido1=PARTIDO1;
}

public Partido getPARTIDO1()
{
    return this.Partido1;
}
 
public Jugador Jugador1 = new Jugador();

public void setJugador1(Jugador Jugador1)
{
    this.Jugador1=Jugador1;
}
public Jugador setJugador1()
{
    return this.Jugador1;
}


        
        

}




    

    
    