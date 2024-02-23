abstract class Shape{
	abstract int noOfSides();
}
class Triangle extends Shape{
	int noOfSides(){
		return 3;
	}
}
class Rectangle extends Shape{
	int noOfSides(){
		return 4;
	}
}
class Hexagon extends Shape{
	int noOfSides(){
		return 6;
	}
}
class AbstractShape{
	public static void main(String args[]){
		Triangle T=new Triangle();
		Rectangle R=new Rectangle();
		Hexagon H=new Hexagon();
		System.out.println("Triangle "+T.noOfSides()+"\nRectangle "+R.noOfSides()+"\nHexagon "+H.noOfSides());
	}
}

 
    

