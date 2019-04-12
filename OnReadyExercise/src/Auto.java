
public class Auto extends Vehiculo {
	public int puertas;

	public Auto(String marca, String modelo, int puertas, double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;

	}

	@Override
	public void mostrarInfo() {
		System.out.println("Marca:"   + " " +   this.marca   + " " + "//"  + " " +
						   "Modelo:"  + " " +   this.modelo  + " " + "//"  + " " +
						   "Puertas:" + " " +   this.puertas + " " + "//"  + " " +
						   "Precio:"  + " " + formato.format(this.precio));

	}

}
