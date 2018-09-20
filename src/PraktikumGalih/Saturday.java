/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumGalih;

/**
 *
 * @author galih
 */
public class Saturday extends Friday{
  private String hari = "Saturday";
    private String activity = "\n     -Go Home";
                          
    
    protected void Sabtu(){
        super.Jumat();
        System.out.println(" > "+hari+" : "+activity );
        System.out.println("------Ojo Sampe lali Omah------");
}
}
