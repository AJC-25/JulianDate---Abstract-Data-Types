import java.time.LocalDateTime;
public class JulianDate {
	
public static final LocalDateTime DATE0 = LocalDateTime.of(-4712, 1, 1, 12, 0);
	
	int JD;
	
	public JulianDate(int JD) {
		this.JD = JD;
	}
	public JulianDate() {
		this(0);
	}
	public static JulianDate now() {
		LocalDateTime date = LocalDateTime.now();
		
		int Y;
		int M;
		int D = date.getDayOfMonth();
		int B;
		
		if(date.getMonthValue() > 2) {
			 Y = date.getYear();
			 M = date.getMonthValue();
		} else {
			 Y = date.getYear() - 1;
			 M = date.getMonthValue() + 12;
		}
		
		if(Y >= 1582) B = 2 - (Y / 100) + (Y / 400);
		else B = 0;
		
		int JD = (int) ((365.25*(Y + 4716)) + (30.6001*(M + 1)) + D + B - 1524.5);
		return new JulianDate(JD);
	}
	
	public static JulianDate of(int year, int month, int day) {
		int Y;
		int M;
		int D = day;
		int B;
		
		if(month > 2) {
			 Y = year;
			 M = month;
		} else {
			 Y = year - 1;
			 M = month + 12;
		}
		
		if(Y >= 1582) B = 2 - (Y / 100) + (Y / 400);
		else B = 0;
		
		int JD = (int) ((365.25*(Y + 4716)) + (30.6001*(M + 1)) + D + B - 1524.5);
		return new JulianDate(JD);
	}
	
	public static JulianDate of(int year, int month, int day, int hour) {
		int Y;
		int M;
		int D = day;
		int H = hour / 24;
		int B;
		
		if(month > 2) {
			 Y = year;
			 M = month;
		} else {
			 Y = year - 1;
			 M = month + 12;
		}
		
		if(Y >= 1582) B = 2 - (Y / 100) + (Y / 400);
		else B = 0;
		
		int JD = (int) ((365.25*(Y + 4716)) + (30.6001*(M + 1)) + D + H + B - 1524.5);
		return new JulianDate(JD);
	}
	
	public static JulianDate of(int year, int month, int day, int hour, int minute) {
		int Y;
		int M;
		int D = day;
		int H = hour / 24 + minute / 1440;
		int B;
		
		if(month > 2) {
			 Y = year;
			 M = month;
		} else {
			 Y = year - 1;
			 M = month + 12;
		}
		
		if(Y >= 1582) B = 2 - (Y / 100) + (Y / 400);
		else B = 0;
		
		int JD = (int) ((365.25*(Y + 4716)) + (30.6001*(M + 1)) + D + H + B - 1524.5);
		return new JulianDate(JD);
	}
	
	public int get() {
		return JD;
	}
	public int JulianDateYesterday() {
		JulianDate jd = JulianDate.now();
		int yesterday = jd.get() - 1;
		return yesterday;
	}
	public int JulianDateTomorrow() {
		JulianDate jd = JulianDate.now();
		int tomorrow = jd.get() + 1;
		return tomorrow;
	}
	public int JulianDaysBetween() {
		JulianDate jd = JulianDate.now();
		int diff = jd.get() - JD;
		return diff;
	}
}