import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concesionaria {

	private List<Vehiculo> vehiculos;
	
	public Concesionaria() {
		vehiculos = new ArrayList<>();
	}
	
	public void agregarVehiculo(Vehiculo vehiculo){
		vehiculos.add(vehiculo);
	}
	public void mostrarVehiculos() {
		for(Vehiculo vehiculo : vehiculos) {
			vehiculo.mostrarInfo();
		}
	}

	
	public void mostrarInfoAdicional() {
		System.out.println("=============================");
		System.out.println("Vehiculo mas caro:"  + " " + obtenerVehiculoMasCaro());
		System.out.println("Vehiculo mas barato:"+ " " + obtenerVehiculoMasBarato());
		Vehiculo vehiculoConLetra = obtenerVehiculoQueContengaLetra("Y");
		System.out.println("Vehiculo que contiene en el modelo la letra 'Y':" + " " +
				vehiculoConLetra.toString() + " " + vehiculoConLetra.formato.format(vehiculoConLetra.precio));
		System.out.println("=============================");
		System.out.println("Vehiculo ordenados por precio de mayor a menor:");
		imprimirVehiculosPrecioMayorAMenor();
	}
	
	public Vehiculo obtenerVehiculoMasCaro() {
		ordenarLista();
		return vehiculos.get(0);
	}
	
	public Vehiculo obtenerVehiculoMasBarato() {
		ordenarLista();
		return vehiculos.get(0);
		
	}
	public Vehiculo obtenerVehiculoQueContengaLetra(String s) {

		for(Vehiculo vehiculo : vehiculos) {
			if(vehiculo.modelo.contains(s)) {
				return vehiculo;
			}
			
		}
		return null;
		
	}
	public void imprimirVehiculosPrecioMayorAMenor() {
		ordenarLista();
		for(Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.toString());
		}
	}
	
	
	private void ordenarLista() {
		Collections.sort(vehiculos);
	}
}
