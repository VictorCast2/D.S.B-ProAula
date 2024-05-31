package Model;

import java.sql.Connection;

public class ConnectModel {
    // Variables
    public static Connection Conn;
    public String Usuario = "root";
    public String Contrasenna = "0220";
    public String Driver = "com.mysql.jdbc.Driver";
    public String Ip = "localhost";
    public String Pueto = "3306";
    public String Bd = "Proaula";
    public String Condic = "true";
    public String Url = "jdbc:mysql://"+Ip+":"+Pueto+"/"+Bd
                +"?useUnicode="+Condic+"&useJDBCCompliantTimezoneShift="+Condic
                +"useLegacyDatetimeCode=false&serverTimezone=UTC";

    // Contructor
    public ConnectModel() {
        Conn = null;
    } 
    
    // Metodos Get y Set
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenna() {
        return Contrasenna;
    }

    public void setContrasenna(String Contrasenna) {
        this.Contrasenna = Contrasenna;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String Driver) {
        this.Driver = Driver;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public String getPueto() {
        return Pueto;
    }

    public void setPueto(String Pueto) {
        this.Pueto = Pueto;
    }

    public String getBd() {
        return Bd;
    }

    public void setBd(String Bd) {
        this.Bd = Bd;
    }

    public String getCondic() {
        return Condic;
    }

    public void setCondic(String Condic) {
        this.Condic = Condic;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }
    
}