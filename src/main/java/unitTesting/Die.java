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
		Die d = new Die();
		System.out.print("Number of faces on d: " + d.getFace());
	
		Die b = new Die(4);
		System.out.print("\nNumber of faces on b: " + b.getFace());
		
		Die c = b.clone();
		System.out.print("\nNumber of faces on c: " + c.getFace());
		
		b.setFace(d.getFace());
		System.out.print("\nNumber of faces on b after set face: " + b.face);
		
		c.set(b);
		System.out.print("\nNumber of faces on c after set face: " + c.face);
		
		
		System.out.println("\n\n*** Testing roll *** ");
		for (int i = 0; i < 10; i = i + 1){
			int value = d.roll();
			
			if (value == d.getFace()){
				System.out.print("\nMax: " + value);
			}
			else if (value > 1){
				System.out.print("\nVal: " + value);
			}
			else {
				System.out.print("\nMin: " + value);
			}
		}
		
		System.out.println("\n\n*** Testing equals ***");
		System.out.println("\nb == c: " + (b == d));
		System.out.println("\nd.equals(c): " + d.equal(c));
	}
}
