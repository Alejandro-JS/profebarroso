package singleton;
 
import conexiondb.Conexion;
 
// Clase con patrón Singleton
public class Singleton {
 
 private static Singleton Singleton;
 private Conexion conexion;
 
 // Constructor privado
 private Singleton(String url, String user, String passWord) {
  conexion = new Conexion(url, user, passWord);
 }
 
 // Método de clase, con retorno de la misma clase: Singleton
 public static Singleton getInstance(String url, String user, String passWord) {
 if (Singleton == null) {
 Singleton = new Singleton(url, user, passWord);
 }
 return Singleton;
 }
 
 public Conexion getConexion() {
 return conexion;
 }
 
}