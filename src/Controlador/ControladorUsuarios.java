package Controlador;

import Vista.MdlUsuarios;

public class ControladorUsuarios {
    
    private final MdlUsuarios V;

    public ControladorUsuarios(MdlUsuarios V) {
        this.V = V;
    }
    
    public void init(){
        
    }
    
    public void espeVisi(){
        int nEspecialidad = V.comboCargo.getSelectedIndex();
        if(nEspecialidad == 1){
            V.pEspecialidad.setVisible(false);
        }else{
            V.pEspecialidad.setVisible(true);
        }
    }
    
}
