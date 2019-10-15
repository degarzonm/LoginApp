package Entidad;

public class Usuario {
    String nombre;
    String pass;
    
    public Usuario(){
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String n){
        nombre=n;
    }
    
    public String getPassword(){
        return pass;
    }
    
    public void setPassword(String n){
        pass=n;
    }
}
