package solve.linklist.pointonplane;

public class Node {
	private int x;
	private int y;
	private Node next;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Node next() {
		return this.next;
	}

	public void addLink(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("(").append(x).append(",").append(y).append(")");
		return sb.toString();
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}
