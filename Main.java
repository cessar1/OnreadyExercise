

public class Main {

	public static void main(String[] args) {
		
		semiautomatico();
		//automatico();
		
		
	}
	static void automatico() {
		GR gr = new GR(21,20,3);
		String ganador = gr.jugar();
		while (ganador == "") {
			ganador = gr.jugar();
			System.out.println("..." + gr.ultimoRectangulo().getAncho() +","
			+ gr.ultimoRectangulo().getAlto());
			}
			System.out.println(gr);
			System.out.println("El ganador es: "+ ganador);
	}
	
	static void semiautomatico() {
		GR gr2 = new GR(21,22,3);
		String ganador;
		ganador = gr2.jugar();
		System.out.println(gr2);
		
		ganador = gr2.jugar();
		System.out.println(gr2);
		
		ganador = gr2.jugar();
		System.out.println(gr2);
	
		
		gr2.eliminarRect();
		System.out.println(gr2);
		
		System.out.println("Area Jugador 1: "+ gr2.area(1));
		System.out.println("Area Jugador 2: "+ gr2.area(2));
		System.out.println(gr2.obtenerResultado());
		}
		
}