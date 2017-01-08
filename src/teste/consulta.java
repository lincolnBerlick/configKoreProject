/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author lincoln
 */
public class consulta {

    FileReader filer;
    BufferedReader buff;
    String caminho = "C:\\Users\\lincoln\\Desktop\\openkore-master\\openkore-master\\control\\config.txt";
    
    
    public consulta(){
        
        
        try {
            filer = new FileReader(caminho);
            buff = new BufferedReader(filer);
            
            
            
                while(buff.ready())
                System.out.println(buff.readLine());
                buff.close();
            } catch (IOException ex) {
                Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        

        
    }
    public void escreverarquivo(){
        FileWriter filer;
        BufferedWriter buff;
        
        try {
            filer = new FileWriter(caminho);
            buff  =  new BufferedWriter(filer);
            buff.
        } catch (IOException ex) {
            Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    
    
}
    public static void main(String args[]){
        
       new consulta();
    }
    
    
}
