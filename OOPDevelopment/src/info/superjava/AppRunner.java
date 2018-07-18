package info.superjava;

import java.util.logging.Logger;

import info.superjava.circle.Circle;
import info.superjava.square.Square;
import info.superjava.triangle.Triangle;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(0);
		
		logger.info("Circle with radius " +circle.getRadius() + "has area" + circle.getArea());
		
		Square square = new Square();
		square.setSide(0);
		
		logger.info("Square with side" + square.getSide() + "has area" + square.getArea());
		
		
		Triangle triangle = new Triangle();
		triangle.setBase(0);
		triangle.setHeight(0);
		
		logger.info("Triangle with base" + triangle.getBase() + "and height" + triangle.getHeight() + "has area" + triangle.getArea());
		
	}
	
}
