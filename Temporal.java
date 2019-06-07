
public class Temporal {
	
/*	
	private int ancho;
	private int alto;
	private Jugador jugador1 = new Jugador("Jugador1");
	private Jugador jugador2 = new Jugador("Jugador2");
	private String ganador;
	Tablero tablero;
	

	private Rectangulo ultimoRectangulo;

	

	GR(int ancho, int alto) {
		tablero = new Tablero(alto,ancho);
		this.ancho = ancho;
		this.alto = alto;
		
		public String jugar() {
			Tupla posicion;
			int intentos = 2;
			turno = 1;
			String ganador = "";
			while (intentos > 0) {

				dado = tirarLosDados();
				Jugador jugador;
				if (turno == 1) {
					jugador = jugador1;
				} else {
					jugador = jugador2;
				}

				if (jugador.getRectangulosEnTablero().size() > 0) {
					posicion = this.tablero.obtenerNuevaPosicion(jugador, dado);
					if (posicion == null) {
						intentos -= 1;
						getTurno();
					} else {
						this.ultimoRectangulo = new Rectangulo(dado.getX(), dado.getY(), posicion.getX(), posicion.getY());
						this.tablero.agregarRectangulo(jugador, this.ultimoRectangulo);
						if (intentos < 2) {
							intentos += 1;
						}
						getTurno();
					}

				} else {
					if (turno == 1) {
						posicion = new Tupla(0, 0);
					} else {
						posicion = new Tupla(this.alto - dado.getX() - 1, this.ancho - dado.getY() - 1);

					}

					this.ultimoRectangulo = new Rectangulo(dado.getX(), dado.getY(), posicion.getX(), posicion.getY());
					this.tablero.agregarRectangulo(jugador, this.ultimoRectangulo);

					getTurno();

				}

			}
			ganador = this.obtenerResultado();
			return ganador;
		}
		// modo semi-automático
	

	}
/*
	public String Jugar() {

		Tupla posicion;
		Tupla dado;
		Rectangulo rect;
		String jugador = "Jugador1";
		int id = 0;

		while (true) {
			this.imprimir();
			dado = this.tirarLosDados();
			rect = new Rectangulo(jugador, dado.getX(), dado.getY());

			// si no hay ningun elemento en la lista.
			if (rectangulosEnTablero.size() < 1) {
				id += 1;
				rect.setId(id);
				this.agregarRectangulo(rect);

			} else {

				posicion = buscarProximaPosicion(rect, dado);
				if (posicion == null) {
					jugador = "Jugador2";

				} else {

					rect = new Rectangulo(jugador, dado.getX(), dado.getY());
					posicion = buscarProximaPosicion(rect, dado);

					if (posicion == null) {
						jugador = obtenerResultado();
						return jugador;

					} else {
						agregarRectangulo(rect);
					}
				}
			}
		}
	}

	public String Jugar2() {

		Tupla posicion;
		Tupla dado;
		Rectangulo rect;
		String jugador = "Jugador1";
		int id = 0;

		while (true) {
			this.imprimir();
			dado = this.tirarLosDados();
			rect = new Rectangulo(jugador, dado.getX(), dado.getY());

			// si no hay ningun elemento en la lista.
			if (rectangulosEnTablero.size() < 1) {
				id += 1;
				rect.setId(id);
				this.agregarRectangulo(rect);

			} else {

				posicion = buscarProximaPosicion(rect, dado);
				if (posicion == null) {
					jugador = "Jugador2";
				} 
				else {

					rect = new Rectangulo(jugador, dado.getX(), dado.getY());
					posicion = buscarProximaPosicion(rect, dado);

					if (posicion == null) {
						jugador = obtenerResultado();
						return jugador;

					} else {
						agregarRectangulo(rect);
					}
				}
			}
		}
	}
*//*
	String obtenerResultado() {
		int area1 = area("Jugador1");
		int area2 = area("Jugador2");

		if (area1 > area2) {
			return "Jugador1";

		} else if (area2 > area1) {
			return "Jugador";
		} else {
			return "No hay ganadores";

		}
	}

	private String juegaJugador() {
		if (this.ultimoRectangulo.getNombreJugador() == "Jugado 1") {
			return "Jugador2";
		} else {
			return "Jugador1";
		}
	}






	// Devuelve el ultimo rectangulo agregado al tablero.
	

	//
	
	
/**	
	//Retorna si es posible, una posicion donde si se puede agregar un determinado rectangulo.
	public Tupla obtenerNuevaPosicion2(Rectangulo rectangulo ,String jugador, Tupla dados) {
		
		/*un candidato es aquel rect al cual voy a intentar agregarle un nuevoRect en una de 
		sus posibles posiciones (ARRIBA, ABAJO, IZQ, DER) 
		Rectangulo candidato; 
		
		//Aca se guardan los rectangulos que no me sirven para colocar el nuevoRect a su alrededor.
		ArrayList<Rectangulo> rectangulosDescartados = new ArrayList<Rectangulo>(); 
		
		
		//Obtengo un indice ( entre 0 y n, con n = rectangulosEntabler.size() ) al azar. 
		Random random = new Random();
		int indice = random.nextInt(this.rectangulosEnTablero.size());
		System.out.println("El indice obtenidos es: "+indice);
		//Obtengo el recatangulo en la posicion "indice"
		candidato = this.rectangulosEnTablero.get(indice);
		
		//itero mientras pueda seguir eligiendo rectangulos
		while(rectangulosDescartados.size() < this.rectangulosEnTablero.size()) {
			System.out.println("Es " + rectangulo.getNombreJugador() + " = " + jugador);
			System.out.println("Es " + rectangulo.getId() + " = " + candidato.getId());
			if((rectangulo.getNombreJugador() != jugador)	) {
				rectangulosDescartados.add(candidato);
			}
			else {
				//Si ya no descarté este rectangulo anteriomente.
				System.out.println(candidato+ " "+ rectangulosDescartados.contains(candidato));
				if(!rectangulosDescartados.contains(candidato)) {
					if(!(buscarAlrededor(candidato, dados) == null) ) {
						return buscarAlrededor(candidato, dados);
						
						
					}else {
						System.out.println("Descarto el candito");
						rectangulosDescartados.add(candidato);
					}
				}
			}
				
		}
		/*Si no hay ningun rectangulo al que pueda colocarte otro de un determinado tamaño en algun lugar 
		al rededor, paso el turno 
		return null;
	}
**/		
	/*Busca al rededor de un rectangulo un lugar para agregar uno nuevo,  
	retorna la posicion donde irá el nuevo rectangulo en caso de que corresponda, sino, null.*/


	/*
	 * Basicamente si el rectangulo que obtengo es del jugador que estoy buscando lo
	 * utilizo, si no vuelvo a buscar.
	 */



/*

	@Override
	public int hashCode() {
		return Objects.hash(ancho, alto);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		GR gr = (GR) o;
		return Objects.equals(ancho, gr.ancho) && Objects.equals(alto, gr.alto);
	}



		
*/

}
