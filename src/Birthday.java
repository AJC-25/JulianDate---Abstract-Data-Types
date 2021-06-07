import java.util.*;
import java.time.LocalDateTime;
public class Birthday {
	private Scanner sc;
	private int year;
	private int month;
	private int day;
	
	private Birthday() {
		sc = new Scanner(System.in);
		//sc.useDelimiter("[0-9]");
		System.out.print("Please enter year of birth:");
		year = sc.nextInt();
		System.out.print("Please enter month of birth:");
		month = sc.nextInt();
		System.out.print("Please enter day of birth:");
		day = sc.nextInt();
		
	}
	public static void main(String[] args) {
		Birthday m = new Birthday();
		m.printBirthday();
		m.countDays();
	}	
	
	private void printBirthday() {
		JulianDate JB = JulianDate.of(year, month, day);
		int i = JB.get();
		
		int weekday = i % 7;
		String str;
		switch (weekday) {
			case 1: str = "Monday";
				break;
			case 2: str = "Thusday";
				break;
			case 3: str = "Whensday";
				break;
			case 4: str = "Thuresday";
				break;
			case 5: str = "Friday";
				break;
			case 6: str = "Saturday";
				break;
			case 7: str = "Sunday";
				break;
			default: str = "Unknown day";
		}		
		
		System.out.println("Birthday : " + str + " " + day + "." + month + "." + year);
		LocalDateTime date = LocalDateTime.now();
		if(date.getDayOfMonth() == day && date.getMonthValue() == month) System.out.println("Happy Birthday!!!");
	}
	
	private void countDays() {
		JulianDate JD = JulianDate.now();
		JulianDate JB = JulianDate.of(year, month, day);
		int i = JD.get() - JB.get();
		System.out.println("Days since birth: " + i);		
		if((i % 100) == 0) {
			i /= 100;
			System.out.println("Exactly " + i + " x 100 days since birth!");
		}		
	}
}

