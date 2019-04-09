//por Cesar Fernandez
public abstract class Vehiculos implements Comparable<Vehiculos> {
	public String marca;
	public String modelo;
	public double precio;
	
	abstract void mostrarInfo();
	@Override
	public int compareTo(Vehiculos v) {
		if (this.precio < v.precio) {
            return 1;
        }
        if (this.precio > v.precio) {
            return -1;
        }
        return 0;
		
	}
}
