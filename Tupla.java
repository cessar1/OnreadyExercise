
public class Tupla {
	private int x;
	private int y;
	public Tupla(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("Pos X:"+x).append(" ")
				.append("Pos Y: "+y).toString();
	}
}
