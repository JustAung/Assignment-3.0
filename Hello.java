//Aung Thet Pay
public class Hello {
String n;

public Hello() {
	
}//default
/**
 * @param n
 */
public Hello(String n) {
	super();
	this.n = n;
}//preferred
public boolean sayHello(String name) {
	n = name;
	System.out.println("Hello");
	return true;
}
}
