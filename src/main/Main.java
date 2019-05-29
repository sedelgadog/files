/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;

/**
 *
 * @author sedelgadog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("as");
        
        if(f.exists()){
            System.out.println("existe");
            if(f.isDirectory()){
                String[] carpetas = f.list();
                for(String carpeta : carpetas){
                    System.out.println(carpeta);
                    File f2 = new File("as//"+carpeta);
                    if( f2.isDirectory()){
                    String[]flie = f.list();
                    for(String c : flie){
                        System.out.println(f2 + carpeta);
                    }
                }}

            
           
    }else{
    System.out.println("no existe");
}
  
    
        
        
}}}
