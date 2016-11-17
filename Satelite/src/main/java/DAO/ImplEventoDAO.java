/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Evento;
import Exceptions.ServiceError;
import org.json.simple.JSONObject;

/**
 *
 * @author Agus
 */
public class ImplEventoDAO implements IEventoDAO{

    @Override
    public void AgregarNuevoEvento(Evento evento) {
        try {
            JSONObject _resultado = (JSONObject)JSONPARSER.parse(SERVICIO.registrarEvento(evento.toJSONString()));
            if (_resultado.containsKey("Error")) {
                throw new ServiceError("Ha ocurrido un error: " + _resultado.get("Error").toString());
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override
    public void ModificarEvento(Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EliminarEvento(Evento evento) {
        try{
            JSONObject _resultado = (JSONObject)JSONPARSER.parse(SERVICIO.eliminarEvento(String.valueOf(evento.getCodigo())));
            if (ContieneErrores(_resultado)) {
                throw new ServiceError("Ha ocurrido un error al eliminar el evento:" + _resultado.get("Error").toString());
            }
        } catch (Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }
 
        private boolean ContieneErrores(Object obj) throws ServiceError{
        if (obj instanceof JSONObject) {
                if (((JSONObject)obj).containsKey("Error")) {
                    throw new ServiceError("Ha ocurrido un error: " + ((JSONObject)obj).get("Error").toString());
                }else{
                    return false;
                }
        }else{
            return true;
        }
    }
}
