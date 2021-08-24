package Negocio;

import java.util.ArrayList;
import java.util.List;
import Entidades.Direccion;
import Entidades.Producto;
import Interfaces.CrudRepositorio;

public class Stock implements CrudRepositorio{

	private List <Producto> productos; 
	
	public Stock () {
		this.productos = new ArrayList<>();
	}

	@Override
	public List<Producto> listar() {
		return productos;
	}

	@Override
	public Producto porId(Integer id) {
		Producto resultado = null;
		for (Producto p : productos) {
			if(p.getId() != null && p.getId().equals(id)) {
				resultado = p;
			}
		}
		return resultado;
	}

	@Override
	public void crear(Producto producto) {
		this.productos.add(producto);
		
	}

	@Override
	public void editar(Producto producto) {
		Producto p = this.porId(producto.getId());
        p.setNombreProducto(producto.getNombreProducto());
        p.setDescripcion(producto.getDescripcion());
		p.setCantidad(producto.getCantidad());
		p.setPrecio(producto.getPrecio());
	}

	@Override
	public void eliminar(Integer id) {
		this.productos.remove(this.porId(id));
	}

	@Override
	public List<Producto> listar(String campo, Direccion dir) {
		List<Producto> listaOrdenada = new ArrayList<>(this.productos);
        listaOrdenada.sort((a, b) -> {
                int resultado = 0;
                if(dir == Direccion.ASC){
                    resultado = ordenar(campo, a, b);
                } else if(dir == Direccion.DESC){
                    resultado = ordenar(campo, b, a);
                }
                return resultado;
        });
        return listaOrdenada;
	}
		
	public static int ordenar(String campo, Producto a, Producto b){
        int resultado = 0;
        switch (campo){ 
            case "id":
                    resultado = a.getId().compareTo(b.getId());
            case "nombreProducto":
                    resultado = a.getNombreProducto().compareTo(b.getNombreProducto());
            case "precio":
                    resultado = a.getPrecio().compareTo(b.getPrecio());
            case "cantidad":
            resultado = a.getCantidad().compareTo(b.getCantidad());
        }
        return resultado;
    }
	
	
	
	
}
