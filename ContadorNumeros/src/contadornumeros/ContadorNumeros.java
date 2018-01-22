/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadornumeros;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author isamach
 */
public class ContadorNumeros {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws Exception {
        // TODO code application logic here
         BufferedReader br1 = null;
        String filename="volantes_tramite2.txt";
    
      br1 = new BufferedReader(new FileReader(filename));
      BufferedReader br2 =new BufferedReader(new FileReader("volantes_firmados2.txt"));
       
      String strLine1, strLine2;
       int cont=0;
       
      while((strLine1 = br1.readLine()) != null && (strLine2 = br2.readLine()) != null){
          if(strLine1.equals(strLine2)){
            
           cont++;    
         
          } 
          
          else
              System.out.println("El archivo de " +filename+ " comparado con el archivo volantes_firmados2.txt no contiene estos números :" +strLine2);
          
           
      }
       System.out.println("-Número total de no encontrados: "+cont);
    }
    
}
