package complexNumber;

public class ComplexNumber {

	private int x;
	private int y;
	
	ComplexNumber(){}
	public ComplexNumber(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public ComplexNumber addition(ComplexNumber c1, ComplexNumber c2) {
		return new ComplexNumber(c1.x+c2.x, c1.y+c2.y);
	}
	public ComplexNumber substraction(ComplexNumber c1, ComplexNumber c2) {
		return new ComplexNumber(c1.x-c2.x, c1.y-c2.y);
	}
	public ComplexNumber multiplication(ComplexNumber c1, ComplexNumber c2) {
		int x = c1.x*c2.x - c1.y*c2.y;
		int y = c1.x*c2.y + c1.y*c2.x;
		return new ComplexNumber(x,y);
	}
	
}
