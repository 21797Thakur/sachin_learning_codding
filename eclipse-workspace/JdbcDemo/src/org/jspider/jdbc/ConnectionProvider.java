
package org.jspider.jdbc;
public class ConnectionProvider {
 public static void main(String[] args) {
        
        try
        {
            //driver class load
            Class.forName("com.mysql.jdbc.Driver")   ;      
        }
        catch(Exception e){
      e.printStackTrace();        
        }    
 
    }
}
