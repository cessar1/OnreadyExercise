
import java.util.ArrayList;

public class Tablero {
	int[][] tablero;
	ArrayList<Rectangulo> rectangulosEnTablero;
	private int ancho;
	private int alto;

	public Tablero(int alto, int ancho) {
		this.alto = alto;
		this.ancho = ancho;
		tablero = new int[alto][ancho];
		
		rectangulosEnTablero = new ArrayList<Rectangulo>();
	}

	public Tupla obtenerNuevaPosicion(Jugador jugador, Tupla dados) {

		Tupla posicion;
		for (Rectangulo target : jugador.getRectangulosEnTablero()) {
			posicion = this.buscarAlrededor(target, dados);
			if (!(posicion == null)) {
				
				return posicion;
			} 

		}
		return null;
	}

	/**
	 * Agrega un rectangulo al tablero
	 *
	 */
	public void agregarRectangulo(Jugador jugador, Rectangulo rect) {
		jugador.guardarRectangulo(rect);
		
		this.modificarTablero(jugador, rect);

	}

	public void modificarTablero(Jugador jugador, Rectangulo rect) {
		for (int i = rect.getPosX(); i < rect.getPosX() + rect.getAlto(); i++) {
			for (int j = rect.getPosY(); j < rect.getPosY() + rect.getAncho(); j++) {
				
				tablero[i][j] = jugador.getId();

			}

		}

	}
	public void borrarRectanguloDelTablero(Rectangulo rect) {
		for (int i = rect.getPosX(); i < rect.getPosX() + rect.getAlto(); i++) {
			for (int j = rect.getPosY(); j < rect.getPosY() + rect.getAncho(); j++) {
				
				tablero[i][j] = 0;

			}

		}

	}

	private Tupla buscarAlrededor(Rectangulo rectDeReferencia, Tupla dados) {
		
		// Busco un lugar a la DERECHA del rectDeReferencia
		int nuevoRectanguloPosX = rectDeReferencia.getPosX();
		int nuevoRectanguloPosY = rectDeReferencia.getPosY() + rectDeReferencia.getAncho();
		
		if (puedoAgregar(nuevoRectanguloPosX, nuevoRectanguloPosY, dados.getX(), dados.getY())) {
			return new Tupla(nuevoRectanguloPosX, nuevoRectanguloPosY);
		}

		// Busco un lugar a la IZQUIERDA del rectDeReferencia
		nuevoRectanguloPosX = rectDeReferencia.getPosX();
		nuevoRectanguloPosY = rectDeReferencia.getPosY() - dados.getY();
		
		if (puedoAgregar(nuevoRectanguloPosX, nuevoRectanguloPosY, dados.getX(), dados.getY())) {
			return new Tupla(nuevoRectanguloPosX, nuevoRectanguloPosY);
		}
		// Busco un lugar a la ABAJO del rectDeReferencia
		nuevoRectanguloPosX = rectDeReferencia.getPosX() + rectDeReferencia.getAlto();
		nuevoRectanguloPosY = rectDeReferencia.getPosY();
		
		if (puedoAgregar(nuevoRectanguloPosX, nuevoRectanguloPosY, dados.getX(), dados.getY())) {
			return new Tupla(nuevoRectanguloPosX, nuevoRectanguloPosY);
		}

		// Busco un lugar a la ARRIBA del rectDeReferencia
		nuevoRectanguloPosX = rectDeReferencia.getPosX() - dados.getX();
		nuevoRectanguloPosY = rectDeReferencia.getPosY();
		
		if (puedoAgregar(nuevoRectanguloPosX, nuevoRectanguloPosY, dados.getX(), dados.getY())) {
			return new Tupla(nuevoRectanguloPosX, nuevoRectanguloPosY);
		}

		return null;
	}

	public boolean puedoAgregar(int posX, int posY,int alto,int ancho) {
		if (alto + posX < this.alto && ancho + posY < this.ancho && posX >= 0 && posY >= 0) {
			
			boolean puedoAgregar = true;
			for (int x = posX; x < posX + alto; x++) {
				for (int y = posY; y < posY + ancho; y++) {
					if (tablero[x][y] != 0) {
						return false;
					}
				}
			}
			return puedoAgregar;
		}
		return false;
	}
	
}	
