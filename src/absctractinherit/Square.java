package absctractinherit;
/*
 * The class Square extends Figure class hence it has to define all the methods that are
 * abstract in the Super class Figure
 * */
class Square extends Figure {
	int sides = 14;
	
	@Override
	void findArea() {
		int area = sides*sides;
		System.out.println("Area of Square is "+area);
		
	}

	@Override
	void findPerimeter() {
		int peri = 4*sides;
		System.out.println("Perimeter of Square is "+peri);
	}

}
