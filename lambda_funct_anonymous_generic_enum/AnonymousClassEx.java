package lambda_funct_anonymous_generic_enum;
//interface
interface Greeting{
	void sayHello();
}
public class AnonymousClassEx {
	public static void main(String[] args) {
		//Anonymous class implementation
		Greeting greet = new Greeting() {// create new class for implementing Greeting interface
		public void sayHello(){
			System.out.println("Hello from Anonymous class");
		}
	};
	greet.sayHello();
}}
