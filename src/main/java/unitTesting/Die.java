package unitTesting;

public class Die {
	
	private int face;
	
	public Die() {
		face = 6;
	}
	
	public Die(int numFaces){
		face = numFaces;
	}
	
	public int getFace() {
		return face;
	}
	
	public void setFace(int face) {
		this.face = face;
	}
	
	public void set(Die die){
		face = die.face;
	}
	
	public int roll(){
		int x  =  ((int)(Math.random() * face)) + 1;
		return x;
	}
	
	public boolean equal(Die die){
		return this.face == die.face;
	}
	
	
	public Die clone() {
		Die d = new Die(this.face);
		return d;
	}
	
	public static void main(String[] args) {
		Die die = new Die();
		System.out.print("value of faces: " + die.getFace());
	
		Die b = new Die(4);
		System.out.println("Number of faces on b: " + b.getFace());
	}
	
}
