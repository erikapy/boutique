
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection conectar=null;
    
    public Connection conexion(){
        try{
            
        Class.forName("org.postgresql.Driver");
        conectar = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Boutique","postgres","07010Rpa");
        JOptionPane.showMessageDialog(null,"Conectado correctamente con la base de datos");
            
        }catch(Exception e ){
        JOptionPane.showMessageDialog(null,"NO SE PUDO ACCEDER A LA BASE DE DATOS");
        }
    return conectar;
        }
    public static void main(String[] args) {     
}
    }
  