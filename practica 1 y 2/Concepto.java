package Prácticas;
public class Concepto {
    public String codigo;
    public String descripcion;
    public String unidad;
    public double cantidad;
    public double precioUnitario;
    
	public Concepto(String codigo, String descripcion, String unidad, double cantidad, double precioUnitario) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.unidad = unidad;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}
	 public double calcularTotal() {
	        return cantidad * precioUnitario;
	    }

}
