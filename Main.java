import java.sql.SQLException;

import singleton.Singleton;

public class Main {
    public static void main(String args[]){
      try {
        Singleton s = Singleton.getInstance("jdbc:mysql://localhost:3306/ine", "ine_user", "inde.1234");
        
        s.getConexion().query("select * from ciudadano");
        s.getConexion().ejecutar("insert into ciudadano values('NOMBRE DEL MONO')");

        Singleton s2 = Singleton.getInstance("jdbc:mysql://localhost:3306/ine", "ine_user", "inde.1234");
        
        s2.getConexion().query("select * from entidad");
        s2.getConexion().ejecutar("insert into entidad values('CHIHUAS')");

      } catch (SQLException e){
        e.printStackTrace();
      }
    }
}
