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
public class Rutinitas {
    private String hari = "Monday";
    private String activity = "\n     - Basketball";
    
    protected void identitas(){
        System.out.println("================================================");
        System.out.println("-----Mochammad Galih Prakasiwi / X RPL 5 / 22-----");
        System.out.println("================================================");
    }
    protected void judul(){
        System.out.println("\n* Daily Activity in SMK Telkom Malang");
    }
    public void info (){
        System.out.println(" > "+hari+" : "+activity);
    }

   
}
