
public class Conditionals {

	public static void main (String[] args){
		int age = 17;
		boolean valididcard = true;
		
		if(age>=18 && valididcard==true) {		
			System.out.println("Yes you are eligible for voting");
		}else {
			System.out.println("You are not eligible for voting.");
			
		}
		int marks = 85;
		
		if(marks>= 90 && marks<=100) {
			System.out.println("Your grade is O");
		}else if(marks>=80 && marks<90) {
			System.out.println("Your grade is E");
		
		}else if(marks>=70 && marks<80) {
			System.out.println("Your grade is A");
		}else {
			System.out.println("You are fail");
		}
		
		System.out.println("1. Gautam");
		System.out.println("2. Aman");
		System.out.println("3. Saurabh");
		System.out.println("4. Golu");
		
		int choice = 2;
		
		switch(choice) {
		case 1:
			System.out.println("My name is Gautam");
			break;
		case 2:
			System.out.println("My name is Aman");
			break;
		case 3:
			System.out.println("My name is Saurabh");
			break;
		case 4:
			System.out.println("My name is Golu");
			break;
		default:
			System.out.println("Your name is not given");
		}
	}
}
