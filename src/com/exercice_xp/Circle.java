package com.exercice_xp;

public class Circle {

		
		// Attributs 
				private double Radius = 1.0;
				private String Color = "red";
				
				
				// Constructeur  
				public Circle() {
					
				}
				public Circle(double Radius) {
						this.Radius = Radius;
							
						}
				public Circle(double Radius, String Color) {
						this.Radius = Radius;
						this.Color = Color;
								
						}
				
				// Méthode get et set 
				
				public String getColor() {
					return Color;
				}
				public void setColor(String color) {
					Color = color;
				}
				public void setRadius(double radius) {
					Radius = radius;
				}
				public double getRadius() {
					return Radius;
				}
				
				// Méthode toString
				@Override
				public String toString() {
					return "Circle [Radius=" + Radius + ", Color=" + Color + "]";
				}
				
				
				public double getArea() {
					return Math.PI * Radius * Radius;
				} 


}
