package info.superjava.triangle;

import info.superjava.AbstractShape;

public class Triangle extends AbstractShape {

	private int base;
	
	private int height;
	
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}


	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return (int)((base* height)/2);
	}

}
