
public class Moto extends Vehiculo {

	private int cilindrada;

	public Moto(String marca, String modelo, int cilindrada, double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Marca:"      + " " + this.marca + " " + "//"  + " " +
						   "Modelo:"     + " " + this.modelo + " " + "//"  + " " +
						   "Cilindrada:" + " " + this.cilindrada + "c" + " " + "//"  + " " +
						   "Precio:"     + " " + this.formato.format(this.precio)  + " " );
		
	}
	
}
