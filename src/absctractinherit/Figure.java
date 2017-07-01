package absctractinherit;
/*
 * Method that are declared without any body within an abstract class are called abstract method. 
 * The method body will be defined by its subclass. 
 * Abstract method can never be final and static. 
 * Any class that extends an abstract class must implement all the abstract methods 
 * declared by the super class.
 * */
public abstract class Figure {
	
	double dim1;
	//Here we have defined 2 abstract method, if we do not implement both in child class
	//it will throw and error
	abstract void findArea();
	
	abstract void findPerimeter();
}
