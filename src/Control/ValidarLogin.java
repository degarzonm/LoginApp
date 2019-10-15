package Control;
import Entidad.*;
import UI.*;



public class ValidarLogin {
    
    private Sistema sistema = FrameP.sistema;
    
    public ValidarLogin(){
        
    }
    
    public String verificarLogin(Usuario u){
        
        if(verificarLongitudnombre(u.getNombre())){
            return "longitud nombre incorrecta, debe estar entre 2 y 6";
        }
        if(verificarLongitudPassword(u.getNombre())){
            return "longitud contraseña incorrecta";
        }
        for(Usuario x: sistema.getUsuarios()){
            if(u.getNombre().equals(x.getNombre()) &&
               u.getPassword().equals(x.getPassword())     
               ){
                return "Bienvenido";
            }
        }
        
        return "datos incorrectos";
    }
    
    
    public boolean verificarLongitudnombre(String nombre){
        return nombre.length()>1 && nombre.length()<=6;
    }
    
    public boolean verificarLongitudPassword(String pass){
        return pass.length()>1 && pass.length()<=6;
    }
}
