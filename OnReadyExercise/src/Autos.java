
public class Autos extends Vehiculos {
	public int cantidadPuertas;
	
	public Autos(String marca, String modelo,int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
		this.marca = marca;
		this.modelo = modelo;
		
	}

	@Override
	void mostrarInfo() {
		System.out.println("Hola");
		
	}

}
