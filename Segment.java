
public class Segment {
	Punt i = new Punt();
	Punt j = new Punt(2, 2);
	public Punt getI() { return i; }
    public Punt getJ() { return j; }
    public void setI(Punt i) { this.i = i; }
    public void setJ(Punt j) { this.j = j; }
    public double longitud() { 
    	return Math.sqrt(Math.pow(i.getX() - j.getX(), 2) + Math.pow(i.getY() - j.getY(), 2));
    }
	
}
