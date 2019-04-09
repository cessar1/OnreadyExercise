import java.text.DecimalFormat;

public class Motos extends Vehiculos {
	public int cilindrada;
	DecimalFormat formato;
	
	public Motos(String marca, String modelo,int cilindrada, double precio) {
		this.marca   = marca;
		this.modelo  = modelo;
		this.cilindrada = cilindrada;
		this.precio  = precio;
		this.formato = new DecimalFormat("$#,###.00");
		
		
	}

	@Override
	void mostrarInfo() {
		System.out.println("Marca:"      + " " + this.marca + " " + "//"  + " " +
						   "Modelo:"     + " " + this.modelo + " " + "//"  + " " +
						   "Cilindrada:" + " " + this.cilindrada + "c" + " " + "//"  + " " +
						   "Precio:"     + " " + formato.format(this.precio)  + " " );
		
	}
	
}
