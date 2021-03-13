package structural;

public class School {
	
	public static void main(String[] args) {
		AssignmentWork aw = new AssignmentWork();
		Pen p = new PenAdapter();
		aw.setP(p);
		aw.writeAssignmentWork("Hi, I am writing my assignment...");
	}
}