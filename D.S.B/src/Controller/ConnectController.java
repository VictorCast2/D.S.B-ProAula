package Controller;

import Model.ConnectModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectController{
    // Llamamos a la coneccion que lo llamo Connect
    ConnectModel Connect = new ConnectModel();
    
    // Metodo de Conectar
    public Connection Connect(){   
        try {
            // Metodo
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver cargado con exito... ");
            try {
                Connect.Conn = DriverManager.getConnection(Connect.Url, Connect.Usuario, Connect.Contrasenna);
                if (Connect.Conn != null) {
                    System.out.println("Conexion realizada con exito");
                }
            } catch (SQLException e) {
                System.out.println("Ha ocurrido un error al intentar conectar con la base de datos ("+Connect.Bd+"): "+e.getMessage());
                Logger.getLogger(ConnectController.class.getName()).log(Level.SEVERE, null,e);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Ha ocurrido un error en la conexion, al cargar el driver: "+e.getMessage());
            Logger.getLogger(ConnectController.class.getName()).log(Level.SEVERE, null,e);
        }
        return Connect.Conn;
    }
    
    // Metodo de Desconectar
    public void Desconnect(){
        try {
            Connect.Conn.close();
            System.out.println(" Se deconecto exitosamente ... ");
        } catch (SQLException e) {
            Logger.getLogger(ConnectController.class.getName()).log(Level.SEVERE, null,e);
        }
    }
    
}