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
		System.out.println("Vehiculo mas caro:"  + " " + obtenerVehiculoMasCaro());
		System.out.println("Vehiculo mas varato:"+ " " + obtenerVehiculoMasBarato());
		System.out.println("Vehiculo que contiene en el modelo la letra 'Y':" + " " + obtenerModeloQueContengaLetra("Y"));
		System.out.println("=============================");
		System.out.println("Vehiculos ordenados por precio de mayor a menor:");
		imprimirVehiculosPrecioMayorAMenor();
	}
	
	String obtenerVehiculoMasCaro() {
		ordenarLista();
		return vehiculos.get(0).marca + " " + vehiculos.get(0).modelo;
	}
	
	String obtenerVehiculoMasBarato() {
		ordenarLista();
		return vehiculos.get(vehiculos.size()-1).marca + " " + vehiculos.get(vehiculos.size()-1).modelo;
		
	}
	String obtenerModeloQueContengaLetra(String s) {
		String modelo = "";
		for(Vehiculos vehiculo : vehiculos) {
			if(vehiculo.modelo.contains(s)) {
				modelo = vehiculo.marca;
			}
			
		}
		return modelo;
		
	}
	void imprimirVehiculosPrecioMayorAMenor() {
		ordenarLista();
		for(Vehiculos vehiculo : vehiculos) {
			System.out.println(vehiculo.marca + " " + vehiculo.modelo);
		}
	}
	
	
	void ordenarLista() {
		Collections.sort(vehiculos);
	}
}
