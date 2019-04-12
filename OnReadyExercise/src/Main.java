
public class Main {
	
	public static void main(String[] args) {
		Concesionaria concesionaria = new Concesionaria();
		Vehiculo auto = new Auto("Peugeot", "206", 4,  200000);
		Vehiculo auto2 = new Auto("Peugeot", "208", 5,  250000);
		Vehiculo moto = new Moto("Honda", "Titan", 125, 60000);
		Vehiculo moto2 = new Moto("Yamaha", "YBR", 160, 80500.50);
		concesionaria.agregarVehiculo(auto);
		concesionaria.agregarVehiculo(auto2);
		concesionaria.agregarVehiculo(moto);
		concesionaria.agregarVehiculo(moto2);

		concesionaria.mostrarVehiculos();

		concesionaria.mostrarInfoAdicional();
	
		
	}	

}
