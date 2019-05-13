 public class Punt {
     private int x, y;   // coordenades del punt
     public Punt() { this(0, 0); }
     public Punt(int x, int y) { this.x=x; this.y=y; }
     public int getX() { return x; }
     public int getY() { return y; }
     public void setX(int x) { this.x = x; }
     public void setY(int y) { this.y = y; }
     public void suma(Punt p) { x+=p.x; y+=p.y; }
 }