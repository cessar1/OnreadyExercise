
public class Main {
	
	public static void main(String[] args) {
		Concesionaria concesionaria = new Concesionaria();
		concesionaria.agregarAuto("Peugeot", "206", 4,  200000);
		concesionaria.agregarMoto("Honda", "Titan", 125, 60000);
		concesionaria.agregarAuto("Peugeot", "208", 5,  250000);
		concesionaria.agregarMoto("Yamaha", "YBR", 160, 80500.50);
		concesionaria.mostrarVehiculos();
		//concesionaria.obtenerVehiculoMasCaro();
		concesionaria.mostrarInfoAdicional();
	}	

}
