

public class Rectangulo {

	private int posX;
	private int posY;
	private int ancho;
	private int alto;

	Rectangulo(int alto, int ancho, int posX, int posY) {

		this.ancho = ancho;
		this.alto = alto;
		this.posX = posX;
		this.posY = posY;

	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int area() {

		return this.ancho * this.alto;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("Posicion: ").append(this.posX).append(",")
				.append(this.posY).append(" ").append(" ")
				.append("Alto/ancho: ").append(this.alto).append("/").append(this.alto)
				.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alto;
		result = prime * result + ancho;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		if (alto != other.alto)
			return false;
		if (ancho != other.ancho)
			return false;
		return true;
	}





}
