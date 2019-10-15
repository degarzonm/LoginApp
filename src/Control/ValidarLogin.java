package Control;
import Entidad.*;
import UI.FrameP;

import static UI.FrameP.sistema;


public class ValidarLogin {
    
    private Sistema sis = FrameP.sistema;
    
    public ValidarLogin(){
        
    }
    
    public String verificarLogin(Usuario u){
        
        if(!verificarLongitudnombre(u.getNombre())){
            return "longitud de nombre incorrecta";
        }
        if(!verificarLongitudPassword(u.getPassword())){
            return "longitud contraseña incorrecta";
        }
        for(Usuario x: sis.getUsuarios()){
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
