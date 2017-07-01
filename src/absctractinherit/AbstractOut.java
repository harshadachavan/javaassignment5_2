package absctractinherit;
/*
 * When we call objects of the child class
 * each definition of the methods are called
 * */
public class AbstractOut {

	public static void main(String[] args) {
		
		Square sq = new Square();
		sq.findArea();
		sq.findPerimeter();
		
		Circle ci = new Circle();
		ci.findArea();
		ci.findPerimeter();
		
		Rectangle rc = new Rectangle();
		rc.findArea();
		rc.findPerimeter();

	}

}
