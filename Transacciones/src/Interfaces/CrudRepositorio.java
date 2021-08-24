package Interfaces;

import java.util.List;

import Entidades.Direccion;
import Entidades.Producto;

public interface CrudRepositorio {
 
	    List<Producto> listar();
	    Producto porId(Integer id);
	    void crear(Producto producto);
	    void editar(Producto producto);
	    void eliminar(Integer id);
	    List<Producto> listar(String campo, Direccion dir);

	
	
	
	
}
