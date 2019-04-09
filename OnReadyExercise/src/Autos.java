import java.text.DecimalFormat;

public class Autos extends Vehiculos {
	public int puertas;
	DecimalFormat formato;
	
	public Autos(String marca, String modelo, int puertas, double precio) {
		this.puertas = puertas;
		this.marca   = marca;
		this.modelo  = modelo;
		this.precio  = precio;
		this.formato = new DecimalFormat("$#,###.00");
		
	}

	@Override
	void mostrarInfo() {
		System.out.println("Marca:"   + " " +   this.marca   + " " + "//"  + " " +
						   "Modelo:"  + " " +   this.modelo  + " " + "//"  + " " +
						   "Puertas:" + " " +   this.puertas + " " + "//"  + " " +
						   "Precio:"  + " " + formato.format(this.precio));
		
	}

}
