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
public class Tuesday extends Rutinitas{
        private String hari = "Tuesday";
    private String activity = "\n     -take a rest";
                          
    protected void Selasa(){
        super.identitas();
        super.judul();
        super.info();
        System.out.println(" >  "+hari+" : "+activity);
    }

    
          
    
}


