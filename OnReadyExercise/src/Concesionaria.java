import java.util.ArrayList;
import java.util.Collections;

public class Concesionaria {
	Autos auto;
	Motos moto;
	double precioMasAlto;
	double precioMasBajo;
	String vehiculoMasCaro;
	String vehiculoMasVarato;
	
	ArrayList<Vehiculos> vehiculos;
	
	public Concesionaria() {
		vehiculos = new ArrayList<Vehiculos>();
		precioMasAlto = 0;
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
		System.out.println("Vehiculo mas caro:" + " " + obtenerVehiculoMasCaro());
		System.out.println("Vehiculo mas varato:");
		System.out.println("Vehiculo que contiene en el modelo la letra 'Y':");
		System.out.println("=============================");
		System.out.println("Vehiculos ordenados por precio de mayor a menos:");
		imprimirVehiculosPrecioMayorAMenor();
	}
	
	String obtenerVehiculoMasCaro() {
		
		for(Vehiculos vehiculo : vehiculos) {
			if(vehiculo.precio >= precioMasAlto) {
				precioMasAlto = vehiculo.precio;
				vehiculoMasCaro = vehiculo.marca + " " + vehiculo.modelo;
			}
		}
		return vehiculoMasCaro;
	}
	
	String obtenerVehiculoMasVarato() {
	return "sa";
	}
	void imprimirVehiculosPrecioMayorAMenor() {
		Collections.sort(vehiculos);
		for(Vehiculos vehiculo : vehiculos) {
			System.out.println(vehiculo.marca + " " + vehiculo.modelo);
			
		}
	}
}
