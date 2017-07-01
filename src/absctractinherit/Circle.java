package absctractinherit;

/*
 * The class Circle extends Figure class hence it has to define all the methods that are
 * abstract in the Super class Figure
 * */
 class Circle extends Figure {
	 double dim1 = 12;
	 
	@Override
	void findArea() {
		
		double area = 3.14*dim1*dim1;
		System.out.println("Area of Circle is "+area);
		
	}

	@Override
	void findPerimeter() {
		double peri = 2*3.14*dim1;
		System.out.println("Perimeter of Circle is "+ peri);
		
	}

}
