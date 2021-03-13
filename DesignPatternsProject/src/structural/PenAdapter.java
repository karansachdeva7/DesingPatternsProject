package structural;

public class PenAdapter implements Pen{
	
	PilotPen pp = new PilotPen();
	
	@Override
	public void writeAssignment(String str) {
		pp.writeAssignment(str);
	}
}