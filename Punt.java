
public class Punt {
     private int[] coord = new int[2];   // coordenades del punt
     public Punt() { this.coord[0] = 0; this.coord[1] = 0; }
     public Punt(int x, int y) { 
    	 if (isPositive(x) && isPositive(y)) {
    		 this.coord[0]=x; this.coord[1]=y;
    	 }else {
    		 throw new IllegalArgumentException();
    	 }
     }
     public int getX() { return coord[0]; }
     public int getY() { return coord[1]; }
     public void setX(int x) { 
    	 if (isPositive(x)) {
    		 this.coord[0] = x;
    	 }else {
    		 throw new IllegalArgumentException();
    	 }
     }
     public void setY(int y) {
    	 if (isPositive(y)) {
    		 this.coord[1] = y; 
    	 }else {
    		 throw new IllegalArgumentException();
    	 }
     }
     public void suma(Punt p) { coord[0]+=p.coord[0]; coord[1]+=p.coord[1]; }
     public boolean isPositive(int num) {
    	 if (num < 0) {	 
    		 return false;
    	 }else {
    		 return true;
    	 }
     }
 }