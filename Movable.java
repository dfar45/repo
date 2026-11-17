package session20;

public interface Movable {
	public final static int DEF_ANGLE = 20;
	void rotate(int angle);
	public abstract void moveUp(int unit);
}
