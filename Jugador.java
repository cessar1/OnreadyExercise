
import java.util.ArrayList;



public class Jugador {
	
	private int id;
	private ArrayList <Rectangulo> rectangulosEnTablero;
	

	public Jugador(int id) {
		this.setId(id);
		rectangulosEnTablero = new ArrayList<>();
	}
/*	
	public int area(String jugador) {
		int area = 0;
		Iterator<Rectangulo> it = this.rectangulosEnTablero.iterator();
		while (it.hasNext()) {
			Rectangulo temp = it.next();
			if (temp.getNombreJugador() == jugador) {

				area = temp.area();
			}
		}
		return area;
	}
*/
	public void guardarRectangulo(Rectangulo rect) {
		this.rectangulosEnTablero.add(rect);
	}
	public ArrayList<Rectangulo> getRectangulosEnTablero() {
		return this.rectangulosEnTablero;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return "Jugador"+ id;
	}
		
}
