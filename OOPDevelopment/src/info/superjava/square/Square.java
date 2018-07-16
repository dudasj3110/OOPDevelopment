package info.superjava.square;

import info.superjava.AbstractShape;

public class Square extends AbstractShape {

	private int side;
	
	public int getSide() {
		return (int) side;
	}



	public void setSide(int side) {
		this.side = side;
	}



	@Override
	public int getArea() {
		
		return (int)(side * side);
	}

	
	
	
}
