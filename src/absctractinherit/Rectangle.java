package absctractinherit;
/*
 * The class Rectangle extends Figure class hence it has to define all the methods that are
 * abstract in the Super class Figure
 * */
class Rectangle extends Figure {
	int length = 12;
	int breadth = 14;
	
	@Override
	void findArea() {
		int area = length*breadth;
		System.out.println("Area of Rectangle is "+area);
		
	}

	@Override
	void findPerimeter() {
		int peri = 2*(length+breadth);
		System.out.println("Perimeter of Rectangle is "+peri);
	}

}
