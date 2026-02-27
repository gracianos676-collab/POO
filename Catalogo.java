package Prácticas;
public class Catalogo {
    public Concepto[] materiales;
    public Concepto[] manodeobra;
    public Concepto[] maquinariaequipo;
    public Concepto[] servicios;
    public int posmateriales;
    public int posmanodeobra;
    public int posmaquinariaequipo;
    public int posservicios;
    
	public Catalogo(Concepto[] materiales, Concepto[] manodeobra, Concepto[] maquinariaequipo, Concepto[] servicios,
			int posmateriales, int posmanodeobra, int posmaquinariaequipo, int posservicios) {
		this.materiales = materiales;
		this.manodeobra = manodeobra;
		this.maquinariaequipo = maquinariaequipo;
		this.servicios = servicios;
		this.posmateriales = posmateriales;
		this.posmanodeobra = posmanodeobra;
		this.posmaquinariaequipo = posmaquinariaequipo;
		this.posservicios = posservicios;
	}
}