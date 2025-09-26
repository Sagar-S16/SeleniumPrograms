package lambda_funct_anonymous_generic_enum;

enum Day{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day today = Day.FRIDAY;
		System.out.println(today);
	
		//using enum in switch
		switch(today) {
		case MONDAY:
		System.out.println("Start of the work week!");
		break;
		case FRIDAY:
		System.out.println("Weekened is near");
		break;
		default:
			System.out.println("It is a regular day");
	  }
	}
}
