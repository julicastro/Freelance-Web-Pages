package Entidades;

public class Producto {

	private String nombreProducto;
	private String descripcion;
	private Double precio;
	private Integer cantidad;
	private Integer id;
	private Integer ultimoId;
	
	public Producto() {
		this.setId(ultimoId);
	}

	public Producto(String nombreProducto, String descripcion, Double precio, Integer cantidad) {
		this();
		this.setNombreProducto(nombreProducto);
		this.setDescripcion(descripcion);
		this.setPrecio(precio);
		this.setCantidad(cantidad);
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	
	
	
	
	
	
	
	
	
}
