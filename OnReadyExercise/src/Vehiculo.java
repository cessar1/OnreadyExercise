import java.text.DecimalFormat;
import java.util.Objects;

//por Cesar Fernandez
public abstract class Vehiculo implements Comparable<Vehiculo> {

	protected String marca;
	protected String modelo;
	protected double precio;

	protected DecimalFormat formato = new DecimalFormat("$#,###.00");


	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public void mostrarInfo() {
		System.out.println("Marca:"   + " " +   this.marca   + " " + "//"  + " " +
				           "Modelo:"  + " " +   this.modelo  + " " + "//"  + " " +
				           "Precio:"  + " " + formato.format(this.precio));

	}


	@Override
	public int compareTo(Vehiculo v) {
		if (this.precio < v.precio) {
            return 1;
        }
        if (this.precio > v.precio) {
            return -1;
        }
        return 0;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Vehiculo vehiculo = (Vehiculo) o;
		return Objects.equals(marca, vehiculo.marca) &&
				Objects.equals(modelo, vehiculo.modelo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo);
	}

	@Override
	public String toString() {
		return marca + " " + modelo;
	}
}
