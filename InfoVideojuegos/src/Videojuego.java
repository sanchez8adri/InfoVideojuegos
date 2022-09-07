
public class Videojuego {
	
	private String nombre;
	private int nVentas;
	private double precio;
	private double montoTotal;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getnVentas() {
		return nVentas;
	}
	public void setnVentas(int nVentas) {
		this.nVentas = nVentas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	public Videojuego(String nombre, int nVentas, double precio) {
		this.nombre = nombre;
		this.nVentas = nVentas;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", nVentas=" + nVentas + ", precio=" + precio + "]";
	}
	
	
	

}
