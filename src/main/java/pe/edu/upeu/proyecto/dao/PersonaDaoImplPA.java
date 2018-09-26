/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.proyecto.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.proyecto.SysDataAccess;
import pe.edu.upeu.proyecto.modelo.Persona;

/**
 *
 * @author pc
 */
@Repository
public class PersonaDaoImplPA extends SysDataAccess<Integer, Persona> implements PersonaDaoI{
    
    @SuppessWarnings("unchecked")
    
    @Override
    public List<Persona> listarEntidad() {return getListAll();}
    
    @Override
    public Persona buscarEntidad (int id){ return getById(id);}
    
    @Override
    public guardarEntidad(Persona persona){savev(persona);}
    
    @Override
    public eliminarEntidad(int id){delete (id);}
    
    @Override
    public void modificarEntidad(Persona persona){update (persona);}
}
