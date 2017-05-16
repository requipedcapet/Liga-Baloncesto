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
public class Partido {
    private String numeroEspectadores;
    private String resultado;
    
  private Arbitro Arbitro1=new Arbitro();
  public void setArbitro1(Arbitro Arbitro1)
  {
      this.Arbitro1=Arbitro1;
  }
  
  public Arbitro getArbitro1()
  {
      return Arbitro1;
  }
}
