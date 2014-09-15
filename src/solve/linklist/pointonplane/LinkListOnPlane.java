package solve.linklist.pointonplane;

public class LinkListOnPlane {
	private Node head;

	public Node getHead() {
		return head;
	}

	public LinkListOnPlane(int x, int y) {
		head = new Node(x, y);
	}

	public void insert(int x, int y) {
		if (head == null) {
			throw new UnsupportedOperationException("Head of the list in Null");
		}
		Node loc = head;
		Node next = head.next();
		while (next != null) {
			loc = next;
			next = next.next();
		}
		loc.addLink(new Node(x, y));
	}

	public void print() {
		if (head == null) {
			throw new UnsupportedOperationException(
					"Can't Print a list with null head");
		}
		Node current = head;
		while (current != null) {
			System.out.print(current);
			current = current.next();
			if (current != null) {
				System.out.print("-->");
			}
		}
	}

	public void removePointsInLine() {
		Node prev = head;
		Node next = head.next();
		while (next != null) {
			if (prev.getX() == next.getX() && next.next() != null
					&& next.getX() == next.next().getX()) {
				prev.addLink(next.next());
			} else if (prev.getY() == next.getY() && next.next() != null
					&& next.getY() == next.next().getY()) {
				prev.addLink(next.next());
			}
			prev = next;
			next = next.next();
		}
	}

	public int size() {
		int count = 0;
		Node current = head;
		while (current != null) {
			current = current.next();
			count++;
		}
		return count;
	}
}
