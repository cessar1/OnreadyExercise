import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class GR {
	int ancho;
	int alto;
	int turno;
	Tupla dado;
	int cantidadJugadores;
	ArrayList<Jugador> jugadores;
	int intentos;
	Rectangulo ultimoRectangulo;
	Tablero tablero;

	public GR(int alto, int ancho, int cantidadJugadores) {
		this.ancho = ancho;
		this.alto = alto;
		this.jugadores = new ArrayList<Jugador>();
		tablero = new Tablero(alto, ancho);
		this.cantidadJugadores = cantidadJugadores;
		turno = 1;
		this.designarJugadores();

		intentos = cantidadJugadores;
	}

	public Rectangulo ultimoRectangulo() {
		return ultimoRectangulo;
	}

	// modo automático

	public String jugar() {

		if (intentos < 1) {
			return this.obtenerResultado();
		}

		Tupla posicion;

		dado = tirarLosDados();
		Jugador jugador;
		jugador = this.jugadores.get(turno - 1);

		if (jugador.getRectangulosEnTablero().size() > 0) {
			posicion = this.tablero.obtenerNuevaPosicion(jugador, dado);
			if (posicion == null) {
				getTurno();
				intentos--;
				return "";
			} else {
				System.out.println(jugador.getNombre() + "posicion: " + posicion);
				this.ultimoRectangulo = new Rectangulo(dado.getX(), dado.getY(), posicion.getX(), posicion.getY());
				this.tablero.agregarRectangulo(jugador, this.ultimoRectangulo);

				getTurno();
				if (intentos < cantidadJugadores) {
					intentos++;
				}
				return "";
			}

		} else {
			int posX = 0;
			int posY = 0;
			
			
			if(jugador.getId()== 1) {
				posX = 0;
				posY = 0;
				
			}else if(jugador.getId()== 2){
				posX = 14;
				posY = 14;
				
			}
			else if(jugador.getId() == 3){
				posX = 10;
				posY = 10;
				
				
			}
			
			
			
			this.ultimoRectangulo = new Rectangulo(dado.getX(), dado.getY(), posX, posY);
			this.tablero.agregarRectangulo(jugador, this.ultimoRectangulo);
			getTurno();
			
			//Random x = new Random();
			//Random y = new Random();

			
			/*
			int cont = 10;
			while (cont > 0) {
				if (tablero.puedoAgregar(posX, posY, dado.getX(), dado.getY())) {
					this.ultimoRectangulo = new Rectangulo(dado.getX(), dado.getY(), posX, posY);
					this.tablero.agregarRectangulo(jugador, this.ultimoRectangulo);

					getTurno();
					if (intentos < cantidadJugadores) {
						intentos++;
					}

					return "";
				}

				posX = x.nextInt(this.alto);
				posY = y.nextInt(this.ancho);
				cont--;
			}
			if (cont == 0) {
				intentos--;
			}
	*/
		}
		return "";
	}

	public String jugar(int alto, int ancho) {

		if (intentos < 1) {
			return this.obtenerResultado();
		}

		Tupla posicion;

		dado = new Tupla(alto, ancho);
		Jugador jugador;
		jugador = this.jugadores.get(turno - 1);

		if (jugador.getRectangulosEnTablero().size() > 0) {
			posicion = this.tablero.obtenerNuevaPosicion(jugador, dado);
			if (posicion == null) {
				getTurno();
				intentos--;
				return "";
			} else {
				System.out.println(jugador.getNombre() + "posicion: " + posicion);
				this.ultimoRectangulo = new Rectangulo(dado.getX(), dado.getY(), posicion.getX(), posicion.getY());
				this.tablero.agregarRectangulo(jugador, this.ultimoRectangulo);

				getTurno();
				if (intentos < cantidadJugadores) {
					intentos++;
				}
				return "";
			}

		} else {
			Random x = new Random();
			Random y = new Random();

			int posX = x.nextInt(this.alto);
			int posY = y.nextInt(this.ancho);

			int cont = 10;
			while (cont > 0) {
				if (tablero.puedoAgregar(posX, posY, dado.getX(), dado.getY())) {
					this.ultimoRectangulo = new Rectangulo(dado.getX(), dado.getY(), posX, posY);
					this.tablero.agregarRectangulo(jugador, this.ultimoRectangulo);

					getTurno();
					if (intentos < cantidadJugadores) {
						intentos++;
					}

					return "";
				}

				posX = x.nextInt(this.alto);
				posY = y.nextInt(this.ancho);
				cont--;
			}
			if (cont == 0) {
				intentos--;
			}

		}
		return "";
	}
	public void eliminarRect(int id) {
		Random r = new Random();
		int indice;
		indice = r.nextInt(jugadores.get(id - 1).getRectangulosEnTablero().size());
		this.tablero.borrarRectanguloDelTablero(jugadores.get(id - 1).getRectangulosEnTablero().get(indice));
		jugadores.get(id - 1).getRectangulosEnTablero().remove(indice);
	}

	public void eliminarRect() {
		Random r = new Random();
		int nroJugador = r.nextInt(this.cantidadJugadores);
		int indice;
		while (true) {
			if (nroJugador != turno) {
				indice = r.nextInt(jugadores.get(nroJugador).getRectangulosEnTablero().size());
				this.tablero.borrarRectanguloDelTablero(jugadores.get(nroJugador).getRectangulosEnTablero().get(indice));
				jugadores.get(nroJugador).getRectangulosEnTablero().remove(indice);
				break;
			}

		}
		System.out.println("Elimino el rectangulo de: " + jugadores.get(nroJugador).getNombre());

	}

	private void getTurno() {
		if (turno >= this.cantidadJugadores) {
			turno = 1;
		} else {
			turno += 1;
		}

	}

	// Simula arrojar de dos dados.
	private Tupla tirarLosDados() {
		Random r = new Random();
		int ancho = r.nextInt(6) + 1;
		int alto = r.nextInt(6) + 1;
		return new Tupla(ancho, alto);
	}

	public int area(int id) {
		int area = 0;
		Iterator<Rectangulo> it;

		it = jugadores.get(id - 1).getRectangulosEnTablero().iterator();
		while (it.hasNext()) {

			area += it.next().area();
		}

		return area;
	}

	String obtenerResultado() {
		int aux = 0;
		Jugador player = null;
		for (int x = 0; x < jugadores.size(); x++) {
			if (area(jugadores.get(x).getId()) > aux) {
				aux = area(jugadores.get(x).getId());
				player = jugadores.get(x);
			}

		}
		return player.getNombre();

	}

	@Override
	public String toString() {

		String matriz = "";
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				if (tablero.tablero[i][j] == 0) {
					matriz += " " + ".";
				} else {
					matriz += " " + tablero.tablero[i][j];
				}

			}
			matriz += "\n";
		}
		return matriz;
	}

	private void designarJugadores() {
		for (int i = 0; i < this.cantidadJugadores; i++) {
			this.jugadores.add(new Jugador(i + 1));
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alto;
		result = prime * result + ancho;
		result = prime * result + cantidadJugadores;
		result = prime * result + ((jugadores == null) ? 0 : jugadores.hashCode());
		result = prime * result + ((ultimoRectangulo == null) ? 0 : ultimoRectangulo.hashCode());
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
		GR other = (GR) obj;
		if (alto != other.alto)
			return false;
		if (ancho != other.ancho)
			return false;
		if (cantidadJugadores != other.cantidadJugadores)
			return false;
		if (jugadores == null) {
			if (other.jugadores != null)
				return false;
		} else if (!jugadores.equals(other.jugadores))
			return false;
		if (ultimoRectangulo == null) {
			if (other.ultimoRectangulo != null)
				return false;
		} else if (!ultimoRectangulo.equals(other.ultimoRectangulo))
			return false;
		return true;
	}
	
	
	
}
