package OOPS;

public class Floor {

	private double width;
	private double length;
	Floor(double width,double length){
		this.width=width;
		this.length=length;
	if(width<0) {
		this.width=0;
	}
	if(length<0) {
		this.length=0;
	}
		
	}
	
	public double getArea() {
		return this.width*this.length;
	}
	
}
