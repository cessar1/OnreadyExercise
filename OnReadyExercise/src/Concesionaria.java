import java.util.ArrayList;

public class Concesionaria {
	Autos auto;
	Motos moto;
	ArrayList<Vehiculos> vehiculos;
	String vehiculoMasCaro;
	String vehiculoMasVarato;
	public Concesionaria() {
		vehiculos = new ArrayList<Vehiculos>();
	}
	void agregarAuto(String marca, String modelo, int cantPuertas, double precio){
		auto = new Autos(marca,modelo,cantPuertas, precio);
		vehiculos.add(auto);
	}
	void mostrarVehiculos() {
		for(Vehiculos vehiculo : vehiculos) {
			vehiculo.mostrarInfo();
		}
	}
	void agregarMoto(String marca, String modelo, int cilindrada , double precio) {
		moto = new Motos(marca, modelo, cilindrada , precio);
		vehiculos.add(moto);
		
	}
	void mostrarInfoAdicional() {
		System.out.println("=============================");
		System.out.println("Vehiculo mas caro:");
		System.out.println("Vehiculo mas varato:");
		System.out.println("Vehiculo que contiene en el modelo la letra 'Y':");
	}
	void obtenerVehiculoMasCaro() {
		
	}
	void obtenerVehiculoMasVarato() {
		
	}
	
}
