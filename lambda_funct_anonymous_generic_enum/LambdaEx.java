package lambda_funct_anonymous_generic_enum;

interface GreetingHello{
	void sayHello();
}
public class LambdaEx {
	public static void main(String[] args) {
		//Lamda expression instead of Anonymous class
		GreetingHello greet = () ->System.out.println("Hello from Lamda");	
	    greet.sayHello();
}}