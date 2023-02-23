package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		// rectangle
		StdDraw.setPenColor(204, 204, 255);
		StdDraw.filledRectangle(.5, 0.5, 0.4, 0.25);
		
		StdDraw.setPenColor(255,255,255);
		StdDraw.line(0.1, 0.35, 1, 0.35);
		
		StdDraw.setPenColor(255,255,255);
		StdDraw.line(0.1, 0.65, 1, 0.65);
		
		StdDraw.setPenColor(218,165,32);
		StdDraw.filledEllipse(0.5, 0.5, 0.13, 0.13);
	
		double[]x= {0.5, 0.6, 0.55, 0.45, 0.4};
		double[]y= {0.6, 0.7, 0.4, 0.4, 0.7};
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledPolygon(x, y);
		
	}
}