package model;

import java.util.Scanner;

public class Triangulo2 {
    
    Scanner sc = new Scanner(System.in);
	
	public double Area(String n1, String n2) {
	
            double num1 = Double.parseDouble(n1);
            double num2 = Double.parseDouble(n2);
            
            double area = ((num1 * num2) / 2);
            
            return area;
		
	}
	
	public double Perimeter(String n1) {
		
            double num1 = Double.parseDouble(n1);
            
            double perimetro = (num1 * 3);

            return perimetro;
		
	}
    
}
